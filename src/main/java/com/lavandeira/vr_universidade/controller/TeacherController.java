package com.lavandeira.vr_universidade.controller;

import com.lavandeira.vr_universidade.model.Teacher;
import com.lavandeira.vr_universidade.model.repository.TeacherRepository;
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
@RequestMapping("/professores")
public class TeacherController {
    
    @Autowired
    private TeacherRepository repository;
    
    @GetMapping
    public ResponseEntity<List<Teacher>> index(){
        List<Teacher> teachers = repository.findAll();
        return teachers != null ? ResponseEntity.ok(teachers) : ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public ResponseEntity<Teacher> create(@RequestBody Teacher teacher){
        Teacher response = repository.save(teacher);
        return teacher != null ? ResponseEntity.ok(teacher) : ResponseEntity.badRequest().build();
    }
}
