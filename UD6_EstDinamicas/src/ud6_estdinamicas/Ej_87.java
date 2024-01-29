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
        int totalValores, suma = 0, media = 0, max = 0, min = 100;
        totalValores = (int)(Math.random()*(20-10+1)+10); //Determinamos un número aleatorio de valores entre 10 y 20
        System.out.println("Van a ser "+totalValores+" valores");
        for (int i = 0; i < totalValores; i++) {
            valores.add((int)(Math.random()*(100-0+1)+0)); //Rellenamos con valores aleatorios de 0 a 100
        }
        
        for (int i = 0; i < valores.size(); i++) {
            suma += valores.get(i);
            if (valores.get(i) < min) {
                min = valores.get(i);
            }
            if (valores.get(i)>max) {
                max = valores.get(i);
            }
        media = suma/totalValores;
            
        }
        System.out.println(valores.toString()); //Imprimimos valores
        System.out.println("Mínimo: "+ min);
        System.out.println("Máximo: "+ max);
        System.out.println("Suma: "+ suma);
        System.out.println("Media: "+ media);
                
    }
    
}
