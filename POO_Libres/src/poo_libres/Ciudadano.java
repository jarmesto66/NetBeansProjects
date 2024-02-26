
package poo_libres;

/**
 *
 * @author JAVIER ARMESTO BARTOLOME
 */
public class Ciudadano {
    
    //ATRIBUTOS
    String dni;
    String nombre, apellidos;
    String fNacimiento;

    public Ciudadano(String dni, String nombre, String apellidos, String fNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = fNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    public String toString() {
    return "Ciudadano: " + nombre + " " + apellidos +" y DNI " + dni + " nacido el " + fNacimiento;
  }
    
    
}