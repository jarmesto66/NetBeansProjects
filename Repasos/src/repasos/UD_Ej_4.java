/*
Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
“Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
teclado y luego el programa mostrará la nota mínima, máxima y media de cada
alumno.
 */
package repasos;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class UD_Ej_4 {
    
    public static void main(String[] args) {
        
        int alumnos = 4, asignaturas = 5;
        int [][] notas = new int [alumnos][asignaturas];
        Scanner rc = new Scanner (System.in);
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Dame la nota de Asignatura " + (j+1) + " del Alumno " + (i+1) +" : ");
                notas[i][j] = rc.nextInt();
            }
            
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("[");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("]");
        
    }
    
}
}