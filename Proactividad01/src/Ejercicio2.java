
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
         // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca una temperatura en Celsius
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertir de Celsius a Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Imprimir el resultado
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    
        
    }
    
}
