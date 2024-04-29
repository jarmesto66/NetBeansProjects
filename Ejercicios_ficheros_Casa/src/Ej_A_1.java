
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
Implementa un programa que pida al usuario introducir por teclado una ruta del sistema de archivos
(por ejemplo, “C:/Windows” o “Documentos”) y muestre información sobre dicha ruta (ver función más abajo).
El proceso se repetirá una y otra vez hasta que el usuario introduzca una ruta vacía (tecla intro). Deberá manejar las posibles excepciones.
Crea la función void muestraInfoRuta(File ruta) que dada una ruta de tipo File haga lo siguiente:
● Si es un archivo, mostrará por pantalla el nombre del archivo.
● Si es un directorio, mostrará por pantalla la lista de directorios y archivos que contiene (sus nombres).
Deberá mostrar primero los directorios y luego los archivos.
● En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para indicar si es un directorio o un archivo respectivamente.
● Si el path no existe lanzará un FileNotFoundException.
 */

public class Ej_A_1 {
    
    public static void main(String[] args) {
        
        String ruta;
        Scanner scr = new Scanner (System.in);
        
        do {
            
            System.out.print("Dime la ruta del sistema a inspeccionar: ");
            ruta = scr.nextLine();
            System.out.println(ruta);
            try {
                muestraInfoRuta(ruta);
            } catch (FileNotFoundException e) {
                
            }
            
        } while (!ruta.isEmpty());
        
    }
    static void muestraInfoRuta(String ruta) throws FileNotFoundException {
        
        File r = new File(ruta);
        if (r.exists()){ //La ruta existe
            
            if (r.isFile()){ //Es un archivo
                System.out.println("Es un archivo y su nombre es: " + r.getName());
            } else if (r.isDirectory()) { //Es un directorio
                System.out.println("Hacer un ls");
                listaDir(ruta);
                }
            
            System.out.println("La ruta existe.");
            
        } else {
            
            throw new FileNotFoundException();
        }
    }
    static void listaDir(String ruta){
        
        File dir = new File (ruta);
        File [] lista = dir.listFiles();
        ArrayList<String> ls = new ArrayList<>();
        System.out.println("Contenido de " + dir.getAbsolutePath() + " :");
        
        //Recorremos el array y mostramos cada nombre
        for (File f : lista) {

            if (f.isDirectory()){
                ls.add("[DIR] " + f.getName());
            } else {
                ls.add("[ARX] " + f.getName());
            }
        }
        ls.sort(Comparator.naturalOrder());
        System.out.println(ls);
        for (String l : ls) {
            System.out.println(l);
        }
    }
}
