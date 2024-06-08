package Ej1a;

/**
 *
 * @author María
 */

public class Examen {
    
    String asignatura;
    String aula;
    Hora hora;
    Fecha fecha;

    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getAula() {
        return aula;
    }

    public Hora getHora() {
        return hora;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Examen " + "asignatura= " + asignatura + ", aula= " + aula + ", hora= " + hora + ", fecha= " + fecha;
    }
    
    
    
}
