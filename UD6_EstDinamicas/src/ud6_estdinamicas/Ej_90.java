/*
Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior.
El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de estas palabras y
comprobará si son correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas y
cuántas son erróneas.
 */
package ud6_estdinamicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;


/**
 *
 * @author María
 */
public class Ej_90 {
    
    public static void main(String[] args) {
        
        //Declaramos las variables y creamos el Scanner para leer
        Scanner leePalabra = new Scanner(System.in);
        HashMap <String,String> diccionario = new HashMap();
        int palabraPos, aciertos = 0;
        String respuesta, solucion;
        
        
        //Introducimos las palabras del diccionario y sus traducciones
        diccionario.put("Sí", "Yes");
        diccionario.put("No", "No");
        diccionario.put("por favor","please");
        diccionario.put("gracias", "thank you");
        diccionario.put("nada", "you're welcome");
        diccionario.put("perdóneme", "excuse me");
        diccionario.put("siento", "i am sorry");
        diccionario.put("días", "good morning");
        diccionario.put("tardes", "good afternoon");
        diccionario.put("oso", "bear");
        diccionario.put("noches", "good night");
        diccionario.put("dar", "give");
        diccionario.put("tener", "have");
        diccionario.put("ser", "to be");
        diccionario.put("ir", "go");
        diccionario.put("hacer", "make");
        diccionario.put("puede", "can");
        diccionario.put("venir", "come");
        diccionario.put("sentir", "feel");
        diccionario.put("conducir", "drive");
        
        //Volcamos la lista de claves a un ArrayList para poder acceder a posiciones absolutas aleatorias
        List <String> listaDeClaves = new ArrayList <String> (diccionario.keySet());
        
        for (int i = 0; i < 5; i++) {
            palabraPos = (int) (Math.random()*(diccionario.size()-0+1));
            System.out.println("Dime la traducción de: "+listaDeClaves.get(palabraPos));
            solucion = diccionario.get(listaDeClaves.get(palabraPos));
            respuesta = leePalabra.nextLine();
            System.out.println(respuesta);
            System.out.println("La respuesta es: " + respuesta);
            if (solucion != respuesta) {
                System.out.println("FALLÓ");
                ++aciertos;                
            }
        }
        System.out.println("Has acertado: " + aciertos);
        System.out.println("Has fallado: " + (5-aciertos));
        
//        for (int i = 0; i < diccionario.size(); i++) {
//            listaDeClaves(i) = diccionario.keySet();
            
        
        
        
        //System.out.println("Dime la traducción de: "+ diccionario.+ " es " + diccionario.getValue());
        
        /** palabraPos = (int) (Math.random()*(diccionario.size()-0+1)+0);
        
        for (Map.Entry<String, String> entry : diccionario.entrySet()) {
            if ((entry.getKey()) == palabraPos) {
                System.out.println("Clave encontrada: " + entry.getValue());
                break; // Salir del bucle una vez que se ha encontrado la clave
            }
        }
        
        
        
        System.out.println("La posición " + palabraPos);
        //System.out.println("Dime la traducción de: "+ palabraPos.getKey()+ " es "+ palabraPos.getValue());
        
        
        /**for (Map.Entry<String,String> i : diccionario.entrySet()) {
            
            i = (int) (Math.random()*(diccionario.size()-0+1)+0);
            System.out.println("Dime la traducción de: "+ i.getKey()+ " es "+ i.getValue());
                    
                    //diccionario.get(palabraPos = (int)(Math.random()*(diccionario.size()-0+1)+0)));
            //diccionario.
           **/ 
        }
        
    }
