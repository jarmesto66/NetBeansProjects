/*
Escribe programa que pida las 3 notas (números enteros) de un alumno y luego
muestre su nota final, calculada como la nota media expresada como un entero y
redondeada al valor entero más próximo. Téngase en cuenta también que si alguna
de las 3 notas es inferior a 5 la nota final debe ser como máximo un 4
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej15 {
    
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        double notamedia;
        boolean cateado = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Dime la primera nota: ");
        nota1 = in.nextInt();
        System.out.print("Dime la segunda nota: ");
        nota2 = in.nextInt();
        System.out.print("Dime la tercera nota: ");
        nota3 = in.nextInt();
        if ((nota1<5)||(nota2<5)||(nota3<5)) cateado=true;
        notamedia=(nota1+nota2+nota3)/3.0;
        notamedia = Math.round(notamedia);
        
        if (cateado&&(notamedia>=5)) System.out.println("La nota media es 4");
        else System.out.println("La nota media es: "+notamedia);
    }
    
}
