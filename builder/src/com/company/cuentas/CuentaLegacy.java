package com.company.cuentas;

public class CuentaLegacy implements Cuenta {
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String rfc;
    private String telefono;
    private String celular;
    private String correo;
    private String calle;
    private int numero_externo;
    private Integer numero_interno;
    private String colonia;
    private String estado;
    private int codigo_postal;

    public CuentaLegacy(String nombre,
                        String apellido_paterno,
                        String apellido_materno,
                        String rfc,
                        String telefono,
                        String celular,
                        String correo,
                        String calle,
                        int numero_externo,
                        Integer numero_interno,
                        String colonia,
                        String estado,
                        int codigo_postal) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.rfc = rfc;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.calle = calle;
        this.numero_externo = numero_externo;
        this.numero_interno = numero_interno;
        this.colonia = colonia;
        this.estado = estado;
        this.codigo_postal = codigo_postal;
    }

    @Override
    public String identidad() {
        return nombre + " " + apellido_paterno + " " + apellido_materno + "\n"
                + "RFC: " + rfc;
    }

    @Override
    public String contacto() {
        return "Teléfono; " + this.telefono + "\n"
                + "Celular: " + this.celular + "\n"
                + "E-mail; " + this.correo;
    }

    @Override
    public String direccion() {
        return "Dirección:" + "\n"
                + calle + " " + this.numero_externo + (numero_interno != null ? numero_interno : " ")
                + colonia + ". " + estado + "\n"
                + codigo_postal;
    }
}
