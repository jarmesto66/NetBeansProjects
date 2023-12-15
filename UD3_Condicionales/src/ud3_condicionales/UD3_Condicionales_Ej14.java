/*
Escribe un programa que pida cuantas mujeres y hombres hay en un aula y muestre
el porcentaje de mujeres y hombres que hay. También mostrará un mensaje
indicando si hay más mujeres, o más hombres o si hay los mismos
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej14 {
    
    public static void main(String[] args) {
        int mujeres, hombres;
        double porcenmuj;
        Scanner in = new Scanner(System.in);
        System.out.print("Dime cuántos hombres hay en clase: ");
        hombres = in.nextInt();
        System.out.print("Dime cuántas mujeres hay en clase: ");
        mujeres = in.nextInt();
        if (mujeres==hombres) System.out.println("Hay tantas mujeres como hombres");
        else    if (mujeres>hombres) System.out.println("Hay más mujeres que hombres");
                else System.out.println("Hay más hombres que mujeres");
        porcenmuj=(mujeres*100)/(mujeres+hombres);
        System.out.println("Hay un "+porcenmuj+"% de mujeres y un "+(100-porcenmuj)+"% de hombres");
        
    }
    
}
