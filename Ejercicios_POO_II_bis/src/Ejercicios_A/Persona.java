package Ejercicios_A;


public class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected String fechaNacim;

    public Persona(String n, String a, String f) {
        nombre = n;
        apellidos = a;
        fechaNacim = f;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + fechaNacim + " ";
    }
    
    
    
}
