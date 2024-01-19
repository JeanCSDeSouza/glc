package br.com.bb.persistense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrdCmpsSnlPrmId implements Serializable {
    private static final long serialVersionUID = -900479547928284840L;
    @Column(name = "CD_PRM_SNL_AVS", nullable = false)
    private Integer cdPrmSnlAvs;

    @Column(name = "CD_CMPS_SNL_AVS", nullable = false)
    private Integer cdCmpsSnlAvs;

    public Integer getCdPrmSnlAvs() {
        return cdPrmSnlAvs;
    }

    public void setCdPrmSnlAvs(Integer cdPrmSnlAvs) {
        this.cdPrmSnlAvs = cdPrmSnlAvs;
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
        OrdCmpsSnlPrmId entity = (OrdCmpsSnlPrmId) o;
        return Objects.equals(this.cdPrmSnlAvs, entity.cdPrmSnlAvs) &&
                Objects.equals(this.cdCmpsSnlAvs, entity.cdCmpsSnlAvs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdPrmSnlAvs, cdCmpsSnlAvs);
    }

}