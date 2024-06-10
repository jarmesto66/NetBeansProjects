package ud4_vectores;

import java.util.Scanner;

/**
Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
*/
public class ej3 {
    
    public static void main(String[] args) {
        
        int tam=10;
        double[] numeros = new double[tam];
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        Scanner scr = new Scanner(System.in);
                
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dame el número " + (i+1) + ": ");
            numeros[i] = scr.nextDouble();
        }
        for (int i = 0; i < numeros.length; i++) {
            //if (max<numeros[i]) max = numeros[i];
            //max = Math.max(numeros[i], max);
            max = (max<numeros[i]) ? numeros[i]:max;
            //if (min>numeros[i]) min = numeros[i];
            //min = Math.min(numeros[i], min);
            min = (min>numeros[i]) ? numeros[i]:min;
        }
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
    }
}
