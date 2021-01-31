package com.lavandeira.vr_universidade.controller;

import com.lavandeira.vr_universidade.model.Discipline;
import com.lavandeira.vr_universidade.model.repository.DisciplineRepository;
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
@RequestMapping("/disciplinas")
public class DisciplineController {
    
    @Autowired
    private DisciplineRepository repository;
    
    @GetMapping
    public ResponseEntity<List<Discipline>> index(){
        List<Discipline> disciplines = repository.findAll();
        return disciplines != null ? ResponseEntity.ok(disciplines) : ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public ResponseEntity<Discipline> create(@RequestBody Discipline discipline){
        Discipline response = repository.save(discipline);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }
    
}
