package br.com.bb.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "HST_CMPS_PCE_AVS")
public class HstCmpsPceAv {
    @EmbeddedId
    private HstCmpsPceAvId id;

    @Column(name = "TS_CMPS_PCE", nullable = false)
    private Instant tsCmpsPce;

    @Column(name = "IN_CMPS_PCE_ATI", nullable = false, length = 1)
    private String inCmpsPceAti;

    @Column(name = "CD_USU_CMPS_PCE", nullable = false, length = 8)
    private String cdUsuCmpsPce;

    public HstCmpsPceAvId getId() {
        return id;
    }

    public void setId(HstCmpsPceAvId id) {
        this.id = id;
    }

    public Instant getTsCmpsPce() {
        return tsCmpsPce;
    }

    public void setTsCmpsPce(Instant tsCmpsPce) {
        this.tsCmpsPce = tsCmpsPce;
    }

    public String getInCmpsPceAti() {
        return inCmpsPceAti;
    }

    public void setInCmpsPceAti(String inCmpsPceAti) {
        this.inCmpsPceAti = inCmpsPceAti;
    }

    public String getCdUsuCmpsPce() {
        return cdUsuCmpsPce;
    }

    public void setCdUsuCmpsPce(String cdUsuCmpsPce) {
        this.cdUsuCmpsPce = cdUsuCmpsPce;
    }

}