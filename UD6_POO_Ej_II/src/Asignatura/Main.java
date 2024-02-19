/*
Ejercicio 1. Clase Asignatura
Escribe una clase para representar una asignatura:
• Una asignatura tiene un nombre, un código numérico y el curso en el cual se imparte
(atirbutos privados).
• Constructor al que se le pasen todos los valores iniciales.
• Métodos getters y setters para todos los atirbutos de la clase.
• Crea un método que imprima por pantalla la información del objeto.
Escribe otra clase con método main para hacer pruebas: instancia tres objetos de tipo
asignatura (uno de ellos podría tener, por ejemplo, los valores: nombre “Matemáticas”,
código 1017, curso 1) y luego imprime su información por pantalla.
 */
package Asignatura;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        
        String nombre="";
        int codigo=0, curso=0;
        Asignatura a1 = new Asignatura();
        Asignatura a2 = new Asignatura();
        Asignatura a3 = new Asignatura();
        a1.setNombre("Matemáticas");
        a1.setCodigo(1017);
        a1.setCurso(1);
        
        a1.imprime();
        a2.imprime();
        a3.imprime();
        
        
    }
    
}
