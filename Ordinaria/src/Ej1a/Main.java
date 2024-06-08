package Ej1a;

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Crear objetos de Fecha y Hora
        Fecha fechaExamen = new Fecha(10, 6, 2024);
        Hora horaExamen = new Hora(9, 30);

        // Crear objeto de Examen
        Examen examen = new Examen("Matemáticas", "Aula 101", fechaExamen, horaExamen);

        // Imprimir la información del examen
        System.out.println(examen);
    }
    
}