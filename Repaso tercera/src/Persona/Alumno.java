package Persona;

public class Alumno extends Persona {
    
    private String grupo;
    private double notaMedia;

    public Alumno(String grupo, double notaMedia, String nombre, String apellidos, String fechaNacim) {
        super(nombre, apellidos, fechaNacim);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    @Override
    public String getNombre(){
        return "Alumno: " + super.getNombre();
    }
    
    @Override
    public String toString() {
        return super.toString() + "Grupo " + grupo + " Nota media " + notaMedia;
    }
}
