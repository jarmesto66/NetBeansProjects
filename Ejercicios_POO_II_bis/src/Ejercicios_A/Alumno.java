package Ejercicios_A;


public class Alumno extends Persona {
    
    protected String grupo;
    protected double notaMedia;

    public Alumno(String grupo, double notaMedia, String n, String a, String f) {
        super(n, a, f);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }
    
    public String getGrupo() {
        return grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    @Override
    public String getNombre() {
        return "Alumno: "+ super.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + grupo + " " + notaMedia;
    }
    
    

    
}
