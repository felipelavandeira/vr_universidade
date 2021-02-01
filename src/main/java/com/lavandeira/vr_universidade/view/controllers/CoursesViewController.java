package com.lavandeira.vr_universidade.view.controllers;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lavandeira.vr_universidade.model.Course;
import com.lavandeira.vr_universidade.view.util.JsonConverter;
import java.awt.TrayIcon;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipelavandeira
 */
public class CoursesViewController implements IViewController {

    private final JTable coursesTable;
    private final String coursesEndoint;

    public CoursesViewController(JTable coursesTable) {
        this.coursesTable = coursesTable;
        this.coursesEndoint = config.getEndpointAddress("endpoints.courses");
    }

    public void fillTable() {
        cleanTable();
        DefaultTableModel model = (DefaultTableModel) coursesTable.getModel();
        List<Course> courses = getCoursesList();
        if (courses == null) {
            return;
        }
        courses.stream().map(course -> {
            Object[] row = new Object[coursesTable.getColumnCount()];
            row[0] = course.getId();
            row[1] = course.getDescription();
            row[2] = course.getDuration();
            row[3] = course.getPeriod();
            row[4] = course.getStudentsQty();
            row[5] = course.getHoursQty();
            return row;
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        coursesTable.updateUI();
    }

    public void createCourse(Course course) {
        JsonObject response = JsonConverter.postJsonObjectToURL(coursesEndoint, course);
        if (response != null) {
            Course createdCourse = (Course) JsonConverter.convertFromObject(response, Course.class);
            JOptionPane.showMessageDialog(null, "ID do curso: " + createdCourse.getId(), "Curso criado com sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        fillTable();
    }

    private List<Course> getCoursesList() {
        JsonArray jsonCourses = JsonConverter.getJsonArrayFromURL(coursesEndoint);
        if (jsonCourses != null) {
            List<Course> list = (List<Course>) JsonConverter.convertFromArray(jsonCourses, Course.class);
            return list;
        }
        return null;
    }

    private void cleanTable() {
        DefaultTableModel coursesModel = (DefaultTableModel) coursesTable.getModel();        
        coursesModel.getDataVector().removeAllElements();
        coursesTable.updateUI();
    }

}
