package br.com.bb.persistense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PCE")
public class Pce {
    @Id
    @Column(name = "CD_PCE", nullable = false)
    private Short id;

    @Column(name = "NM_PCE", nullable = false, length = 50)
    private String nmPce;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNmPce() {
        return nmPce;
    }

    public void setNmPce(String nmPce) {
        this.nmPce = nmPce;
    }

}