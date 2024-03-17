/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

import java.util.HashMap;

/**
 *
 * @author jarmesto
 */
public class UsersLogin {
    
    //ATRIBUTOS
    private HashMap<Integer, String> usuarios = new HashMap<>(); // Declara e instancia un HashMap
    
    //CONSTRUCTOR
    public UsersLogin() {
        this.usuarios = new HashMap<>();
    }
    
    // Añade el usuario con el nia y pass indicados. Devuelve true si fué posible, false en caso contrario.
    public boolean añadir_usuario(int nia, String pass){
        if (!usuarios.containsKey(nia)){
            usuarios.put(nia, pass);
            return true;
        }
        return false; //Si llega hasta aquí es que no se ha podido añadir
    }
    
    // Elimina el usuario con el nia indicado. Devuelve true si fué posible, false en caso contrario.
    public boolean eliminar_usuario(int nia){
        if (!usuarios.containsKey(nia)){
            usuarios.remove(nia);
            return true;
        }
        return false; //Si llega hasta aquí es que no se ha podido añadir
    }
    
    // Muestra por pantalla todos los nia y pass. Un usuario por línea.
    public void imprimir(){
        for (int nia : usuarios.keySet()) {
            System.out.println(nia + " " + usuarios.get(nia));
        }
            
    }
    
    // Representa un intento de inicio de sesión utilizando el nia y pass pasados como argumentos. Devuelve true si el login es correcto
    // (coincide con un nia y pass existente), false en caso contrario.
    public boolean intentar_login(int nia, String pass){
        return usuarios.get(nia) == pass;
    }

    
}
