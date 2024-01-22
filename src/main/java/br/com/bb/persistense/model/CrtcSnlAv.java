package br.com.bb.persistense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "CRTC_SNL_AVS")
public class CrtcSnlAv{
    @Id
    @Column(name = "CD_CRTC", nullable = false)
    private Integer id;

    @Column(name = "NM_CRTC", nullable = false, length = 20)
    private String nmCrtc;

    @Column(name = "TS_ATL_CRTC", nullable = false)
    private Instant tsAtlCrtc;

    @Column(name = "CD_USU_RSP_CRTC", nullable = false, length = 8)
    private String cdUsuRspCrtc;

    /**
     * Construtor padrão definido para que posssa ser utilizada pelo framework de ORM
     */
    public CrtcSnlAv() {
    }

    /**
     * Construtor privado para uso da classe BUilder
     * @param builder Objeto da classe internta Builder.
     */
    private CrtcSnlAv(Builder builder) {
        this.id = builder.id;
        this.nmCrtc = builder.nmCrtc;
        this.tsAtlCrtc = builder.tsAtlCrtc;
        this.cdUsuRspCrtc = builder.cdUsuRspCrtc;
    }

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
    /*
    * Classe interna que implementa o padrão builder permitindo que a classe extrena seja
    * criada com o padrão builder().build()
     */
    public static class Builder{
        private Integer id;
        private String nmCrtc;
        private Instant tsAtlCrtc;
        private String cdUsuRspCrtc;

        public Builder(){
        }

        public CrtcSnlAv build(){
            return new CrtcSnlAv(this);
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder nmCrtc(String nmCrtc) {
            this.nmCrtc = nmCrtc;
            return this;
        }

        public Builder tsAtlCrtc(Instant tsAtlCrtc) {
            this.tsAtlCrtc = tsAtlCrtc;
            return this;
        }

        public Builder cdUsuRspCrtc(String cdUsuRspCrtc) {
            this.cdUsuRspCrtc = cdUsuRspCrtc;
            return this;
        }
    }

}