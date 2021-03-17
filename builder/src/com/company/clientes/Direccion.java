package com.company.clientes;

public class Direccion {
    private final int numero_externo;
    private final Integer numero_interno;
    private final String colonia;
    private final String estado;
    private final int codigo_postal;

    private Direccion(Builder builder) {
        this.numero_externo = builder.numero_externo;
        this.numero_interno = builder.numero_interno;
        this.colonia = builder.colonia;
        this.estado = builder.estado;
        this.codigo_postal = builder.codigo_postal;
    }

    public int getNumeroExterno() {
        return numero_externo;
    }

    public Integer getNumeroInterno() {
        return numero_interno;
    }

    public String getColonia() {
        return colonia;
    }

    public String getEstado() {
        return estado;
    }

    public int getCodigoPostal() {
        return codigo_postal;
    }

    public static Builder crear() {
        return new Builder();
    }

    public static class Builder {
        private int numero_externo;
        private Integer numero_interno = null;
        private String colonia;
        private String estado = "Nuevo Leon";
        private int codigo_postal;

        private Builder () {}

        public Builder conNumeroExterno(int numero) {
            this.numero_externo = numero;
            return this;
        }

        public Builder conNumeroInterno(int numero) {
            this.numero_interno = numero;
            return this;
        }

        public Builder conColonia(String colonia) {
            this.colonia = colonia;
            return this;
        }

        public Builder conEstado(String estado) {
            this.estado = estado;
            return this;
        }

        public Builder conCodigoPostal(int codigo_postal) {
            this.codigo_postal = codigo_postal;
            return this;
        }

        public Direccion construir() {
            return new Direccion(this);
        }
    }
}
