/*
Desarrolla un programa que solicite al usuario una dirección de correo electrónico y luego
indique por pantalla si es una dirección válida o no lo es. Ten en cuenta que las direcciones de
correo electrónico siguen el patrón usuario@dominio y deben cumplir los siguientes criterios:
1. La dirección debe tener al menos 10 caracteres.
2. La dirección debe incluir el carácter ‘@’ una y solamente una vez.
3. El usuario debe tener al menos 3 caracteres.
4. El dominio debe tener al menos 4 caracteres y terminar por .es
Cuando la dirección de correo no sea válida se deberá indicar qué criterio o criterios no
cumple, cuando sea posible. Ten en cuenta que en la vida real la verificación de correos es
mucho más compleja, pero no hagas suposiciones, el programa solo debe verificar los 4 criterios
indicados arriba y nada más.

Ejemplo de ejecución del programa:
Indica la dirección de correo: Pepito@X.es
¡Correo válido!

Otro ejemplo:
Indica la dirección de correo: HOLA@que@tal
Error 2. La dirección debe incluir el carácter ‘@’ una y solamente una vez.
*/
package examen;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pregunta3Correo {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String correo, usuario, dominio;
        boolean valido = true;

        System.out.print("Indica la dirección de correo: ");
        correo = leer.nextLine();

        // Criterio 1
        if (correo.length() < 10) {
            System.out.println("Error 1. La dirección debe tener al menos 10 caracteres.");
            valido = false;
        }

        // Criterio 2
        int posicion_arroba1 = correo.indexOf('@');
        int posicion_arroba2 = correo.indexOf('@', posicion_arroba1 + 1);
        if (posicion_arroba1 == -1 || posicion_arroba2 > 0) {
            System.out.println("Error 2. La dirección debe incluir el carácter ‘@’ una y solamente una vez.");
            valido = false;
        }

        // Si por ahora parece válido, comprobamos criterios 3 y 4
        if (valido) {
            // Criterio 3
            usuario = correo.substring(0, posicion_arroba1 - 1);
            if (usuario.length() < 3) {
                System.out.println("Error 3. El usuario debe tener al menos 3 caracteres.");
                valido = false;
            }

            // Criterio 4
            dominio = correo.substring(posicion_arroba1 + 1);
            if (dominio.length() < 4 || !dominio.endsWith(".es")) {
                System.out.println("Error 4. El dominio debe tener al menos 3 caracteres y terminar por .es");
                valido = false;
            }
        }

        // Si es válido
        if (valido) {
            System.out.println("¡Correo válido!");
        }

    }
    
}
