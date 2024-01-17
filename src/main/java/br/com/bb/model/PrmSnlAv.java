package br.com.bb.model;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "PRM_SNL_AVS")
public class PrmSnlAv {
    @Id
    @Column(name = "CD_PRM_SNL_AVS", nullable = false)
    private Integer id;

    @Column(name = "NM_PRM_SNL_AVS", nullable = false, length = 50)
    private String nmPrmSnlAvs;

    @Column(name = "TS_ATL_PRM", nullable = false)
    private Instant tsAtlPrm;

    @Column(name = "CD_USU_RSP_PRM", nullable = false, length = 8)
    private String cdUsuRspPrm;

    @Column(name = "NM_COL", nullable = false, length = 18)
    private String nmCol;

    @Column(name = "NM_ENT", nullable = false, length = 18)
    private String nmEnt;

    @Column(name = "NM_OWN", nullable = false, length = 6)
    private String nmOwn;

    @Column(name = "NM_TIP_DADO", nullable = false, length = 18)
    private String nmTipDado;

    @Column(name = "IN_NULO", nullable = false, length = 1)
    private String inNulo;

    @Column(name = "NR_TAM_TIP_DADO", nullable = false)
    private Integer nrTamTipDado;

    @OneToMany(mappedBy = "prmSnlAv")
    private Set<OrdCmpsSnlPrm> ordCmpsSnlPrms = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNmPrmSnlAvs() {
        return nmPrmSnlAvs;
    }

    public void setNmPrmSnlAvs(String nmPrmSnlAvs) {
        this.nmPrmSnlAvs = nmPrmSnlAvs;
    }

    public Instant getTsAtlPrm() {
        return tsAtlPrm;
    }

    public void setTsAtlPrm(Instant tsAtlPrm) {
        this.tsAtlPrm = tsAtlPrm;
    }

    public String getCdUsuRspPrm() {
        return cdUsuRspPrm;
    }

    public void setCdUsuRspPrm(String cdUsuRspPrm) {
        this.cdUsuRspPrm = cdUsuRspPrm;
    }

    public String getNmCol() {
        return nmCol;
    }

    public void setNmCol(String nmCol) {
        this.nmCol = nmCol;
    }

    public String getNmEnt() {
        return nmEnt;
    }

    public void setNmEnt(String nmEnt) {
        this.nmEnt = nmEnt;
    }

    public String getNmOwn() {
        return nmOwn;
    }

    public void setNmOwn(String nmOwn) {
        this.nmOwn = nmOwn;
    }

    public String getNmTipDado() {
        return nmTipDado;
    }

    public void setNmTipDado(String nmTipDado) {
        this.nmTipDado = nmTipDado;
    }

    public String getInNulo() {
        return inNulo;
    }

    public void setInNulo(String inNulo) {
        this.inNulo = inNulo;
    }

    public Integer getNrTamTipDado() {
        return nrTamTipDado;
    }

    public void setNrTamTipDado(Integer nrTamTipDado) {
        this.nrTamTipDado = nrTamTipDado;
    }

    public Set<OrdCmpsSnlPrm> getOrdCmpsSnlPrms() {
        return ordCmpsSnlPrms;
    }

    public void setOrdCmpsSnlPrms(Set<OrdCmpsSnlPrm> ordCmpsSnlPrms) {
        this.ordCmpsSnlPrms = ordCmpsSnlPrms;
    }

}