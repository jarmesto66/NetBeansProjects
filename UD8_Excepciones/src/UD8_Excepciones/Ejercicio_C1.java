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

public class Ejercicio_C1 {

public static void imprimePositivo(int p) throws Exception{
    if (p<0) throw new Exception("Error: número negativo");
    System.out.println("El número positivo es el: " + p);
}


public static void imprimeNegativo(int n) throws Exception{
    if(n>=0) throw new Exception("Error: número positivo");
    System.out.println("El número negativo es el: " + n);
}


    public static void main(String[] args) {
        
    
        Scanner in = new Scanner(System.in);
        int num;

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Introduce un entero positivo: ");
                num = in.nextInt();
                imprimePositivo(num);

                System.out.print("Introduce un entero negativo: ");
                num = in.nextInt();
                imprimeNegativo(num);
            }
            catch (InputMismatchException e) {
                //e.getMessage();
                e.printStackTrace();
                System.out.println("Valor introducido incorrecto");
                in.nextLine();
            }
            catch (Exception e) {
                //e.getMessage();
                e.printStackTrace();
                System.out.println(e.getMessage());
              }
        }
    }
    
}
