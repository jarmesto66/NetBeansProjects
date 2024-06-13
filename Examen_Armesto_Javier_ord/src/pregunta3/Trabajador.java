package pregunta3;

public class Trabajador {
    
    private String nombre;
    private int contadorHorasTrabajadas;
    private final int sueldoBase = 10;

    // Constructor
    public Trabajador(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
        this.contadorHorasTrabajadas = 0;
    }
    
    // Método para incrementar las horas trabajadas
    public void trabajar(int horas){
        if (horas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas");
        }
        this.contadorHorasTrabajadas += horas;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return contadorHorasTrabajadas;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    // Setter para el nombre con validación
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    // Eliminar el setter para `contadorHorasTrabajadas`
    // No es necesario un setter para `contadorHorasTrabajadas`, ya que `trabajar` gestiona las horas trabajadas
    
}