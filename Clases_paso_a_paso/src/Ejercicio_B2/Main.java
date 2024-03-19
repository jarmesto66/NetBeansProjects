
package Ejercicio_B2;

import java.util.Scanner;

/**
 *
 * @author jarmesto
 */
public class Main {
    
    public static void main(String[] args) {
        
    Persona p1 = new Persona();
    Persona p2 = new Persona();
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Dime el nombre: ");
        p1.nombre = sc.nextLine();
        System.out.print("Dime los apellidos: ");
        p1.apellidos = sc.nextLine();
        System.out.print("Dime el DNI: ");
        p1.dni = sc.nextInt();
        System.out.print("Dime la edad: ");
        p1.edad = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Dime el nombre: ");
        p2.nombre = sc.nextLine();
        System.out.print("Dime los apellidos: ");
        p2.apellidos = sc.nextLine();
        System.out.print("Dime el DNI: ");
        p2.dni = sc.nextInt();
        System.out.print("Dime la edad: ");
        p2.edad = sc.nextInt();
        
        if (p1.edad>17) System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " es mayor de edad.");
        else System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " no es mayor de edad.");
        
        if (p2.edad>17) System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " es mayor de edad.");
        else System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " no es mayor de edad.");
    
    }
}
