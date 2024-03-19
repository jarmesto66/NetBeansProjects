/* Crea un programa con una clase llamada Persona que representará los datos principales de una
persona: dni, nombre, apellidos y edad.
En el main de la clase principal instancia dos objetos de la clase Persona. Luego, pide por teclado
los datos de ambas personas (guárdalos en los objetos). Por último, imprime dos mensajes por
pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI … es / no es
mayor de edad”.*/

package Ejercicio_B2;

/**
 *
 * @author jarmesto
 */

public class Persona {
    
    int dni, edad;
    String nombre, apellidos;

    public Persona(int dni, int edad, String nombre, String apellidos) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona() {
    }
    
    
    
}
