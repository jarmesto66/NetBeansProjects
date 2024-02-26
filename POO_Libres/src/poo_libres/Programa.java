/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_libres;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */



public class Programa {
    
    public static void eliminarCensoPorDNI(ArrayList<Censo> padron, String dni) {
    // Variable para indicar si se encontró el censo con el DNI especificado
    boolean encontrado = false;
    
    // Recorrer la lista de censos
    for (int i = 0; i < padron.size(); i++) {
        Censo censo = padron.get(i);
        Ciudadano ciudadano = censo.getHabitante();
        // Verificar si el DNI coincide
        if (ciudadano.getDni().equals(dni)) {
            // Si coincide, eliminar el censo de la lista
            padron.remove(i);
            encontrado = true;
            System.out.println("Censo eliminado exitosamente para el ciudadano con DNI: " + dni);
            break; // Salir del bucle una vez que se elimine el censo
        }
    }
    
    // Si no se encuentra ningún censo con el DNI especificado
    if (!encontrado) {
        System.out.println("No se encontró ningún censo asociado al ciudadano con DNI: " + dni);
    }
}
    
    public static void imprimirMenu (){
        
        System.out.println("----------- MENÚ DEL PADRÓN -----------");
        System.out.println("1. IMPRIME CENSO");
        System.out.println("2. INTRODUCE DNI DEL CIUDADANO A ELIMINAR DEL CENSO");
        System.out.println("3.");
        System.out.println("0. SALIR");
        
    }
    
    public static void imprimeCenso(ArrayList<Censo> padron){
        
        for (int i = 0; i < padron.size(); i++) {
            System.out.println("Habitante: " + padron.get(i).habitante.nombre + " " + padron.get(i).habitante.apellidos + " con DNI " + padron.get(i).habitante.dni);
            System.out.println("Vivienda: " + padron.get(i).vivienda.direccion + " (" + padron.get(i).vivienda.poblacion + "), " + padron.get(i).vivienda.cp + ", " + padron.get(i).vivienda.provincia);
            System.out.println("Fecha de censo: " + padron.get(i).fecha_habita);
            System.out.println();
            
        }
        
    }


    public static void main(String[] args) {
        // TODO code application logic here
        
        Censo[] censos= new Censo[2];
        Scanner rc = new Scanner(System.in);
        int opMenu;
        boolean salir =false;
        
        ArrayList<Censo> padron = new ArrayList();

        
        //Creamos varios registros en el padrón
        Ciudadano ciudadano1 = new Ciudadano ("24338737E","JAVIER","ARMESTO BARTOLOME","01/11/1966");
        Ciudadano ciudadano2 = new Ciudadano ("24338738A","REYES","ARMESTO BARTOLOME","06/01/1975");
        Residencias residencia1 = new Residencias ("C/ JOSE BALLESTER 62","46022","València","VALENCIA");
        Residencias residencia2 = new Residencias ("C/ JOSE BALLESTER 58","46022","València","VALENCIA");
        Censo censo1 = new Censo(ciudadano1, residencia1, "31/12/2022");
        Censo censo2 = new Censo(ciudadano2, residencia2, "31/10/2021");
        
        padron.add(censo1);
        padron.add(censo2);
        

        
        
        
        while (!salir){
        
            imprimirMenu();
            System.out.print("Introduce opción: ");
            opMenu = rc.nextInt();
            switch (opMenu) {
            case 1:
                imprimeCenso(padron);
                break;
            case 2:
                System.out.print("Introduce el DNI del ciudadano a eliminar: ");
                String dniEliminar = rc.next();
                eliminarCensoPorDNI(padron, dniEliminar);
                break;
            case 3:
                //aumentarCopias(inventario);
                break;
            case 4:
                //disminuirCopias(inventario);
                break;
            case 5:
                //prestarLibro(inventario);
                break;
            case 6:
                //devolverLibro(inventario);
                break;
            case 7:
                //listarLibros(inventario);
                break;
            case 8:
                //listarLibrosDisponibles(inventario);
                break;
            case 9:
                //buscarLibroPorTitulo(inventario);
                break;
            case 10:
                //buscarLibroPorAutor(inventario);
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                salir = true;
                //rl.close();
                break;
            default:
                System.err.println("Opción no válida.");
                System.out.println("");

            }
    }
            
        }
        
}
