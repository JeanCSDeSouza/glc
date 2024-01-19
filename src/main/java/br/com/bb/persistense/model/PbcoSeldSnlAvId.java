package br.com.bb.persistense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class PbcoSeldSnlAvId implements Serializable {
    private static final long serialVersionUID = -4289069861321942739L;
    @Column(name = "CD_CLI_SELD_SNL", nullable = false)
    private Integer cdCliSeldSnl;

    @Column(name = "DT_SEL_PBCO", nullable = false)
    private LocalDate dtSelPbco;

    @Column(name = "CD_CMPS_SNL_AVS", nullable = false)
    private Integer cdCmpsSnlAvs;

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

    public Integer getCdCmpsSnlAvs() {
        return cdCmpsSnlAvs;
    }

    public void setCdCmpsSnlAvs(Integer cdCmpsSnlAvs) {
        this.cdCmpsSnlAvs = cdCmpsSnlAvs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PbcoSeldSnlAvId entity = (PbcoSeldSnlAvId) o;
        return Objects.equals(this.cdCliSeldSnl, entity.cdCliSeldSnl) &&
                Objects.equals(this.dtSelPbco, entity.dtSelPbco) &&
                Objects.equals(this.cdCmpsSnlAvs, entity.cdCmpsSnlAvs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdCliSeldSnl, dtSelPbco, cdCmpsSnlAvs);
    }

}