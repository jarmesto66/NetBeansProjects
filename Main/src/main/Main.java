package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String rutaintroducida = "";
        
        //Mientras rutaintroducida sea distinta de vacía
        do{
            try {
                System.out.println("Introduce la ruta (intro para salir): ");
                rutaintroducida = in.nextLine();
                
                if (!rutaintroducida.equals("")) {
                    File f = new File(rutaintroducida);
                    muestraInfoRuta(f);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        } while (!rutaintroducida.equals(""));
        System.out.println("Fin del programa");
        
    }

    private static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        //Si la ruta no existe lanza una excepción
        if (!ruta.exists()){
        throw new FileNotFoundException("La ruta introducida no existe");
        }
        //Si la ruta es un arcivo, muestra el nombre del archivo
        if (ruta.isFile()){
            System.out.println("Nombre del archivo: " + ruta.getName());
        } else if (ruta.isDirectory()){ //Si no, si la ruta es una carpeta, primero busca la lista de carpetas y después muestra los archivos
            File[] lista = ruta.listFiles();
            
            //Recorre la lista y muestra las carpetas
            for (File lista1 : lista) {
                if (lista1.isDirectory()) {
                    System.out.println("[*] " + lista1.getName());
                }
            }
            //Recorre la lista y muestra los archivos
            for (File lista1 : lista) {
                if (lista1.isFile()) {
                    System.out.println("[A] " + lista1.getName());
                }
            }
        }
    }
}
