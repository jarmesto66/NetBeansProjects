/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/



package ud6_estdinamicas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author María
 */
public class Ejemplo_iteracion {
    


    public static void main(String[] args) {
        // Crear un HashMap de ejemplo
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Valor1");
        hashMap.put(2, "Valor2");
        hashMap.put(3, "Valor3");
        hashMap.put(4, "Valor4");

        // Posición absoluta que quieres buscar
        int posicionAbsoluta = 3;

        // Iterar sobre las entradas del HashMap para encontrar la clave correspondiente a la posición
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (entry.getKey() == posicionAbsoluta) {
                System.out.println("Clave encontrada: " + entry.getValue());
                break; // Salir del bucle una vez que se ha encontrado la clave
            }
        }
    }
}
