package problema2;

import java.util.HashMap;

public class UsersLogin {

    // HashMap donde se guardan los nia y password
    private HashMap<Integer, String> niapass;
    //              CLAVE -> VALOR
    //              nia   -> pass

    // constructor
    public UsersLogin() {
        this.niapass = new HashMap<>();
    }

    // añade un nuevo usuario, devuelve true/false si fué posible
    public boolean añadir_usuario(int nia, String pass) {
        // si ya existe ese nia, devuelve false
        if (niapass.containsKey(nia)) {
            return false;
        }
        // si no existe ese nia, se añade al HashMap
        niapass.put(nia, pass);
        return true;
    }

    // elimina un usuario, devuelve true/false si fué posible
    public boolean eliminar_usuario(int nia) {
        // si existe ese nia, lo eliminamos
        if (niapass.containsKey(nia)) {
            niapass.remove(nia);
            return true;
        }
        // si no existe, no se puede eliminar
        return false;
    }

    // imprime por pantalla todos los nia y pass
    public void imprimir() {
        for (int nia : niapass.keySet()) {
            System.out.println(nia + " " + niapass.get(nia));
        }
    }

    // intenta hacer login con el nia y pass indicados, devuelve true/false si fué posible
    public boolean intentar_login(int nia, String pass) {
        // si no existe ese nia, devuelve false
        if (!niapass.containsKey(nia)) {
            return false;
        }
        // si existe ese nia, devuelve true si el pass coincide
        return (niapass.get(nia).equals(pass));
    }

}
