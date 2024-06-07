/*
Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior.
El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de estas palabras y
comprobará si son correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas y
cuántas son erróneas.
 */
package UD_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejer90 {
    
    public static void main(String[] args) {
        
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
        
        String[] palabras_al_azar = elegirPalabrasAlAzar(diccio, 5);
        
        Scanner sc = new Scanner (System.in);
        int aciertos = 0;
        int fallos = 0;
        
        System.out.println("Escriba la traducción al Inglés de las siguientes palabras: ");
        for (String p : palabras_al_azar) {
            System.out.print(p + ": ");
            String respuestaUsuario = sc.nextLine();
            if (diccio.get(p).equalsIgnoreCase(respuestaUsuario)){
                System.out.println("¡CORRECTO!");
                aciertos++;
            } else {
                System.out.println("¡INCORRECTO!");
                System.out.println("La respuesta era: " + diccio.get(p));
                fallos++;
            }
        }
        
        System.out.println("Has acertado " + aciertos + " y has fallado " + fallos);
        
        
        
    }
    
    private static String[] elegirPalabrasAlAzar(HashMap<String,String> diccionario, int cantidad){
        
        String[] palabras_al_azar = new String[cantidad];
        ArrayList<String> palabras_esp = new ArrayList<String>(diccionario.keySet());
        for (int i = 0; i < cantidad; i++) {
            int indice = (int)(Math.random()*palabras_esp.size());
            palabras_al_azar[i] = palabras_esp.get(indice);
            palabras_esp.remove(indice);
        }
        return palabras_al_azar;
    }
    
}
