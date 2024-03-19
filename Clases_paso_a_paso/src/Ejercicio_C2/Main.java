/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_C2;

import java.util.Scanner;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
    Persona p1 = new Persona();
    Persona p2 = new Persona();
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Dime el nombre: ");
        p1.setNombre(sc.nextLine());
        System.out.print("Dime los apellidos: ");
        p1.setApellidos(sc.nextLine());
        System.out.print("Dime el DNI: ");
        p1.setDni(sc.nextInt());
        System.out.print("Dime la edad: ");
        p1.setEdad(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Dime el nombre: ");
        p2.setNombre(sc.nextLine());
        System.out.print("Dime los apellidos: ");
        p2.setApellidos(sc.nextLine());
        System.out.print("Dime el DNI: ");
        p2.setDni(sc.nextInt());
        System.out.print("Dime la edad: ");
        p2.setEdad(sc.nextInt());
        sc.nextLine();
        if (p1.getEdad()>17) System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + " es mayor de edad.");
        else System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + " no es mayor de edad.");
        
        if (p2.getEdad()>17) System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + " es mayor de edad.");
        else System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + " no es mayor de edad.");
    
    }
    
}
