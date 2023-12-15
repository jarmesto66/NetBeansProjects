/*
Escribe un programa que pida un precio sin IVA y el % de IVA a aplicar. Luego
mostrará el precio con IVA. Si alguno de los valores introducidos es cero o negativo
avisará al usuario mediante un mensaje de error
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej17 {
    
    public static void main(String[] args) {
        double precio, iva;
        Scanner in = new Scanner(System.in);
        System.out.print("¿Cuál es el precio?: ");
        precio = in.nextInt();
        System.out.print("¿Cuál es el IVA soportado?: ");
        iva = in.nextInt();
        if ((precio==0)||(iva==0)) System.out.println("ERROR...");
        else System.out.println("El precio con IVA es: "+  (precio+(precio*iva)/100));
    }
}
