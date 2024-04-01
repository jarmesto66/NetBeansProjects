/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD8_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author María
 */
public class Ejercicio_A11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a =0;
        int n = (int)(Math.random()*100+1);
        int[] miArray = new int [n];
        for (int i = 0; i < miArray.length; i++) {
            int j = (int)(Math.random()*10+1);
            miArray[i] = j;
        }
        
        do {
            System.out.print("¿Qué valor del vector quieres ver?: ");
            try{
                a = sc.nextInt();
                System.out.println("El valor en " + a + " es " + miArray[a]);
                sc.nextLine();
            }
            catch (InputMismatchException e1){
                System.out.println("El valor es incorrecto.");
                sc.nextLine();
            }
            
            catch (ArrayIndexOutOfBoundsException e2){
                if (a>=0) System.out.println("Posición fuera de los límites del vector.");
            }
        } while (a>=0);
        
        System.out.println("SALIMOS DEL PROGRAMA.");
            
        
    }
    
}
