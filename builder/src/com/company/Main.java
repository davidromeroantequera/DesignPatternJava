package com.company;

import com.company.clientes.Contacto;
import com.company.clientes.Direccion;
import com.company.clientes.PersonaFisica;
import com.company.cuentas.Cuenta;
import com.company.cuentas.CuentaLegacy;
import com.company.cuentas.CuentaModular;
import com.company.seguros.AutoSeguro;
import com.company.seguros.FabricaSeguros;
import com.company.seguros.Seguro;
import com.company.seguros.SeguroDeVida;

public class Main {

    public static void main(String[] args) throws Exception {
//        Código legacy
//	    System.out.println("Información de la cuenta");
//
//        Cuenta cuentaUsuario = new CuentaLegacy(
//                "David",
//                "Romero",
//                "Antequera",
//                "ROAD820503",
//                "3355554444",
//                "8155554444",
//                "",
//                "Hacienda de San Francisco",
//                201,
//                null,
//                "Hacienda de San Francisco",
//                "NL",
//                64710);

        var cliente = PersonaFisica.crearPersonaFisica()
                .conApellidoPaterno("Romero")
                .conNombre("David")
                .conApellidoMaterno("Antequera")
                .conRFC("ROAD820503")
                .construir();

        var direccion = Direccion.crear()
                .conCodigoPostal(64710)
                .conColonia("Hacienda de San Francisco")
                .conNumeroExterno(210)
                .construir();

        var contacto = Contacto.construir()
                .conCelular("3350004000")
                .crear();

        var cuentaUsuario = CuentaModular.crearCuenta()
                .conDireccion(direccion)
                .conInformacionContacto(contacto)
                .identidadCliente(cliente)
                .crear();


        System.out.println(cuentaUsuario.identidad());
        System.out.println(cuentaUsuario.contacto());
        System.out.println(cuentaUsuario.direccion());

        Seguro seguroCliente = FabricaSeguros.crear("vida", cliente);

        System.out.println(seguroCliente.numeroPoliza());
        System.out.println(seguroCliente.cuerpoPoliza());
    }
}
