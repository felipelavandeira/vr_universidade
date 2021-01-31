package com.lavandeira.vr_universidade.model.repository;

import com.lavandeira.vr_universidade.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author felipelavandeira
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
