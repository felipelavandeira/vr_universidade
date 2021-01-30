package com.lavandeira.vr_universidade.model;

import com.lavandeira.vr_universidade.model.enumerated.Period;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 *
 * @author felipelavandeira
 */
@Entity
@Table(name = "tb_curso")
public class Course implements Serializable {

    private Long id;
    private String description;
    private Integer duration;
    private Period period;
    private Integer studentsQty;
    private Integer hoursQty;
    private List<Discipline> disciplines;

    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "curso_generator", sequenceName = "seq_curso")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "descricao")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "duracao")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Enumerated
    @Column(name = "periodo")
    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    @Column(name = "qtd_alunos")
    public Integer getStudentsQty() {
        return studentsQty;
    }

    public void setStudentsQty(Integer studentsQty) {
        this.studentsQty = studentsQty;
    }

    @Column(name = "carga_horaria")
    @Min(value = 20)
    @Max(value = 40)
    public Integer getHoursQty() {
        return hoursQty;
    }

    public void setHoursQty(Integer hoursQty) {
        this.hoursQty = hoursQty;
    }

    @ManyToMany
    @JoinTable(
            name = "disciplina_curso",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

}
