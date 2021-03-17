package com.company.clientes;

public class Contacto {
    private final String telefono;
    private final String celular;
    private final String correo;

    private Contacto(Builder builder) {
        this.telefono = builder.telefono;
        this.celular = builder.celular;
        this.correo = builder.correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public static Builder construir() {
        return new Builder();
    }

    public static class Builder {
        private String telefono;
        private String celular;
        private String correo;

        private Builder() {}

        public Builder conTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder conCelular(String celular) {
            this.celular = celular;
            return this;
        }

        public Builder conEmail(String correo) {
            this.correo = correo;
            return this;
        }

        public Contacto crear() {
            return new Contacto(this);
        }
    }
}
