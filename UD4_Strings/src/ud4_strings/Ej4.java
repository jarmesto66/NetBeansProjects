package ud4_strings;

import java.util.Scanner;

/**
Crea un programa que pida por teclado tres cadenas de texto: nombre y dos
apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se
introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
 */
public class Ej4 {
    
    public static void main(String[] args) {
        
        String nombre, apellido1, apellido2;
        
         //Declaración de Scanner y lectura
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame el nombre: ");
        nombre = scr.nextLine();
        System.out.print("Dame el primer apellido: ");
        apellido1 = scr.nextLine();
        System.out.print("Dame el segundo apellido: ");
        apellido2 = scr.nextLine();
        
        System.out.println("CÓDIGO: " + nombre.substring(0, 3).toUpperCase()+apellido1.substring(0, 3).toUpperCase()+apellido2.substring(0, 3).toUpperCase());
    }
    
}
