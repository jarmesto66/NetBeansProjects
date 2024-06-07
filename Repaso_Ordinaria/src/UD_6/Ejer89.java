/*
Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras, con su correspondiente
traducción. Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras.
El programa pedirá una palabra en español y dará la correspondiente traducción en inglés, hasta que el
usuario pulse la palabra “salir”.

*/
package UD_6;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer89 {
    
    public static void main(String[] args) {
        
        String palabra;
        HashMap<String,String> diccio = new HashMap<String,String>();
        
        diccio.put("Amor", "Love");
        diccio.put("Casa", "House");
        diccio.put("Amigo", "Friend");
        diccio.put("Libro", "Book");
        diccio.put("Coche", "Car");
        diccio.put("Gato", "Cat");
        diccio.put("Perro", "Dog");
        diccio.put("Escuela", "School");
        diccio.put("Agua", "Water");
        diccio.put("Música", "Music");
        diccio.put("Sol", "Sun");
        diccio.put("Familia", "Family");
        diccio.put("Ciudad", "City");
        diccio.put("Viaje", "Trip");
        diccio.put("Salud", "Health");
        diccio.put("Dinero", "Money");
        diccio.put("Tiempo", "Time");
        diccio.put("Felicidad", "Happiness");
        
        Scanner sc = new Scanner(System.in);
        
        
        do  {
        
        System.out.print("Dime una palabra en castellano: ");
        palabra = sc.nextLine();
            if (diccio.containsKey(palabra)) {
            System.out.println(diccio.get(palabra));
            } else if (!"Salir".equals(palabra)) {
                System.out.println("La palabra no está en el diccionario");
        }
        
        } while (!"Salir".equals(palabra));
    
    }
    
    
    
}
