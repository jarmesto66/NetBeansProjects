package ud4_vectores;

import java.util.Scanner;

/**
Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego muestre todos sus valores.
 */
public class ej1 {
    
    public static void main(String[] args) {

        int tam=10;
        Scanner scr = new Scanner(System.in);
        double[] lista= new double[tam];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Dame el número " + (i+1) + ": ");
            lista[i] = (scr.nextDouble());
        }
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("La posición " + (i+1) + " es " + lista[i]);
        }
    }
}
