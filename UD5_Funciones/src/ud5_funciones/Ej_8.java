/*
Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N,
el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las
funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ej_8 {
    
    public static int suma1aN(int n) {
     
        int sumatorio=0;
        for (int i = 1; i<=n; i++) {
            sumatorio = sumatorio+i;
        }
        return (sumatorio);
    }
    
    public static int producto1aN(int n) {
        
        int productorio=1;
        for (int i = 1; i <= n; i++) {
            productorio = productorio*i;
            
        }
        return(productorio);
    }
    
    public static void main(String[] args) {
        
        int n;
        Scanner scr = new Scanner(System.in);
        System.out.print("Dame un valo entero: ");
        n = scr.nextInt();
        
        System.out.println("La suma de los enteros de 1 a "+n+" es "+suma1aN(n));
        System.out.println("El producto de los enteros de 1 a "+n+" es "+producto1aN(n));
        
    }
    
}
