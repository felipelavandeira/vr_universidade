package com.lavandeira.vr_universidade.controller;

import com.lavandeira.vr_universidade.model.Course;
import com.lavandeira.vr_universidade.model.repository.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felipelavandeira
 */
@RestController
@RequestMapping("/cursos")
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping
    public ResponseEntity<List<Course>> index() {
        List<Course> courses = repository.findAll();
        return courses != null ? ResponseEntity.ok(courses) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        Course response = repository.save(course);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }
}
