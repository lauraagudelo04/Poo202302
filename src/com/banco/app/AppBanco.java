package com.banco.app;

import com.banco.domain.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria(123);//this es miCuenta
        /*miCuenta.numero = 123;
        miCuenta.activa = true;*/

        CuentaBancaria otraCuenta = new CuentaBancaria(123);
        /*otraCuenta.numero = 456;
        otraCuenta.activa = true;*/

        miCuenta.consignar(900000);
        miCuenta.transferir(500000, otraCuenta);

        System.out.println(miCuenta.consultarSaldo());
        System.out.println(otraCuenta.consultarSaldo());
    }
}
