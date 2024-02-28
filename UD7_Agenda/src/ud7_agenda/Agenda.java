
package ud7_agenda;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Agenda {
    
    //ATRIBUTOS
    private ArrayList<Contactos> contactos;

    // CONSTRUCTOR. Crea agenda vacía
    public Agenda() {
        contactos = new ArrayList<>();
    }

    //GETTERS
    public ArrayList<Contactos> getContactos() {
        return contactos;
    }
    
    int size(){
        return contactos.size();
    }
    
    //Vaciar la agenda
    public void clear(){
        contactos = new ArrayList<>();
    }

    // Agrega un contacto a la agenda. Devuelve true si lo ha podido agregar
    public boolean agregar(Contactos contacto){
        //Si la agenda no está llena y no existe un contacto con ese nombre
        if (comprobarSiExiste(contacto.getNombre())){
            System.err.println("ERROR: No se puede agregar el contacto. Ya existe un contacto con ese nombre.");
            return false;
        } else {
            contactos.add(contacto);
            return true;
        }
    }
    
    //Devuelve true si existe algún contacto con nombre 'nombre'
    public boolean comprobarSiExiste(String nombre){
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    // Métodos para buscar contactos por nombre, teléfono, correo o global (los 3).
    // Devuelven un ArrayList<Integer> con las posiciones de los contactos encontrados
    
    public ArrayList<Integer> buscarNombre(String str){
        ArrayList<Integer> encontrados = new ArrayList<>();
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().toUpperCase().contains(str.toUpperCase())){
                encontrados.add(i);
            }
        }
        return encontrados;
    }
    
    public ArrayList<Integer> buscarCorreo(String str){
        ArrayList<Integer> encontrados = new ArrayList<>();
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getEmail().toUpperCase().contains(str.toUpperCase())){
                encontrados.add(i);
            }
        }
        return encontrados;
    }
    
    public ArrayList<Integer> buscarTelefono(String str){
        ArrayList<Integer> encontrados = new ArrayList<>();
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getEmail().toUpperCase().contains(str.toUpperCase())){
                encontrados.add(i);
            }
        }
        return encontrados;
    }
    
    public ArrayList<Integer> buscarGlobal (String str){
        ArrayList<Integer> encontrados = new ArrayList<>();
        str = str.toUpperCase();
        for (int i = 0; i < contactos.size(); i++) {
            String n = contactos.get(i).getNombre().toUpperCase();
            String t = contactos.get(i).getTelefono().toUpperCase();
            String e = contactos.get(i).getEmail().toUpperCase();
            if (n.contains(str)||t.contains(str)||e.contains(str)){
                encontrados.add(i);
            }
        }
        return encontrados;
    }
    
    public String toString(){
        String str = "";
        for (int i = 0; i < contactos.size(); i++) {
            str += ( i + ": " + contactos.get(i) + "\n");
        }
        return str;
    }
    
    //Imprime la información de todos los contactos
    public void imprimir(){
        System.out.println(toString());
    }
    
    //Imprime los contactos indicados en la lista
    public void imprimir(ArrayList<Integer> indices){
        for (int i : indices) {
            contactos.get(i).imprimir();
        }
    }
    
}
