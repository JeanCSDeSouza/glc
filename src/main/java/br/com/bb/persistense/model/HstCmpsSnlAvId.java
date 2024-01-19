package br.com.bb.persistense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class HstCmpsSnlAvId implements Serializable {
    private static final long serialVersionUID = 5370343489037566197L;
    @Column(name = "CD_CMPS_SNL_AVS", nullable = false)
    private Integer cdCmpsSnlAvs;

    @Column(name = "TS_HST_CMPS_SNL", nullable = false)
    private Instant tsHstCmpsSnl;

    public Integer getCdCmpsSnlAvs() {
        return cdCmpsSnlAvs;
    }

    public void setCdCmpsSnlAvs(Integer cdCmpsSnlAvs) {
        this.cdCmpsSnlAvs = cdCmpsSnlAvs;
    }

    public Instant getTsHstCmpsSnl() {
        return tsHstCmpsSnl;
    }

    public void setTsHstCmpsSnl(Instant tsHstCmpsSnl) {
        this.tsHstCmpsSnl = tsHstCmpsSnl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        HstCmpsSnlAvId entity = (HstCmpsSnlAvId) o;
        return Objects.equals(this.tsHstCmpsSnl, entity.tsHstCmpsSnl) &&
                Objects.equals(this.cdCmpsSnlAvs, entity.cdCmpsSnlAvs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tsHstCmpsSnl, cdCmpsSnlAvs);
    }

}