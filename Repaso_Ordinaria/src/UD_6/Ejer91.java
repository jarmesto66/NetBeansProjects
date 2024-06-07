
package UD_6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer91 {
    
    private static void escribirMenu(){
        
        System.out.println("---GRUPOS MUSICALES---");
        System.out.println("1. Agregar grupos el final");
        System.out.println("2. Agregar grupos en una posición");
        System.out.println("3. Recuperar grupo en una posición determinada");
        System.out.println("4. Modificar grupo en una posición determinada");
        System.out.println("5. Posición del grupo en la lista");
        System.out.println("6. Imprimir lista");
        System.out.println("7. Salir del programa");
        System.out.println("");
        System.out.print("INTRODUZCA OPCIÓN: ");
        
        
    }
    
    private static void imprimirLista(){
        
    }
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        ArrayList<String> grupos = new ArrayList();
        String nombre;
        int opcion, posicion;
        
        do{
            
            opcion = 0;
            escribirMenu();
            
            try{
            opcion = lector.nextInt();
            lector.nextLine();
            } catch (InputMismatchException ex){
                System.out.println("Introduzca un valor válido del menú");
                opcion = 0;
            }
            
            
            switch (opcion) {

                case 1: { // 1-Agregar grupo
                        System.out.print("Escribe el nombre del grupo: ");
                        nombre = lector.nextLine();
                        grupos.add(nombre);
                        break;
                }

                case 2: { // 2-Agregar grupo en una posición
                    System.out.print("Escribe la posición: ");
                    posicion = lector.nextInt();
                    lector.nextLine();
                    System.out.print("Escribe el nombre del grupo: ");
                    nombre = lector.nextLine();
                    if (posicion >= 0 && posicion <= grupos.size()) {
                        grupos.add(posicion, nombre);
                    } else {
                        System.out.println("Esa posición no es posible");
                    }
                    break;
                }

                case 3: { // 3-Recuperar grupo
                    System.out.print("Escribe la posición: ");
                    posicion = lector.nextInt();
                    lector.nextLine();
                    if (posicion >= 0 && posicion <= grupos.size()) {
                        System.out.println(grupos.get(posicion));
                    } else {
                        System.out.println("Esa posición no es posible");
                    }
                    break;
                }

                case 4: { // 4-Modificar grupo
                    System.out.print("Escribe la posición: ");
                    posicion = lector.nextInt();
                    lector.nextLine();
                    if (posicion >= 0 && posicion <= grupos.size()) {
                        System.out.println("El grupo era: " + grupos.get(posicion));
                        System.out.print("¿Cuál quieres que sea ahora? ");
                        nombre = lector.nextLine();
                        grupos.set(posicion, nombre);
                    } else {
                        System.out.println("Esa posición no es posible");
                    }
                    break;
                }

                case 5: { // 5-Posición del grupo
                    System.out.print("Escribe el nombre del grupo: ");
                    nombre = lector.nextLine();
                    posicion = grupos.indexOf(nombre);
                    if (posicion == -1) {
                        System.out.println("No se ha encontrado");
                    } else {
                        System.out.println("Está en la posición " + posicion);
                    }
                    break;
                }

                case 6: { // 6-Imprimir lista
                    for (int i = 0; i < grupos.size(); i++) {
                        System.out.println(i + ". " + grupos.get(i));
                    }
                    break;
                }

                case 7: { // 7-Salir del programa
                    System.out.println("Gracias por usar el programa");
                    break;
                }

                default:
                    System.out.println("Opción incorrecta.");
                    
            }


        } while (opcion!=7);
        
    }
}
