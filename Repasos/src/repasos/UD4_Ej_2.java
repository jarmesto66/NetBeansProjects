/*
Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
pantalla.
 */
package repasos;

/**
 * @author JAVIER ARMESTO
 */
public class UD4_Ej_2 {
    
    public static void main(String[] args) {
    
        int [][] matriz = new int [10][10];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j] = (i+1)*(j+1);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
