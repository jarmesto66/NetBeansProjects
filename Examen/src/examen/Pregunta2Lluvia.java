/*
Desarrolla un programa que, dada un cubeta de lluvia con una capacidad de litros indicada
por el usuario, calcule el número de días transcurridos hasta que la cubeta se llene por la lluvia.
Para simular la lluvia utiliza alguna función aleatoria de modo que cada día caigan en la cubeta
entre 0 y 20 litros de lluvia (ambos inclusive). Además, el programa deberá mostrar por pantalla
una traza de los litros de lluvia y la capacidad remanente de cada día.

Ejemplo de ejecución del programa:
Introduce la capacidad de la cubeta: 100
Día=1 Lluvia=11 Capacidad=89
Día=2 Lluvia=19 Capacidad=70
Día=3 Lluvia=13 Capacidad=57
Día=4 Lluvia=7 Capacidad=50
Día=5 Lluvia=12 Capacidad=38
Día=6 Lluvia=14 Capacidad=24
Día=7 Lluvia=17 Capacidad=7
Día=8 Lluvia=15 Capacidad=0
Fin de la simulación. Se ha llenado en 8 días.
*/
package examen;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pregunta2Lluvia {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia = 1, lluvia, capacidad;

        System.out.print("Introduce la capacidad de la cubeta: ");
        capacidad = leer.nextInt();

        do {
            lluvia = (int) (Math.random() * 21);
            capacidad -= lluvia;
            if (capacidad < 0) {
                capacidad = 0;
            }
            System.out.println("Día=" + dia + "  Lluvia=" + lluvia + "  Capacidad=" + capacidad);
            dia++;
        } while (capacidad > 0);

        dia--;

        System.out.println("Fin de la simulación. Se ha llenado en " + dia + " días.");
    }
    
}
