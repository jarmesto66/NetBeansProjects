/*

 */
package Ej_Rectangulo;

import java.util.Scanner;

/**
 *
 * @author jarmesto
 */
public class Main {
    
    public static void main(String[] args) {
        
        Rectangulo r1, r2, r3;
        r1 = new Rectangulo();
        Scanner lee = new Scanner(System.in);
        
        System.out.println("Dame las coordenadas de la esquina inferior izquierda: ");
        System.out.print("Dame x1: "); r1.x1 = lee.nextInt();
        System.out.print("Dame y1: "); r1.y1 = lee.nextInt();
        
        System.out.println("Dame las coordenadas de la esquina superior derecha: ");
        System.out.print("Dame x2: "); r1.x2 = lee.nextInt();
        System.out.print("Dame y2: "); r1.y2 = lee.nextInt();
        
        if ((!(r1.x1<r1.x2))&&(!(r1.y1<r1.y2))) System.err.println("ERROR al instanciar Rectángulo...");
        
        
    }
    
}
