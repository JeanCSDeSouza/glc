package br.com.bb.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Entity
@Table(name = "EXEA_PCE_PBCO_SELD")
public class ExeaPcePbcoSeld {
    @Column(name = "CD_PCE_CMPS_AVS", nullable = false)
    private Short cdPceCmpsAvs;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "CD_EST_EXEA_PCE", nullable = false)
    private EstExeaPce cdEstExeaPce;

    @Column(name = "TS_EXEA_PCE", nullable = false)
    private Instant tsExeaPce;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "CD_CMPS_SNL_AVS", referencedColumnName = "CD_CMPS_SNL_AVS", nullable = false),
            @JoinColumn(name = "CD_CLI_SELD_SNL", referencedColumnName = "CD_CLI_SELD_SNL", nullable = false),
            @JoinColumn(name = "DT_SEL_PBCO", referencedColumnName = "DT_SEL_PBCO", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PbcoSeldSnlAv pbcoSeldSnlAvs;

    public Short getCdPceCmpsAvs() {
        return cdPceCmpsAvs;
    }

    public void setCdPceCmpsAvs(Short cdPceCmpsAvs) {
        this.cdPceCmpsAvs = cdPceCmpsAvs;
    }

    public EstExeaPce getCdEstExeaPce() {
        return cdEstExeaPce;
    }

    public void setCdEstExeaPce(EstExeaPce cdEstExeaPce) {
        this.cdEstExeaPce = cdEstExeaPce;
    }

    public Instant getTsExeaPce() {
        return tsExeaPce;
    }

    public void setTsExeaPce(Instant tsExeaPce) {
        this.tsExeaPce = tsExeaPce;
    }

    public PbcoSeldSnlAv getPbcoSeldSnlAvs() {
        return pbcoSeldSnlAvs;
    }

    public void setPbcoSeldSnlAvs(PbcoSeldSnlAv pbcoSeldSnlAvs) {
        this.pbcoSeldSnlAvs = pbcoSeldSnlAvs;
    }

}