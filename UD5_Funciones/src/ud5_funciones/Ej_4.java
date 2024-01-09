/*
Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ej_4 {
    
    public static int dimeSigno(int a) {
        
        if (a==0) {
            return (0);
        }
        else if (a<0) {
            return (-1);
        }
        else {
            return (1);
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int a;
        System.out.print("Dame un número entero: ");
        a = scr.nextInt();
        
        System.out.println("El número es: "+dimeSigno(a));
        
        
    }
    
}
