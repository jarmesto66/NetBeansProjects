/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro;

/**
 *
 * @author USER
 */
public class Simulacro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
/*
Programa 1. Estaciones del año (2 puntos)
Desarrolla un programa que, dada una fecha representada por dos valores numéricos (día y
mes) introducidos por el usuario, resuelva en qué estación nos encontramos. Las fechas de las
estaciones son:
• Primavera: del 21 de marzo al 20 de junio.
• Verano: del 21 de junio al 22 de septiembre.
• Otoño: del 23 de septiembre al 21 de diciembre.
• Invierno: del 22 de diciembre al 20 de marzo.

Ejemplo de ejecución del programa:
Introduce el día: 29
Introduce el mes: 11
El 29/11 es Otoño
*/
import java.util.Scanner;

public class Pregunta1Estaciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia, mes;
        String estacion = "";

        System.out.print("Introduce el día: ");
        dia = leer.nextInt();
        System.out.print("Introduce el mes: ");
        mes = leer.nextInt();

        if ((mes == 3 && dia >= 21) || mes == 4 || mes == 5 || (mes == 6 && dia <= 20)) {
            estacion = "Primavera";
        } else if ((mes == 6 && dia >= 21) || mes == 7 || mes == 8 || (mes == 9 && dia <= 22)) {
            estacion = "Verano";
        } else if ((mes == 9 && dia >= 23) || mes == 10 || mes == 11 || (mes == 12 && dia <= 21)) {
            estacion = "Otoño";
        } else if ((mes == 12 && dia >= 22) || mes == 1 || mes == 2 || (mes == 3 && dia <= 20)) {
            estacion = "Invierno";
        } else {
            estacion = "ERROR INESPERADO";
        }

        System.out.println("El " + dia + "/" + mes + " es " + estacion);

    }
}
        
    }
    
}