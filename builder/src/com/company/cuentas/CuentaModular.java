package com.company.cuentas;

import com.company.clientes.Contacto;
import com.company.clientes.Direccion;
import com.company.clientes.PersonaFisica;

public class CuentaModular implements Cuenta {
    Direccion direccion;
    PersonaFisica cliente;
    Contacto informacionContacto;

    private CuentaModular(Builder builder) {
        this.direccion = builder.direccion;
        this.cliente = builder.cliente;
        this.informacionContacto = builder.informacionContacto;
    }

    public static Builder crearCuenta() {
        return new Builder();
    }


    @Override
    public String identidad() {
        return cliente.getNombre() + " " + cliente.getApellido_paterno() + " " + cliente.getApellido_materno() + "\n"
                + "RFC: " + cliente.getRfc();
    }

    @Override
    public String contacto() {
        return "Teléfono; " + informacionContacto.getTelefono() + "\n"
                + "Celular: " + informacionContacto.getCelular() + "\n"
                + "E-mail; " + informacionContacto.getCorreo();
    }

    @Override
    public String direccion() {
        return "Dirección:" + "\n"
                + direccion.getColonia() + " " + direccion.getNumeroExterno()
                + (direccion.getNumeroInterno() != null ? direccion.getNumeroInterno() : " ")
                + direccion.getColonia() + ". " + direccion.getEstado() + "\n"
                + direccion.getCodigoPostal();
    }

    public static class Builder {
        private Direccion direccion;
        private PersonaFisica cliente;
        private Contacto informacionContacto;

        private Builder() {}

        public Builder identidadCliente(PersonaFisica cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder conDireccion(Direccion direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder conInformacionContacto(Contacto informacionContacto) {
            this.informacionContacto = informacionContacto;
            return this;
        }

        public CuentaModular crear() {
            return new CuentaModular(this);
        }
    }
}
