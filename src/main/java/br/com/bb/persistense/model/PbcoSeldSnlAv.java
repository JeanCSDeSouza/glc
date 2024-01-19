package br.com.bb.persistense.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "PBCO_SELD_SNL_AVS")
public class PbcoSeldSnlAv {
    @EmbeddedId
    private PbcoSeldSnlAvId id;

    @Column(name = "CD_PRF_SUP_JRDT", nullable = false)
    private Short cdPrfSupJrdt;

    @Column(name = "CD_PRF_AG_CAD", nullable = false)
    private Integer cdPrfAgCad;

    @OneToMany(mappedBy = "pbcoSeldSnlAvs")
    private Set<ExeaPcePbcoSeld> exeaPcePbcoSelds = new LinkedHashSet<>();

    public PbcoSeldSnlAvId getId() {
        return id;
    }

    public void setId(PbcoSeldSnlAvId id) {
        this.id = id;
    }

    public Short getCdPrfSupJrdt() {
        return cdPrfSupJrdt;
    }

    public void setCdPrfSupJrdt(Short cdPrfSupJrdt) {
        this.cdPrfSupJrdt = cdPrfSupJrdt;
    }

    public Integer getCdPrfAgCad() {
        return cdPrfAgCad;
    }

    public void setCdPrfAgCad(Integer cdPrfAgCad) {
        this.cdPrfAgCad = cdPrfAgCad;
    }

    public Set<ExeaPcePbcoSeld> getExeaPcePbcoSelds() {
        return exeaPcePbcoSelds;
    }

    public void setExeaPcePbcoSelds(Set<ExeaPcePbcoSeld> exeaPcePbcoSelds) {
        this.exeaPcePbcoSelds = exeaPcePbcoSelds;
    }

}