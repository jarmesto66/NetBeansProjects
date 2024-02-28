
package ud7_agenda;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Programa {
    
    public static void imprimirMenu(){
        System.out.println("1. Ver contactos.");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono.");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
    }
    
    public static int leerOpcion(){
        int op;
        boolean salir = false;
        Scanner rc = new Scanner (System.in);
        
        while (!salir){
            op = rc.nextInt();
        }
                
        return op;
    }


    public static void main(String[] args) {
        
        boolean salir = false;
        int op;
        
        while (!salir) {
            imprimirMenu();
            System.out.println("Introduce opción válida: ");
            op = leerOpcion();
            switch op {
            case 1:
                System.out.println("Veamos los contactos");
            case 2:
            case 3:
            case 4:
                String nom;
                nom = rc.next();
                System.out.print("Dame el nombre a buscar: ");
                buscarNombre(nom);
            case 5:
            case 6:
            case 7:
            case 8: 
                imprimirMenu();
            break;
            }
        }
        
    }
    
}
