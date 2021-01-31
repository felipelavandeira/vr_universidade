package com.lavandeira.vr_universidade.view.controllers;

import com.lavandeira.vr_universidade.model.Course;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 *
 * @author felipelavandeira
 */
public class CoursesViewController {
    
    private final String coursesUrl = "";
    private final JTable coursesTable;

    public CoursesViewController(JTable coursesTable) {
        this.coursesTable = coursesTable;
    }
    
    public void fillTable(){
        TableModel model = coursesTable.getModel();
        List<Course> courses = getCoursesList();
    }

    private List<Course> getCoursesList() {
        return null;
    }
    
}
