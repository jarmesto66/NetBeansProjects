/*
Escribe un programa que pida dos números enteros por teclado y muestre por pantalla
cual es el mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ej_3 {
    
    public static int minimo(int a, int b) {
        
        if (a<=b) {
            return a;
        }
        else {
            return b;
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner (System.in);
        int a,b;
        System.out.print("Dame un número entero: ");
        a = scr.nextInt();
        System.out.print("Dame otro número entero: ");
        b = scr.nextInt();
        
        System.out.println("El menor de los dos es: "+minimo(a,b));
        
    }
    
}
