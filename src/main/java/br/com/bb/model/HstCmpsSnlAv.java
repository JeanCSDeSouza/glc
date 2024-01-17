package br.com.bb.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "HST_CMPS_SNL_AVS")
public class HstCmpsSnlAv {
    @EmbeddedId
    private HstCmpsSnlAvId id;

    @Column(name = "TS_ATL_CMPS")
    private Instant tsAtlCmps;

    @Column(name = "IN_CMPS_ATV", nullable = false, length = 1)
    private String inCmpsAtv;

    @Column(name = "CD_CRTC", nullable = false)
    private Integer cdCrtc;

    @Column(name = "CD_MTA_AVS", nullable = false)
    private Integer cdMtaAvs;

    @Column(name = "CD_USU_RSP_CMPS", length = 8)
    private String cdUsuRspCmps;

    @Column(name = "CD_USU_RSP_INCL", nullable = false, length = 8)
    private String cdUsuRspIncl;

    @Column(name = "TS_INCL_CMPS", nullable = false)
    private Instant tsInclCmps;

    @Column(name = "CD_EST_CMPS", nullable = false)
    private Short cdEstCmps;

    @Column(name = "CD_USU_RSP_ALT", nullable = false, length = 8)
    private String cdUsuRspAlt;

    public HstCmpsSnlAvId getId() {
        return id;
    }

    public void setId(HstCmpsSnlAvId id) {
        this.id = id;
    }

    public Instant getTsAtlCmps() {
        return tsAtlCmps;
    }

    public void setTsAtlCmps(Instant tsAtlCmps) {
        this.tsAtlCmps = tsAtlCmps;
    }

    public String getInCmpsAtv() {
        return inCmpsAtv;
    }

    public void setInCmpsAtv(String inCmpsAtv) {
        this.inCmpsAtv = inCmpsAtv;
    }

    public Integer getCdCrtc() {
        return cdCrtc;
    }

    public void setCdCrtc(Integer cdCrtc) {
        this.cdCrtc = cdCrtc;
    }

    public Integer getCdMtaAvs() {
        return cdMtaAvs;
    }

    public void setCdMtaAvs(Integer cdMtaAvs) {
        this.cdMtaAvs = cdMtaAvs;
    }

    public String getCdUsuRspCmps() {
        return cdUsuRspCmps;
    }

    public void setCdUsuRspCmps(String cdUsuRspCmps) {
        this.cdUsuRspCmps = cdUsuRspCmps;
    }

    public String getCdUsuRspIncl() {
        return cdUsuRspIncl;
    }

    public void setCdUsuRspIncl(String cdUsuRspIncl) {
        this.cdUsuRspIncl = cdUsuRspIncl;
    }

    public Instant getTsInclCmps() {
        return tsInclCmps;
    }

    public void setTsInclCmps(Instant tsInclCmps) {
        this.tsInclCmps = tsInclCmps;
    }

    public Short getCdEstCmps() {
        return cdEstCmps;
    }

    public void setCdEstCmps(Short cdEstCmps) {
        this.cdEstCmps = cdEstCmps;
    }

    public String getCdUsuRspAlt() {
        return cdUsuRspAlt;
    }

    public void setCdUsuRspAlt(String cdUsuRspAlt) {
        this.cdUsuRspAlt = cdUsuRspAlt;
    }

}