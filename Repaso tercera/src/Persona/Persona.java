package Persona;

public class Persona {
    
    private String nombre;
    private String apellidos;
    private String fechaNacim;

    public Persona(String nombre, String apellidos, String fechaNacim) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = fechaNacim;
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
        return "Persona: " + "Nombre " + nombre + ", Apellidos " + apellidos + ", Fecha Nacimiento " + fechaNacim;
    }
    
    
}