package br.com.bb.persistense.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;

public class CrtcSnlAvDto {
    @NotNull
    private Integer id;
    @NotEmpty
    private String nmCrtc;
    @NotNull
    private Instant tsAtlCrtc;
    @NotEmpty
    private String cdUsuRspCrtc;

    public CrtcSnlAvDto() {
    }

    public CrtcSnlAvDto(Builder builder) {
        this.id = builder.id;
        this.nmCrtc = builder.nmCrtc;
        this.tsAtlCrtc = builder.tsAtlCrtc;
        this.cdUsuRspCrtc = builder.cdUsuRspCrtc;
    }

    public static class Builder{
        private Integer id;
        private String nmCrtc;
        private Instant tsAtlCrtc;
        private String cdUsuRspCrtc;

        public Builder(){
        }

        public CrtcSnlAvDto build(){
            return new CrtcSnlAvDto(this);
        }

        public CrtcSnlAvDto.Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public CrtcSnlAvDto.Builder nmCrtc(String nmCrtc) {
            this.nmCrtc = nmCrtc;
            return this;
        }

        public CrtcSnlAvDto.Builder tsAtlCrtc(Instant tsAtlCrtc) {
            this.tsAtlCrtc = tsAtlCrtc;
            return this;
        }

        public CrtcSnlAvDto.Builder cdUsuRspCrtc(String cdUsuRspCrtc) {
            this.cdUsuRspCrtc = cdUsuRspCrtc;
            return this;
        }
    }
}
