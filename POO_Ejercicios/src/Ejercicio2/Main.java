/*
Construir un programa que dada una serie de vehículos caracterizados por su marca,
modelo y precio, imprima las propiedads del vehículo más barato. Para ello se deberán
leer por teclado las características de cada vehículo y crear una clase que represente
a cada uno de ellos.

DIAGRAMA DE CLASES

Vehiculo
- marca : String
- modelo : String
- precio : float
-------------------------------
Vehiculo(String marca, String modelo, float precio)
getPrecio() : float
mostrarDatos() : String
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jarmesto
 */

public class Main {
    
    public static int indiceCocheMBarato(Vehiculo coches []){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if(coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
            
        }
        return indice;
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        System.out.print("¿Cuántos vehículos vamoa a crear?: ");
        numeroVehiculos = entrada.nextInt();
        
        //Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();
            System.out.println("\nTeclee las características del coche "+(i+1)+": ");
            System.out.print("Introduzca marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca,modelo,precio);
        }
        
        indiceBarato = indiceCocheMBarato (coches);
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].monstrarDatos());
    }


    
}
