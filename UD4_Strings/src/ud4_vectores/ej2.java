package ud4_vectores;

import java.util.Scanner;

/**
Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego muestre la suma de todos los valores.
*/
public class ej2 {
    
    public static void main(String[] args) {
        
        double suma=0;
        int tam=10;
        Scanner scr = new Scanner(System.in);
        double[] lista = new double [tam];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Dame el número " + (i+1) + ": ");
            lista[i] = (scr.nextDouble());
        }
        
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        
        System.out.println("La suma es: " + suma);
    }
    
}
