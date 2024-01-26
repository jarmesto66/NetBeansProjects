/*
Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras, con su correspondiente
traducción. Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras.
El programa pedirá una palabra en español y dará la correspondiente traducción en inglés, hasta que el
usuario pulse la palabra “salir”.
 */
package ud6_estdinamicas;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author JArmesto
 */
public class Ej_89 {
    
    public static void main(String[] args) {
        
        //Declaramos las variables y creamos el Scanner para leer
        Scanner leePalabra = new Scanner(System.in);
        HashMap <String,String> diccionario = new HashMap();
        String palabra, salida;
        salida = "SALIR"; //Será la palabra clave para dejar de traducir
        
        //Introducimos las palabras del diccionario y sus traducciones
        diccionario.put("Sí", "Yes");
        diccionario.put("No", "No");
        diccionario.put("por favor","please");
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
        
        // Bucle para pedir palabras que finalizará al leer el valor de la variable salida
        do {
            System.out.println("Recuerda que para finalizar debes introducir SALIR");
            System.out.print("Introduce la palabra a traducir: ");
            palabra = leePalabra.next();
            if (!palabra.equals(salida)) {
                
                //Si la palabrano está en el diccionario nos lo indicará
                if (diccionario.get(palabra)==null) {
                System.out.println("La palabra "+palabra+" no está en el diccionario.");
                }
                
                // Nos da la traducción
                else System.out.println(palabra+" en Inglés es "+diccionario.get(palabra) );
            }
            
        }
        
        //El bucle se repite hasta leer el valor de salida
        while (!palabra.equals(salida));
        
        
    }
    
}
