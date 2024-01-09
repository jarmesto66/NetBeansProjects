/*
Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su
área y su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ej_7 {
    
    public static double perimetroRectangulo(double ancho, double alto) {
        
        return((ancho+alto)*2);
        
    }
    
    public static double areaRectangulo(double ancho, double alto) {
        
        return (ancho*alto);
    }
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner (System.in);
        double ancho, alto;
        System.out.print("Dame el ancho del rectángulo: ");
        ancho = scr.nextDouble();
        System.out.print("Dame el alto del rectángulo: ");
        alto = scr.nextDouble();
        
        System.out.println("El perímetro del rectángulo es: "+perimetroRectangulo(ancho,alto));
        System.out.println("El área del rectángulo es: "+areaRectangulo(ancho,alto));
        
    }
    
}
