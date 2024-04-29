

/*
Partiendo de una copia del programa anterior, modifica la función muestraInfoRuta:
● En el caso de un directorio, mostrará primero los directorios en orden alfabético y luego
los archivos en orden alfabético. Te será útil la función Arrays.sort().
● Añade un segundo argumento ‘boolean info’ que cuando sea ‘true’ mostrará, junto a la
información de cada directorio o archivo, su tamaño en bytes y la fecha de la última modificación.
Cuando ‘info’ sea ‘false’ mostrará la información como en el ejercicio anterior.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ej_A_2 {
    
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
        ArrayList<String> directorios = new ArrayList<>();
        ArrayList<String> archivos = new ArrayList<>();
        System.out.println("Contenido de " + dir.getAbsolutePath() + " :");
        
        //Recorremos el array y mostramos cada nombre
        for (File f : lista) {

            if (f.isDirectory()){
                directorios.add("[DIR] " + f.getName());
            } else {
                archivos.add("[ARX] " + f.getName());
            }
        }
        directorios.sort(Comparator.naturalOrder());
        archivos.sort(Comparator.naturalOrder());
        //System.out.println(ls);
        for (String d : directorios) {
            System.out.println(d);
        }
        
        for (String a : archivos) {
            System.out.println(a);
        }
    }
}
