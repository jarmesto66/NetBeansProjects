/*
Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
que cero, cuántos son menores que cero y cuántos son igual a cero.
 */
package repasos;

import java.util.Scanner;

/**
 * @author JAVIER ARMESTO
 */

public class UD4_Ej_3 {
    
    public static void main(String[] args) {
        
        int n,m;
        int mayor = 0, menor = 0, igual = 0;

        Scanner rc = new Scanner (System.in);
        
        System.out.print("Dame el valor de filas: ");
        n = rc.nextInt();
        System.out.print("Dame el valor de columnas: ");
        m = rc.nextInt();
        
        int [][] matriz = new int [n][m];
        
        System.out.println("Vamos a crear una matriz de " + n + " columnas y " + m + " filas");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dame el valor de la posición " + i + " " + j);
                matriz[i][j] = rc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    igual++;
                }
                else    if ( matriz[i][j] < 0 ) {
                            menor++;
                        }
                        else mayor++;
            }
        }
        System.out.println("Hay " + igual + " números iguales a cero. " + menor + " negativos y " + mayor + " positivos.");
    }
}
