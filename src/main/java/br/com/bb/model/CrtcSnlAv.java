package br.com.bb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "CRTC_SNL_AVS")
public class CrtcSnlAv {
    @Id
    @Column(name = "CD_CRTC", nullable = false)
    private Integer id;

    @Column(name = "NM_CRTC", nullable = false, length = 20)
    private String nmCrtc;

    @Column(name = "TS_ATL_CRTC", nullable = false)
    private Instant tsAtlCrtc;

    @Column(name = "CD_USU_RSP_CRTC", nullable = false, length = 8)
    private String cdUsuRspCrtc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNmCrtc() {
        return nmCrtc;
    }

    public void setNmCrtc(String nmCrtc) {
        this.nmCrtc = nmCrtc;
    }

    public Instant getTsAtlCrtc() {
        return tsAtlCrtc;
    }

    public void setTsAtlCrtc(Instant tsAtlCrtc) {
        this.tsAtlCrtc = tsAtlCrtc;
    }

    public String getCdUsuRspCrtc() {
        return cdUsuRspCrtc;
    }

    public void setCdUsuRspCrtc(String cdUsuRspCrtc) {
        this.cdUsuRspCrtc = cdUsuRspCrtc;
    }

}