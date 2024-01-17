package br.com.bb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class HstCmpsPceAvId implements Serializable {
    private static final long serialVersionUID = -8907456346412212272L;
    @Column(name = "CD_CMPS_SNL_AVS", nullable = false)
    private Integer cdCmpsSnlAvs;

    @Column(name = "CD_PCE_CMPS_AVS", nullable = false)
    private Short cdPceCmpsAvs;

    @Column(name = "TS_INCL_HST", nullable = false)
    private Instant tsInclHst;

    public Integer getCdCmpsSnlAvs() {
        return cdCmpsSnlAvs;
    }

    public void setCdCmpsSnlAvs(Integer cdCmpsSnlAvs) {
        this.cdCmpsSnlAvs = cdCmpsSnlAvs;
    }

    public Short getCdPceCmpsAvs() {
        return cdPceCmpsAvs;
    }

    public void setCdPceCmpsAvs(Short cdPceCmpsAvs) {
        this.cdPceCmpsAvs = cdPceCmpsAvs;
    }

    public Instant getTsInclHst() {
        return tsInclHst;
    }

    public void setTsInclHst(Instant tsInclHst) {
        this.tsInclHst = tsInclHst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        HstCmpsPceAvId entity = (HstCmpsPceAvId) o;
        return Objects.equals(this.tsInclHst, entity.tsInclHst) &&
                Objects.equals(this.cdPceCmpsAvs, entity.cdPceCmpsAvs) &&
                Objects.equals(this.cdCmpsSnlAvs, entity.cdCmpsSnlAvs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tsInclHst, cdPceCmpsAvs, cdCmpsSnlAvs);
    }

}