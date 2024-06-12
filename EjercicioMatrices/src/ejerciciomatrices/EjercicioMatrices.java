/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomatrices;

/**
 *
 * @author USER
 */
public class EjercicioMatrices {

    public static void main(String[] args) {
        
        imprimirMatriz(crearMatriz(4));
        imprimirDiagonal(crearMatriz(4));
        imprimirDiagonalInversa(crearMatriz(4));
        
    }

    static int[][] crearMatriz(int n){
        int[][] matriz = new int [n][n];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == columna) matriz[fila][columna]=1;
                else matriz[fila][columna]=0;
            }
        }
        return matriz;
    }

    static void imprimirMatriz(int[][] matriz){
        for (int[] fila : matriz) {
            for (int columna : fila) {
                if (columna == 1) System.out.print("X ");
                else System.out.print("- ");
                System.out.print("");
            }
            System.out.println("");
        }
    }
    
    static void imprimirDiagonal(int [][] matriz){
        for (int fila = 0; fila < matriz.length; fila++) {
            if (matriz[fila][fila] == 1) System.out.print("X ");
                else System.out.print("- ");
                System.out.println("");
        }
    }
    
    static void imprimirDiagonalInversa(int [][] matriz){
        for (int fila = (matriz.length-1); fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= 0; columna--) {
                if (matriz[fila][columna] == 1) System.out.print("X ");
                else System.out.print("- ");
            }
        System.out.println("");
        }
    }

}
