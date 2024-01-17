package br.com.bb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "MTA_SNL_AVS")
public class MtaSnlAv {
    @Id
    @Column(name = "CD_MTA_AVS", nullable = false)
    private Integer id;

    @Column(name = "NM_MTA_AVS", nullable = false, length = 50)
    private String nmMtaAvs;

    @Column(name = "TX_DCR_MTA_AVS", nullable = false, length = 50)
    private String txDcrMtaAvs;

    @Column(name = "TS_ATL_MTA_AVS", nullable = false)
    private Instant tsAtlMtaAvs;

    @Column(name = "CD_USU_RSP_MTA_AVS", nullable = false, length = 8)
    private String cdUsuRspMtaAvs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNmMtaAvs() {
        return nmMtaAvs;
    }

    public void setNmMtaAvs(String nmMtaAvs) {
        this.nmMtaAvs = nmMtaAvs;
    }

    public String getTxDcrMtaAvs() {
        return txDcrMtaAvs;
    }

    public void setTxDcrMtaAvs(String txDcrMtaAvs) {
        this.txDcrMtaAvs = txDcrMtaAvs;
    }

    public Instant getTsAtlMtaAvs() {
        return tsAtlMtaAvs;
    }

    public void setTsAtlMtaAvs(Instant tsAtlMtaAvs) {
        this.tsAtlMtaAvs = tsAtlMtaAvs;
    }

    public String getCdUsuRspMtaAvs() {
        return cdUsuRspMtaAvs;
    }

    public void setCdUsuRspMtaAvs(String cdUsuRspMtaAvs) {
        this.cdUsuRspMtaAvs = cdUsuRspMtaAvs;
    }

}