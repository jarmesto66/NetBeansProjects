/*
Escribe una aplicación que pida por teclado la matrícula de un coche y pregunte si el coche
es con cambio automático o no. Posteriormente, debe crear un coche con las características
indicadas por el usuario y mostrarlo. Acelerar el coche en 60 km/h, si es un coche con cambio manual,
cambiar la marcha a tercera y volverlo a mostrar.
 */
package Ej4a;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        String matricula;
        boolean automatico=false;
        Coche c;
        
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame la matrícula de un coche: ");
        matricula = scr.nextLine();
                
        System.out.print("¿Es automático? (sí/no): ");
        String esAutomatico = scr.nextLine().trim().toLowerCase();
        
        if (esAutomatico.equals("si")) {
            c = new CocheCambioAutomatico(matricula);
            automatico = true;
        } else {
            c = new CocheCambioManual(matricula);
            automatico = false;
        }
        System.out.println(c.toString());;
        c.acelerar(60);
        if (c instanceof CocheCambioManual) c.cambiaMarcha(3);
        System.out.println(c.toString());
    }
}
