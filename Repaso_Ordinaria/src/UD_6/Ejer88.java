/* Implementa el control de acceso al área restringida de un programa para lo que se debe pedir un
nombre de usuario y una contraseña.
Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades, de forma que cuando se agoten, el programa dirá “Lo
siento, no tienes acceso al área restringida”.
Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una
estructura de la clase HashMap.
*/

package UD_6;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer88 {
    
    public static void main(String[] args) {
        
        int intentos = 0;
        String user;
        String pwd;
        int intento = 0;

        HashMap<String,String> users = new HashMap<String,String>();
        users.put("Javier", "javier");
        users.put("Luis", "luis");
        users.put("Alumno", "alumno");

        Scanner in = new Scanner(System.in);

        
        do {
            System.out.print("Dime tu usuario: ");
            user = in.nextLine();
            System.out.print("Password: ");
            pwd = in.nextLine();
            System.out.println("");
            if (pwd.equals(users.get(user))) {
                System.out.println("Ha accedido al área restringida");
                intento = 0;
            } else {
                intento+=1;
            }
        } while (intento<3);
        
        System.out.println("Lo siento, no tienes acceso al área restringida");
    }
}
