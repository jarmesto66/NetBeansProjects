/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apuntes;

import java.util.ArrayList;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persona p = new Persona ("Pepe", "00000000A", "C/ Colón 32", 666666666);
        
        System.out.println("Mostramos una persona");
        p.mostrarPersona();
        
        ArrayList notas = new ArrayList();
        
        notas.add(7);
        notas.add(9);
        notas.add(5);
        notas.add(8);
        
        Alumno a = new Alumno (1, "DAW", 1, notas, "María", "12345678A", "Pº Libertadores", 111111111);
        System.out.println("-------------------------");
        System.out.println("Mostramos un alumno:");
        a.mostrarPersona();
        
        ArrayList modulos = new ArrayList();
        modulos.add("Programación");
        modulos.add("Lenguajes de marcas");
        modulos.add("Sistemas informáticos");
        
        Profesor profe = new Profesor(1, "Programación", modulos, "Tardes", "Lionel", "22222222B", "IES Serpis", 555555555);
        
        System.out.println("-------------------------");
        System.out.println("Mostramos un profesor:");
        profe.mostrarPersona();
        
    }
    
}
