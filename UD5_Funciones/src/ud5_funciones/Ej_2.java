/*
Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor
de edad o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ej_2 {
    
    public static boolean esMayorEdad(int a) {
        
        if (a>=18) { return(true); } else { return(false);}
        
    }
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int edad;
        
                System.out.print("Dime tu edad: ");
                edad = scr.nextInt();
                
                if (esMayorEdad(edad)){
                    
                    System.out.println("¡Enhorabuena!, eres mayor de edad");
                }
                else{
                    System.out.println("Lo siento, ¡NO PUEDES PASAR!");
                }
                
        
    }
    
}
