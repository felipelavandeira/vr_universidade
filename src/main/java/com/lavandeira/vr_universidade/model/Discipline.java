package com.lavandeira.vr_universidade.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author felipelavandeira
 */
@Entity
@Table(name = "tb_disciplina")
public class Discipline implements Serializable {

    private Long id;
    private String description;
    private String matrix;
    private Integer vacancyLimit;
    private Teacher teacher;
    private String weekDay;
    private Integer hoursQty;
    private List<Course> courses;
    private List<Student> students;

    @Id
    @Column(name = "id_disciplina")
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

    @Column(name = "ementa", length = 4000)
    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    @Column(name = "limite_vagas")
    public Integer getVacancyLimit() {
        return vacancyLimit;
    }

    public void setVacancyLimit(Integer vacancyLimit) {
        this.vacancyLimit = vacancyLimit;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_professor", referencedColumnName = "id_professor")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Column(name = "dia_semana")
    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    @Column(name = "carga_horaria")
    public Integer getHoursQty() {
        return hoursQty;
    }

    public void setHoursQty(Integer hoursQty) {
        this.hoursQty = hoursQty;
    }

    @ManyToMany(mappedBy = "disciplines")
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @ManyToMany(mappedBy = "disciplines")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    

}
