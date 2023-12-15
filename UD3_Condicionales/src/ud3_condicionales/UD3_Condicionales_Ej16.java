/*
Escribe un programa en el que el usuario intenta adivinar el valor que saldrá al “tirar”
un dado de 6 caras. Se le pedirá el valor al usuario, y luego se mostrará un número
aleatorio entre 1 y 6. Por ultimo, se mostrará un mensaje indicando si el usuario
acertó o no

int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));  // Valor entre M y N, ambos incluidos.
double valorAleatorio = Math.random()*(N-M)+M;
 */
package ud3_condicionales;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD3_Condicionales_Ej16 {
    
    public static void main(String[] args) {
        int apuesta;
        int tirada = (int) (Math.floor(Math.random()*(6-1+1)+1));
        
        Scanner in = new Scanner(System.in);
        System.out.print("¿Por qué número apuestas?: ");
        apuesta = in.nextInt();
        
        
        if (apuesta==tirada) System.out.println("¡ACERTASTE!");
        else System.out.println("¡HAS FALLADO! SALIÓ EL "+tirada);
    }
    
}
