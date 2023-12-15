/* ENUNCIADO:
 * Crea un programa que pida al usuario introducir un texto T por teclado y
 * luego muestre por pantalla la abreviatura de T en forma de sigla. Es decir,
 * una palabra en mayúsculas formada por las iniciales de las palabras de T.
 * El programa deberá ignorar las palabras de 3 caracteres o menos. Este
 * proceso se repetirá una y otra vez hasta que el usuario introduza un texto
 * vacío (presione enter), en cuyo caso el programa terminará.
 */
/*
 * @jarmesto66 JAVIER ARMESTO BARTOLOMÉ
 */
package ud4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class UD4_TareaVoluntariaEj1 {
    
    public static void main(String[] args) {
        
        //Como vamos a solicitar datos llamamos a Scanner
        Scanner scr = new Scanner(System.in);
        
        /* Declaración de variables
         * En abreviatura almacenaremos las letras que van componiendo la abreviatura
         * En texto leeremos el texto a abreviar
         * candidata guarda el siguiente caracter de la abreviatura hasta que cumpla la condición de longitud*/
        String abreviatura, texto, candidata;
        int longpalabra;
       
        //Mientras el texto no sea vacío hay que leer y se lee texto al menos una vez
        
        //Inicializamos abreviatura y leemos la cadena de texto para la primera iteración
        
        abreviatura = "";
        System.out.print("Dime el texto a abreviar: ");
        texto = scr.nextLine().trim();
        
        do  {
        
            /*Doy por hecho que el primero nunca es blanco luego el primer carácter del
             * String se carga en candidata y el contador de longitud pasa a valer 1  */
            
            candidata = Character.toString(texto.charAt(0));
            longpalabra = 1;

                
            //Recorreremos el String desde 1 (primer caracter ya candidata) hasta su longitud máxima
            
            for (int i = 1; i < (texto.length()) ; i++) {
                
                // Si encontramos un blanco
                if ((texto.charAt(i) == ' ')) {
                                           
                    // Si además hemos recorrido palabra de más de 3
                    if (longpalabra > 4) {
                    
                    abreviatura += candidata;
                    candidata = Character.toString(texto.charAt(i+1));
                    longpalabra = 1;
                    
                    }
                    
                    // Si la palabra es de menos de 3
                    else {
                        
                    candidata = Character.toString(texto.charAt(i+1));
                    longpalabra = 1;
                        
                    }
                    
                }
                
                // No hemos encontrado blanco luego aumentamos longitud de palabra
                else longpalabra++;
                
            }
            
            
            /*Hemos llegado al final del String y hay que validar la última
             *palabra y añadir la inicial si es lo suficientemente larga    */
            
            if (longpalabra > 3) abreviatura += candidata;
            
            //Ya podemos dar la abreviatura
            System.out.println("La abreviatura es: "+ abreviatura.toUpperCase());
            
            
            //Iniciamos string y leeemos cadena para continuar el bucle
            
            abreviatura = "";
            System.out.print("Dime el texto a abreviar: ");
            texto = scr.nextLine().trim();
            
        }
        
        while (!texto.isEmpty()); //Repetimos do porque  (texto no es vacío)
        
        //Hemos salido del bucle por introducir un texto vacío y nos despedimos del usuario
        
        System.out.println("Has introducido un texto vacío. ¡Adios!");
    
    }
    
}
