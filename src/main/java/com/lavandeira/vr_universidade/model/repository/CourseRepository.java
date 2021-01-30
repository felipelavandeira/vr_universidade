package com.lavandeira.vr_universidade.model.repository;

import com.lavandeira.vr_universidade.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author felipelavandeira
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
