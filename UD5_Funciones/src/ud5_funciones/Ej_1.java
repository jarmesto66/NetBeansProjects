/*
 Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ej_1 {
    
    public static double multiplica(double a, double b){
        return a*b;
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scr = new Scanner(System.in);
        double a , b ;
        System.out.print("Dame un número real: ");
        a = scr.nextDouble();
        System.out.print("Dame un segundo número real: ");
        b = scr.nextDouble();
        System.out.println("El resultado de su producto es: "+ multiplica(a,b));
        
    }
    
}
