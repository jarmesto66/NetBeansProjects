/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import java.util.ArrayList;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persona p = new Persona ("Pepe", "00000000A", "C/ Colón", 666666666);
        
        System.out.println("Mostramos una persona");
        p.mostrarPersona();
        
        ArrayList notas = new ArrayList();
        
        notas.add(7);
        notas.add(5);
        notas.add(9);
        notas.add(2);
        notas.add(6);
        
        Alumno a = new Alumno(1, 1, "DAW", notas, "María", "12345678W", "Pº Libertad", 111111111);
        
        System.out.println("----------------------------");
        System.out.println("Mostramos un alumno");
        a.mostrarPersona();
        
        ArrayList modulos = new ArrayList();
        
        modulos.add("PRG");
        modulos.add("LM");
        modulos.add("SSII");
        
        Profesor profe = new Profesor(3, "Informática", "Mañanas", modulos, "Juan", "00000002J", "C/ Java", 222222222);
        
        System.out.println("----------------------------");
        System.out.println("Mostramos un profesor");
        profe.mostrarPersona();
        
    
    }
}
