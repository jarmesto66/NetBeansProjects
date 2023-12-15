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
package examen;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pregunta1Estaciones {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia, mes;
        String estacion = "";

        System.out.print("Introduce el día: ");
        dia = leer.nextInt();
        System.out.print("Introduce el mes: ");
        mes = leer.nextInt();
        
        switch (mes){
            
            case 1: case 2: 
                estacion = "Invierno";
                break;
            case 10: case 11:
                estacion = "Otoño";
                break;
            case 7: case 8:
                estacion = "Verano";
                break;
            case 4: case 5:
                estacion = "Primavera";
                break;
            default:
                    if ((mes == 3 && dia >= 21) || (mes == 6 && dia <=20)) {
                            estacion = "Primavera";
                            }
                    if ((mes == 6 && dia >= 21) || (mes == 9 && dia <= 21)) {
                            estacion = "Verano";
                            }
                    if ((mes == 9 && dia >= 23) || (mes == 12 && dia <= 21)) {
                            estacion = "Otoño";
                            }
                    if ((mes == 12 && dia >= 22) || (mes == 3 && dia <= 20)) {
                            estacion = "Invierno";
                            }
                    break;
        }

        System.out.println("El " + dia + "/" + mes + " es " + estacion);

    }
    
}
