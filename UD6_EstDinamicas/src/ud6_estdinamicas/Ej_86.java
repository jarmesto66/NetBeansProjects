/*
Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación muestra esos nombres
por pantalla. Utiliza para ello un bucle for que recorra todo el ArrayList.
 */
package ud6_estdinamicas;

import java.util.ArrayList;

/**
 *
 * @author jarmesto
 */
public class Ej_86 {


    public static void main(String[] args) {
        
        ArrayList<String> companys = new ArrayList(); //Declaramos el ArrayList
        companys.add("Javier"); //Vamos añadiendo Strings con los nombres
        companys.add("Inma");
        companys.add("Fátima");
        companys.add("Fernando");
        companys.add("Kimo");
        companys.add("Eduardo");
        for (int i = 0; i < companys.size(); i++) { //Desde la posición cero y hasta el tamaño del ArrayList
            System.out.println(companys.get(i));
            
        }
        
    }
    
}
