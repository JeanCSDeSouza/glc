package br.com.bb.persistense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "RSTD_CMPS_SNL_AVS")
public class RstdCmpsSnlAv {
    @Id
    @Column(name = "CD_CMPS_SNL_AVS", nullable = false)
    private Integer id;

    @Column(name = "TX_CTU_PRM", nullable = false, length = 30)
    private String txCtuPrm;

    @Column(name = "TS_REG_RSTD_CMPS", nullable = false)
    private Instant tsRegRstdCmps;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTxCtuPrm() {
        return txCtuPrm;
    }

    public void setTxCtuPrm(String txCtuPrm) {
        this.txCtuPrm = txCtuPrm;
    }

    public Instant getTsRegRstdCmps() {
        return tsRegRstdCmps;
    }

    public void setTsRegRstdCmps(Instant tsRegRstdCmps) {
        this.tsRegRstdCmps = tsRegRstdCmps;
    }

}