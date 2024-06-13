package pregunta3;

public class TrabajadorFabrica extends Trabajador {
    
    private int horasNocturnas;
    private final int horasMaximasFabrica = 30;
    private final int horasMinimasFabrica = 0;
    private final int valorHoraNoche = 20;

    public TrabajadorFabrica(int horasNocturnas, String nombre) {
        super(nombre);
        this.horasNocturnas = horasNocturnas;
    }

    public int getHorasNocturnas() {
        return horasNocturnas;
    }

    public int getHorasMaximasFabrica() {
        return horasMaximasFabrica;
    }

    public int getHorasMinimasFabrica() {
        return horasMinimasFabrica;
    }

    

    public void setHorasNocturnas(int horasNocturnas) {
        this.horasNocturnas = horasNocturnas;
    }
    
    public boolean trabajarNoche (int horas){
        if ((super.getHorasTrabajadas()+horas)<30){
            this.horasNocturnas+=horas;
            return true;
        } else return false;
        
    }
    
    public double cobrarNomina(TrabajadorFabrica t){
        
        double nomina;
                if ((t.getHorasTrabajadas()>t.horasMinimasFabrica) && (t.getHorasTrabajadas()<=t.horasMaximasFabrica)){
                nomina = (t.getHorasNocturnas()*t.valorHoraNoche)+((t.getHorasTrabajadas()-t.getHorasNocturnas()*t.getSueldoBase()));
                t.setContadorHorasTrabajadas(0);
                t.setHorasNocturnas(0);
                return nomina;
        }
        return -1; //Devuelve -1 si no se genera nómina
    }
    
}
