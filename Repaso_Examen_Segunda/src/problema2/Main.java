/*
En una ventana de inicio de sesión los usuarios introducen su nia y pass (contraseña) para
iniciar sesión. El nia es un identificador numérico único (no pueden haber dos usuarios con el
mismo nia) y el pass es un código alfanumérico (puede tener letras y números).
Programa la clase UsersLogin según estas indicaciones:
1. Su único atributo es un HashMap para almacenar los nia y contraseña de los usuarios.
2. Deberá tener un constructor. Los getter/setter no son necesarios.
3. Deberá tener estos métodos:
1. boolean añadir_usuario(int nia, String pass) => Añade el usuario con el nia y pass
indicados. Devuelve true si fué posible, false en caso contrario.
2. boolean eliminar_usuario(int nia) => Elimina el usuario con el nia indicado. Devuelve
true si fué posible, false en caso contrario.
3. void imprimir() => Muestra por pantalla todos los nia y pass. Un usuario por línea.
4. boolean intentar_login(int nia, String pass) => Representa un intento de inicio de sesión
utilizando el nia y pass pasados como argumentos. Devuelve true si el login es correcto
(coincide con un nia y pass existente), false en caso contrario.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author jarmesto
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        int nia_semilla = 10;
        int nia;
        String pass;
        UsersLogin userLogin = new UsersLogin();
        for (int i = 0; i < 10; i++) {
        System.out.print(" " + nia_semilla + " ");
        userLogin.añadir_usuario(nia_semilla, "CocoLoco");
            nia_semilla++;
        }
        userLogin.imprimir();
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce NIA: ");
        nia = sc.nextInt();
        System.out.print("Introduce pass: ");
        pass = sc.next();
        System.out.println(pass);
        
        if (userLogin.intentar_login(10, "CocoLoco")){
            System.out.println("CORRECTO");
        }
        else System.out.println("NO CORRECTO");
        
        
        
    }
    
}
