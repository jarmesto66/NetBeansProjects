/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD8_Excepciones;

import java.io.IOException;

/**
 *
 * @author María
 */
public class Ejercicio_B9 {
    
    public static int devuelveEntero(int num) throws Exception {
        try {
            if ((num % 2) == 0) {
                throw new Exception ("Lanzando excepción par");
            } else {
                throw new IOException ("lanzando excepción impar");
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
            return 2;
        }
    }
     
    public static void main(String[] args) {
        int a = 99;
        for (int i = 0; i < 10; i++) {
            try {
                a = devuelveEntero(i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                a = 99;
            }
            System.out.println(a);
        }
    }
}
