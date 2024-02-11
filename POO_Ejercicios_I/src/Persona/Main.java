/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona(p1.setDni(dni),p1.setNombre(nombre),p1.setNombre(nombre),p1.setEdad(0));
        Persona p2 = new Persona("24558737","María","Martínez Mínguez",17);
        Persona p3 = new Persona("33338737","Luis","Zalbidea",57);
        
        
        System.out.println(p1.nombre+" "+p1.apellidos+" con DNI "+p1.dni+" "+p1.MayorEdad());
        System.out.println(p2.nombre+" "+p2.apellidos+" con DNI "+p2.dni+" "+p2.MayorEdad());
        System.out.println(p3.nombre+" "+p3.apellidos+" con DNI "+p3.dni+" "+p3.MayorEdad());
    }
    
}
