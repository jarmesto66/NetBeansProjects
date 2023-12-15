
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ej16_segundos {
            public static void main(String[] args) {
        
        int dias, horas, minutos, segundos ;
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un número de segundos: ");
        segundos = lector.nextInt() ;
        dias = segundos / 86400 ;
        segundos = segundos - (dias*86400) ;
        horas = segundos /3600 ;
        segundos = segundos - (horas*3600) ;
        minutos = segundos / 60 ;
        segundos = segundos - (minutos*60) ;
        System.out.println("Son " + dias + " dias " + horas + " horas " + minutos + " minutos y " + segundos + " segundos");
        
        
        }
}
