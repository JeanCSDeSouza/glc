package br.com.bb.persistense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class ExeaPcePbcoSeldId implements Serializable {
    private static final long serialVersionUID = -718103073433240131L;
    @Column(name = "CD_PCE_CMPS_AVS", nullable = false)
    private Short cdPceCmpsAvs;

    @Column(name = "CD_CMPS_SNL_AVS", nullable = false, insertable=false, updatable=false)
    private Integer cdCmpsSnlAvs;

    @Column(name = "CD_CLI_SELD_SNL", nullable = false, insertable=false, updatable=false)
    private Integer cdCliSeldSnl;

    @Column(name = "DT_SEL_PBCO", nullable = false, insertable=false, updatable=false)
    private LocalDate dtSelPbco;

    public Short getCdPceCmpsAvs() {
        return cdPceCmpsAvs;
    }

    public void setCdPceCmpsAvs(Short cdPceCmpsAvs) {
        this.cdPceCmpsAvs = cdPceCmpsAvs;
    }

    public Integer getCdCmpsSnlAvs() {
        return cdCmpsSnlAvs;
    }

    public void setCdCmpsSnlAvs(Integer cdCmpsSnlAvs) {
        this.cdCmpsSnlAvs = cdCmpsSnlAvs;
    }

    public Integer getCdCliSeldSnl() {
        return cdCliSeldSnl;
    }

    public void setCdCliSeldSnl(Integer cdCliSeldSnl) {
        this.cdCliSeldSnl = cdCliSeldSnl;
    }

    public LocalDate getDtSelPbco() {
        return dtSelPbco;
    }

    public void setDtSelPbco(LocalDate dtSelPbco) {
        this.dtSelPbco = dtSelPbco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ExeaPcePbcoSeldId entity = (ExeaPcePbcoSeldId) o;
        return Objects.equals(this.cdCliSeldSnl, entity.cdCliSeldSnl) &&
                Objects.equals(this.dtSelPbco, entity.dtSelPbco) &&
                Objects.equals(this.cdPceCmpsAvs, entity.cdPceCmpsAvs) &&
                Objects.equals(this.cdCmpsSnlAvs, entity.cdCmpsSnlAvs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdCliSeldSnl, dtSelPbco, cdPceCmpsAvs, cdCmpsSnlAvs);
    }

}