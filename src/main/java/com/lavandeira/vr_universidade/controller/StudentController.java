package com.lavandeira.vr_universidade.controller;

import com.lavandeira.vr_universidade.model.Student;
import com.lavandeira.vr_universidade.model.repository.StudentRepository;
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
@RequestMapping("/alunos")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public ResponseEntity<List<Student>> index() {
        List<Student> students = repository.findAll();
        return students != null ? ResponseEntity.ok(students) : ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student){
        Student response = repository.save(student);
        return student != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }
}
