package Ejercicios_A;


public class Profesor extends Persona {
    
    protected int salario;
    protected String especialidad;

    public Profesor(int salario, String especialidad, String n, String a, String f) {
        super(n, a, f);
        this.salario = salario;
        this.especialidad = especialidad;
    }
    
    public int getSalario() {
        return salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String getNombre() {
        return "Profesor: "+ super.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + salario + " " + especialidad;
    }
    
    
    
}
