/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4_strings;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class Ej10 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        String cadena;
        int pos;
        
        //Declaración de Scanner
        Scanner scr = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        cadena = scr.nextLine();
        
        // Recorremos los caracteres de F, mostrándolos uno a uno.
        // Si encontramos un espacio imprimimos nueva línea
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == ' ')
                System.out.println("");
            else
                System.out.print(c);
        }        
        
    }
        
    }
