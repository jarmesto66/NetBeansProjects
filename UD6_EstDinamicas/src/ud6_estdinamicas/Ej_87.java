/*
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego
calcule la suma, la media, el máximo y el mínimo de esos números.
El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos.
 */
package ud6_estdinamicas;

import java.util.ArrayList;

/**
 *
 * @author jarmesto
 */
public class Ej_87 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> valores = new ArrayList(); //Declaramos el ArrayList
        int totalValores;
        totalValores = (int)(Math.random()*(20-10+1)+10); //Determinamos un número aleatorio de valores entre 10 y 20
        System.out.println("Van a ser "+totalValores+" valores");
        for (int i = 0; i < totalValores; i++) {
            valores.add((int)(Math.random()*(100-0+1)+0)); //Rellenamos con valores aleatorios de 0 a 100
        }
        for (int i = 0; i < valores.size(); i++) {
            System.out.println((i+1)+": "+valores.get(i)); //Imprimimos
            
        }
    }
    
}
