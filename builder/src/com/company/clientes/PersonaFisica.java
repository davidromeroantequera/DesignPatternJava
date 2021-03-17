package com.company.clientes;

public class PersonaFisica {
    private final String nombre;
    private final String apellido_paterno;
    private final String apellido_materno;
    private final String rfc;

    private PersonaFisica (Builder builder) {
        this.nombre = builder.nombre;
        this.apellido_paterno = builder.apellido_paterno;
        this.apellido_materno = builder.apellido_materno;
        this.rfc = builder.rfc;
    }

    public static Builder crearPersonaFisica() {
        return new Builder();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public String getRfc() {
        return rfc;
    }

    public static class Builder {
        private String nombre;
        private String apellido_paterno;
        private String apellido_materno;
        private String rfc;

        private Builder() {}

        public Builder conNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder conApellidoMaterno(String apellido_materno) {
            this.apellido_materno = apellido_materno;
            return this;
        }

        public Builder conApellidoPaterno(String appelido_paterno) {
            this.apellido_paterno = appelido_paterno;
            return this;
        }

        public Builder conRFC(String rfc) {
            this.rfc = rfc;
            return this;
        }

        public PersonaFisica construir() {
            return new PersonaFisica(this);
        }
    }
}
