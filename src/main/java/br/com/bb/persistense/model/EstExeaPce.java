package br.com.bb.persistense.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "EST_EXEA_PCE")
public class EstExeaPce {
    @Id
    @Column(name = "CD_EST_EXEA_PCE", nullable = false)
    private Short id;

    @Column(name = "TX_EST_EXEA_PCE", nullable = false, length = 50)
    private String txEstExeaPce;

    @OneToMany(mappedBy = "cdEstExeaPce")
    private Set<ExeaPcePbcoSeld> exeaPcePbcoSelds = new LinkedHashSet<>();

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTxEstExeaPce() {
        return txEstExeaPce;
    }

    public void setTxEstExeaPce(String txEstExeaPce) {
        this.txEstExeaPce = txEstExeaPce;
    }

    public Set<ExeaPcePbcoSeld> getExeaPcePbcoSelds() {
        return exeaPcePbcoSelds;
    }

    public void setExeaPcePbcoSelds(Set<ExeaPcePbcoSeld> exeaPcePbcoSelds) {
        this.exeaPcePbcoSelds = exeaPcePbcoSelds;
    }

}