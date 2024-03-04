
package problema2;

import java.util.HashMap;

public class UsersLogin {
    private HashMap<Integer, String> usuarios;

    // Constructor
    public UsersLogin() {
        this.usuarios = new HashMap<>();
    }

    // Métodos públicos
    public boolean añadir_usuario(int nia, String pass) {
        if (!usuarios.containsKey(nia)) {
            usuarios.put(nia, pass);
            return true;
        }
        return false;
    }

    public boolean eliminar_usuario(int nia) {
        if (usuarios.containsKey(nia)) {
            usuarios.remove(nia);
            return true;
        }
        return false;
    }

    public void imprimir() {
        for (Integer nia : usuarios.keySet()) {
            System.out.println("NIA: " + nia + ", Contraseña: " + usuarios.get(nia));
        }
    }

    public boolean intentar_login(int nia, String pass) {
        if (usuarios.containsKey(nia) && usuarios.get(nia).equals(pass)) {
            return true;
        }
        return false;
    }
}
