/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_E2;

/**
 *
 * @author USER
 */
public class Main {
    
        public static void main(String[] args) {

        // Instanciamos personas
        Persona persona1 = new Persona("18999548P", 25, "José", "Serrano Márquez");
        Persona persona2 = new Persona("20222444L", 17, "María", "Carcelén Sánchez");

        // Imprimimos p1 y p2
        persona1.imprime();
        persona2.imprime();
        System.out.println("");

        // Realizamos algunos cambios
        persona1.setNombre("Juan");
        persona1.setEdad(11);
        persona2.setNombre("Carmen");
        persona2.setEdad(33);

        // Imprimimos p1 y p2
        persona1.imprime();
        persona2.imprime();
        System.out.println("");

        // Imprimomos diferencia de edad
        System.out.println("La diferencia de edad es " + persona1.diferenciaEdad(persona2));
        System.out.println("");
        
        //Validamos algunos DNIs
        System.out.println("DNI 12345678Z => " + ((Persona.validarDNI("12345678Z")) ? "Valido" : "No válido") );
        System.out.println("DNI 1234567Z  => " + ((Persona.validarDNI("1234567Z")) ? "Valido" : "No válido") );
        System.out.println("DNI 123456789 => " + ((Persona.validarDNI("123456789")) ? "Valido" : "No válido") );
        
    }
    
}
