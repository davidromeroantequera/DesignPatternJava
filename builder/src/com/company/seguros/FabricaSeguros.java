package com.company.seguros;

import com.company.clientes.PersonaFisica;

public class FabricaSeguros {
    public static Seguro crear(String tipoDePoliza, PersonaFisica cliente) throws Exception {
        // TODO Primera optimización: utilizar un switch case
        // TODO Segunda optimización: utilizar un Map<String, Class<Seguro>>
        Seguro seguroCliente;

        if (tipoDePoliza.equals("auto")) {
            seguroCliente = new AutoSeguro(cliente);
        } else if (tipoDePoliza.equals("vida")) {
            seguroCliente = new SeguroDeVida(cliente);
        } else {
            throw new Exception();
        }

        return seguroCliente;
    }
}
