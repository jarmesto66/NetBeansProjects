package pregunta1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Pregunta1 {
    
    public static void main(String[] args) {
        
        //Para abrir el fichero
        String nombreF;
        String palabra = "";
        File f = new File(nombreF);
        int contador;
        
        Scanner scr = new Scanner(System.in);
        System.out.println("Dime el nombre del fichero: ");
        nombreF = scr.nextLine();
        
        try{
            //Creamos un objeto FileReader
            FileReader filereader = new FileReader(nombreF);
            HashMap<Integer, String> palabras =new HashMap<Integer,String>();
            
            while ((filereader.read()!=-1)){
                contador=0;
                while ((filereader.read()!=-1)){
                    palabra = palabra.trim().concat(filereader.toString());
                }
                contador++;
                palabras.put(contador, palabra);
            }
            
            String palabraAComparar;
            
            while (!palabras.isEmpty()) {
                int cont = 0;
                palabraAComparar = palabras.get(cont);
                for (int i = 0; i < contador; i++) {
                    if (palabraAComparar.equals(palabras.get(contador+1))) cont++;
                }
                System.out.println(palabras.get(cont) + ": " + cont);
                palabras.remove(cont);
            }
                
            
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
        
    }
    
}
