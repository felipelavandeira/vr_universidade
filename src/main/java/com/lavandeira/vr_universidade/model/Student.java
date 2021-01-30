package com.lavandeira.vr_universidade.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author felipelavandeira
 */
@Entity
@Table(name = "tb_aluno")
public class Student implements Serializable {

    private Long id;
    private Long registryNumber;
    private String name;
    private String rg;
    private String cpf;
    private List<Discipline> disciplines;

    @Id
    @Column(name = "id_aluno")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "matricula")
    public Long getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(Long registryNumber) {
        this.registryNumber = registryNumber;
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

    @ManyToMany
    @JoinTable(
            name = "aluno_dsiciplina",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
    
    
}
