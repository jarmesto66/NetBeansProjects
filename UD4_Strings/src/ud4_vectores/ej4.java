/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4_vectores;

import java.util.Scanner;

/**
Crea un programa que pida veinte números enteros por teclado, los almacene en un
array y luego muestre por separado la suma de todos los valores positivos y
negativos.
 */
public class ej4 {
    
    public static void main(String[] args) {
        int tam = 20;
        int[] numeros = new int[tam];
        int sumaPos=0, sumaNeg=0;
        Scanner scr = new Scanner(System.in);
                
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dame el número " + (i+1) + ": ");
            numeros[i] = scr.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            
            sumaPos = (numeros[i]>=0) ? sumaPos+=numeros[i] : sumaPos;
            sumaNeg = (numeros[i]<0) ? sumaNeg+=numeros[i] : sumaNeg;
            
        }
        
        System.out.println("Los positivos suman "+ sumaPos);
        System.out.println("Los negativos suman "+ sumaNeg);
        
    }
    
    
    
}
