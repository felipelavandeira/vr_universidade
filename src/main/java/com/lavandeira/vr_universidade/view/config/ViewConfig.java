package com.lavandeira.vr_universidade.view.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipelavandeira
 */
public final class ViewConfig implements IViewConfig {

    public ViewConfig() {
        try {
            loadProperties();
        } catch (IOException ex) {
            Logger.getLogger(ViewConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void loadProperties() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILENAME);
        if (inputStream != null) {
            properties.load(inputStream);
        } else {
            throw new FileNotFoundException("O arquivo de configurações não foi encontrado");
        }
    }
    
    public String getConfigValue(String propertyKey){
        return properties.getProperty(propertyKey);
    }
    
    public String getEndpointAddress(String propertyKey){
        return properties.getProperty("endpoints.base").concat(properties.getProperty(propertyKey));
    }

}
