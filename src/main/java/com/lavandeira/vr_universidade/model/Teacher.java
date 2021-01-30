package com.lavandeira.vr_universidade.model;

import com.lavandeira.vr_universidade.model.enumerated.Title;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author felipelavandeira
 */
@Entity
@Table(name = "tb_professor")
public class Teacher implements Serializable {

    private Long id;
    private String name;
    private String rg;
    private String cpf;
    private Title title;
    private List<Discipline> disciplines;

    @Id
    @Column(name = "id_professor")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "nome")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "rg")
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Column(name = "cpf")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Enumerated
    @Column(name = "titulo")
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @OneToMany(mappedBy = "teacher")
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

}
