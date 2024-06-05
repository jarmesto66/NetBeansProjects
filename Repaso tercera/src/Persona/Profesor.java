package Persona;

public class Profesor extends Persona {

    private int salario;
    private String especialidad;

    public Profesor(int salario, String especialidad, String nombre, String apellidos, String fechaNacim) {
        super(nombre, apellidos, fechaNacim);
        this.salario = salario;
        this.especialidad = especialidad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String getNombre(){
        return "Profesor: " + super.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + "Salario " + salario + " Especialidad " + especialidad;
    }
    
    
}
