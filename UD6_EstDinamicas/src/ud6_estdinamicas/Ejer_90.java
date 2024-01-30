/*
Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior.
El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de estas palabras y
comprobará si son correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas y
cuántas son erróneas.
 */
package ud6_estdinamicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejer_90 {
    
    public static void main(String[] args) {
    
        //Declaramos las variables y creamos el Scanner para leer
        Scanner leePalabra = new Scanner(System.in);
        HashMap <String,String> diccionario = new HashMap();
        String palabra;
        int preguntas = 5, aciertos = 0;
                        
        //Introducimos las palabras del diccionario y sus traducciones
        diccionario.put("Sí", "Yes");
        diccionario.put("No", "No");
        diccionario.put("verdad","true");
        diccionario.put("gracias", "thank you");
        diccionario.put("de nada", "you're welcome");
        diccionario.put("perdóneme", "excuse me");
        diccionario.put("lo siento", "i am sorry");
        diccionario.put("buenos días", "good morning");
        diccionario.put("buenas tardes", "good afternoon");
        diccionario.put("buen ocaso", "good evening");
        diccionario.put("buenas noches", "good night");
        diccionario.put("dar", "give");
        diccionario.put("tener", "have");
        diccionario.put("ser", "to be");
        diccionario.put("ir", "go");
        diccionario.put("hacer", "make");
        diccionario.put("puede", "can");
        diccionario.put("venir", "come");
        diccionario.put("sentir", "feel");
        diccionario.put("conducir", "drive");
        
        //Creamos un ArrayList con las claves para poder acceder por valor absoluto aleatorio x
        ArrayList <String> claves = new ArrayList<String> (diccionario.keySet());
        
//        System.out.println("Listado de Keys: ");
//        for (int i = 0; i < claves.size(); i++) {
//            System.out.println("-> " + claves.get(i));
//            
//        }
        
        //Determinamos los 5 valores aleatorios a preguntar en un bucle y resolvemos almacenando los aciertos
        for (int i = 0; i < preguntas; i++) {
            // En principio no comprobamos si algún valor se repite porque no nos lo piden
            int x = (int)(Math.random()*(19-0+1)+0);
            //Acce
            System.out.println("Dime la traducción de: " + claves.get(x));            
            palabra = leePalabra.nextLine();
            System.out.println("LA RESPUESTA ES: "+diccionario.get(claves.get(x)));
            //Validamos si la respuesta es igual al valor en el diccionario de la clave posición 0 del ArrayList
            if (diccionario.get(claves.get(x)).equals(palabra)) {
                ++aciertos;
                System.out.println("ACIERTO");
            }

            
        }
        //Damos los resultados
        System.out.println("Has acertado "+aciertos+" y has fallado "+(5-aciertos));
    }
    
}
