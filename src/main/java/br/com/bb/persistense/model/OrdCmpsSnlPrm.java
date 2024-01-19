package br.com.bb.persistense.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Entity
@Table(name = "ORD_CMPS_SNL_PRM")
public class OrdCmpsSnlPrm {
    @EmbeddedId
    private OrdCmpsSnlPrmId id;

    @MapsId("cdPrmSnlAvs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "CD_PRM_SNL_AVS", nullable = false)
    private PrmSnlAv cdPrmSnlAvs;

    @Column(name = "NR_SEQL_PRM_AVS", nullable = false)
    private Integer nrSeqlPrmAvs;

    @Column(name = "TS_REG_ORD_CMPS", nullable = false)
    private Instant tsRegOrdCmps;

    @Column(name = "TX_CTU_FXA_PRM_AVS", length = 15)
    private String txCtuFxaPrmAvs;

    public OrdCmpsSnlPrmId getId() {
        return id;
    }

    public void setId(OrdCmpsSnlPrmId id) {
        this.id = id;
    }

    public PrmSnlAv getCdPrmSnlAvs() {
        return cdPrmSnlAvs;
    }

    public void setCdPrmSnlAvs(PrmSnlAv cdPrmSnlAvs) {
        this.cdPrmSnlAvs = cdPrmSnlAvs;
    }

    public Integer getNrSeqlPrmAvs() {
        return nrSeqlPrmAvs;
    }

    public void setNrSeqlPrmAvs(Integer nrSeqlPrmAvs) {
        this.nrSeqlPrmAvs = nrSeqlPrmAvs;
    }

    public Instant getTsRegOrdCmps() {
        return tsRegOrdCmps;
    }

    public void setTsRegOrdCmps(Instant tsRegOrdCmps) {
        this.tsRegOrdCmps = tsRegOrdCmps;
    }

    public String getTxCtuFxaPrmAvs() {
        return txCtuFxaPrmAvs;
    }

    public void setTxCtuFxaPrmAvs(String txCtuFxaPrmAvs) {
        this.txCtuFxaPrmAvs = txCtuFxaPrmAvs;
    }

}