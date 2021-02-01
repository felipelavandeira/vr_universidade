package com.lavandeira.vr_universidade.view.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.lavandeira.vr_universidade.view.controllers.CoursesViewController;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipelavandeira
 */
public class JsonConverter {

    public static List<? extends Object> convertFromArray(JsonArray jsonArray, Class<? extends Object> toClass) {
        List<Object> list = new ArrayList<>();
        for (JsonElement jsonObject : jsonArray) {
            list.add(convertFromObject(jsonObject, toClass));
        }
        return list;
    }

    public static Object convertFromObject(JsonElement element, Class<? extends Object> toClass) {
        try {
            Object toObject = toClass.getConstructors()[0].newInstance();
            JsonObject jsonObject = element.getAsJsonObject();
            for (Field field : toClass.getDeclaredFields()) {
                field.setAccessible(true);
                String fieldName = field.getName();
                Object fieldValue = getFieldValue(field, jsonObject.get(fieldName));
                field.set(toObject, fieldValue);
            }
            return toObject;
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static JsonArray getJsonArrayFromURL(String endpoint) {
        try {
            URL url = new URL(endpoint);
            URLConnection request = url.openConnection();
            request.connect();
            InputStreamReader reader = new InputStreamReader((InputStream) request.getContent());
            JsonElement jsonElement = JsonParser.parseReader(reader);
            return jsonElement.getAsJsonArray();
        } catch (JsonIOException | JsonSyntaxException | IOException ex) {
            Logger.getLogger(CoursesViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static JsonObject postJsonObjectToURL(String endpoint, Object postObject) {
        try {
            URL url = new URL(endpoint);
            Gson gson = new Gson();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);
            String jsonObjectStr = gson.toJson(postObject);
            OutputStream output = connection.getOutputStream();
            byte[] input = jsonObjectStr.getBytes("utf-8");
            output.write(input, 0, input.length);
            InputStreamReader reader = new InputStreamReader(connection.getInputStream(), "utf-8");
            JsonElement jsonElement = JsonParser.parseReader(reader);
            return jsonElement.getAsJsonObject();
        } catch (IOException ex) {
            Logger.getLogger(JsonConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static Object getFieldValue(Field field, JsonElement jsonObject) {
        Class fieldType = field.getType();

        if (fieldType.isAssignableFrom(Long.class)) {
            return jsonObject.getAsLong();
        }

        if (fieldType.isAssignableFrom(Double.class)) {
            return jsonObject.getAsDouble();
        }

        if (fieldType.isAssignableFrom(Integer.class)) {
            return jsonObject.getAsInt();
        }

        if (fieldType.isAssignableFrom(List.class)) {
            ParameterizedType listType = (ParameterizedType) field.getGenericType();
            Class<?> listClass = (Class<?>) listType.getActualTypeArguments()[0];
            return JsonConverter.convertFromArray(jsonObject.getAsJsonArray(), listClass);
        }

        if (fieldType.isEnum()) {
            Object[] enumConstants = fieldType.getEnumConstants();
            String enumName = jsonObject.getAsString();
            return getValueFromEnum(enumConstants, enumName);
        }

        return jsonObject.getAsString();
    }

    private static Object getValueFromEnum(Object[] enumConstants, String enumName) {
        Object value = null;
        for (Object enumConstant : enumConstants) {
            if (enumConstant.toString().toLowerCase().equals(enumName.toLowerCase())) {
                return enumConstant;
            }
        }
        return null;
    }

}
