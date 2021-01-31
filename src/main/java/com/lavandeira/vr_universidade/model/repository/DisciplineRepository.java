package com.lavandeira.vr_universidade.model.repository;

import com.lavandeira.vr_universidade.model.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author felipelavandeira
 */
@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Long> {
    
}
