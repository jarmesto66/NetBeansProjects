/*
Escribe un programa que lea la temperatura en centígrados (entero) del día e imprima
el tipo de clima de acuerdo a la siguiente lista:
◦ Temperatura menor que 10 => Frío
◦ Temperatura entre 10 y 19 => Templado
◦ Temperatura entre 20 y 29 => Caluroso
◦ Temperatura mayor que 29 => Tropical
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej13 {
    
    
    public static void main(String[] args) {


        int temp;


        Scanner in = new Scanner(System.in);


        System.out.print("Dime una temperatura en ºC: ");
        temp = in.nextInt();


        if (temp < 10) {
            System.out.println("Frío");
        } else if (temp <= 19) {
            System.out.println("Templado");
        } else if (temp <= 29) {
            System.out.println("Caluroso");
        } else {
            System.out.println("Tropical");
        }

    }
}
