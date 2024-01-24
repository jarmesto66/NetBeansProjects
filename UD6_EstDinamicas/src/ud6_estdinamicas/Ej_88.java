/*
Implementa el control de acceso al área restringida de un programa para lo que se debe pedir un
nombre de usuario y una contraseña.
Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades, de forma que cuando se agoten, el programa dirá “Lo
siento, no tienes acceso al área restringida”.
Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una
estructura de la clase HashMap.
 */
package ud6_estdinamicas;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jarmesto
 */
public class Ej_88 {
    
    public static void main(String[] args) {

        Scanner readuser = new Scanner(System.in);
        Scanner readpwd = new Scanner(System.in);
        HashMap<String, String> IdPass = new HashMap(); //Declaramos la estructura de datos
        boolean correcto=false;
        int intentos =0;
        
        //Cargamos unos cuantos usuarios y contraseñas
        IdPass.put("jarmesto", "011166diaD");
        IdPass.put("mmartinez", "gatitolindo");
        IdPass.put("ltarazon", "casiEstoy99");
        
        do {
        
        ++intentos;
        System.out.print("Introduzca usuario: ");
        String leeuser = readuser.next();
        readuser.nextLine();
        
        System.out.print("Introduzca password: ");
        String leepwd = readpwd.next();
        readpwd.nextLine();
        
        if (IdPass.containsKey(leeuser)&&IdPass.containsValue(leepwd)) {
            correcto=true;
        }
        
        } while ((!correcto)&&(intentos<3)); //Mientras no acertemos 'correcto' y los intentos sean menores de 3
        
        //Validemos el porqué hemos salido del bucle
        if (correcto) {
            
            //Correcto solo es true cuando hemos validado un usuario y contraseña
            System.out.println("Ha accedido al área restringida");
            
        } else {
            System.out.println("Lo siento, no tienes acceso al área restringida");
        }
        
    }
    
}
