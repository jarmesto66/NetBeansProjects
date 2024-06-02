/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.ArrayList;

/**
 *
 * @author María
 */
public class Main {
    
        public static void main(String[] args) {
        
        // Instanciar cuentas y probar operaciones
        System.out.println("\nPRUEBAS CON CUENTAS");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("Juan Pérez", 1000);
        CuentaPro cuentaPro = new CuentaPro("Carlos García", 3000);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("María López", 2000);

        // Operaciones en cuenta corriente
        System.out.println("Operaciones en cuenta corriente:");
        System.out.println(cuentaCorriente.getClass().getSimpleName());
        System.out.println("Ingresar 500: " + cuentaCorriente.ingresar(500));
        System.out.println("Retirar 200: " + cuentaCorriente.retirar(200));
        System.out.println("Retirar 200: " + cuentaCorriente.retirar(200));
        cuentaCorriente.actualizarMensualidad();
        System.out.println(cuentaCorriente.getClass().getSimpleName());

        // Operaciones en cuenta pro
        System.out.println("\nOperaciones en cuenta pro:");
        System.out.println(cuentaPro.getClass().getSimpleName());
        System.out.println("Ingresar 500: " + cuentaPro.ingresar(500));
        System.out.println("Retirar 200: " + cuentaPro.retirar(200));
        System.out.println("Retirar 200: " + cuentaPro.retirar(200));
        cuentaPro.actualizarMensualidad();
        System.out.println(cuentaPro.getClass().getSimpleName());

        // Operaciones en cuenta de ahorro
        System.out.println("\nOperaciones en cuenta de ahorro:");
        System.out.println(cuentaAhorro.getClass().getSimpleName());
        System.out.println("Ingresar 200: " + cuentaAhorro.ingresar(500));
        System.out.println("Retirar 5000: " + cuentaAhorro.retirar(5000));
        System.out.println("Retirar 100: " + cuentaAhorro.retirar(200));
        cuentaAhorro.actualizarMensualidad();
        System.out.println(cuentaAhorro.getClass().getSimpleName());

        // Crear ArrayList de CuentaCorriente y probar operaciones
        ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
        cuentas.add(new CuentaCorriente("Laura Martínez", 1500));
        cuentas.add(new CuentaPro("Ana Rodríguez", 3500));
        cuentas.add(new CuentaAhorro("Pedro Gómez", 2500));

        System.out.println("\nPRUEBAS CON ARRAYLIST");
        for (CuentaCorriente cuenta : cuentas) {
            System.out.println(cuenta.getClass().getSimpleName());
            System.out.println("Ingresar 50: " + cuenta.ingresar(50));
            System.out.println("Retirar 5000: " + cuenta.retirar(5000));
            cuenta.actualizarMensualidad();
            System.out.println(cuenta.getClass().getSimpleName());
            System.out.println("");
        }
    }
}
