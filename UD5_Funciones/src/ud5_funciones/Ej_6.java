/*
Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ej_6 {
    
    public static double precioConIVA(double precio) {
        
        return (precio*1.21);
            
        }
        
    
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner (System.in);
        double[] precios = new double[5];
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Dame el precio "+(i+1)+" : ");
            precios[i] = scr.nextDouble();
            
        }
        
        for (int i = 0; i < precios.length; i++) {
            
            System.out.println("El precio "+(i+1)+" es "+ precioConIVA(precios[i]) + " tras añadir el IVA");
            
        }
    }
    
}
