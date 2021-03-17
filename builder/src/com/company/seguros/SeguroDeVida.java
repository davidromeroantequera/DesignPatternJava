package com.company.seguros;

import com.company.clientes.PersonaFisica;

import java.util.UUID;

public class SeguroDeVida implements Seguro {
    private String numero;
    private PersonaFisica identidad;

    public SeguroDeVida(PersonaFisica cliente) {
        this.numero = UUID.randomUUID().toString();
        this.identidad = cliente;
    }

    @Override
    public String numeroPoliza() {
        return numero;
    }

    @Override
    public String cuerpoPoliza() {
        return "Asegurado: " + identidad.getNombre() + " "
                + identidad.getApellido_paterno() + " " + identidad.getApellido_materno() + "\n"
                + "Tipo de póliza: Seguro de Vida \n"
                + "Natus minus ducimus labore quis optio accusamus quia sequi. Dolorem facere autem repellendus "
                + "beatae vel doloremque. Vitae non exercitationem facilis...";
    }
}
