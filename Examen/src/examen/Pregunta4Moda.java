/*
Desarrolla un programa que muestre por pantalla N números aleatorios del 0 al 19, ambos
inclusive, siendo N un número indicado por el usuario, y luego indique cual es la moda y cuántas
veces aparece. La moda es el número más frecuente, es decir, el que más veces aparece.

Ejemplo de ejecución del programa:
¿Cuántos números aleatorios quieres? 10
Números: 5 8 14 12 17 14 5 10 18 5
Moda: 5 (3 veces)
*/
package examen;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pregunta4Moda {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;

        // Array para contar números del 0 al 19
        int[] contador = new int[20];

        System.out.print("¿Cuántos números aleatorios quieres? ");
        n = leer.nextInt();

        // Creamos n números aleatorios y vamos contando
        System.out.print("Números: ");
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 20);
            System.out.print(num + " ");
            contador[num]++;
        }
        System.out.println("");

        // Buscamos la moda
        int moda = 0;
        int max = 0;
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > max) {
                max = contador[i];
                moda = i;
            }
        }

        System.out.println("Moda: " + moda + " (" + contador[moda] + " veces)");
    }
    
}
