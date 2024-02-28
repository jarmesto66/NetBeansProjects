
package ud7_agenda;

/**
 *
 * @author jarmesto
 */
public class Contactos {
    
    //ATRIBUTOS
    private String nombre, telefono, email;

    //CONSTRUCTOR
    public Contactos(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    //GETTERS y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //OTROS METODOS
    
    //Devuelve un String con la información del contacto
    public String toString(){
        return (nombre + " " + telefono + " " + email);
    }
    
    //Imprime la información del contacto
    public void imprimir(){
        System.out.println(toString());
    }
    
}
