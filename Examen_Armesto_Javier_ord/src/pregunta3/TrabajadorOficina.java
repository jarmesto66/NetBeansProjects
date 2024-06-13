package pregunta3;

public class TrabajadorOficina extends Trabajador {
    
    private final int horasMinimasOficina = 20;
    private int horasMaximasOficina = 40;

    public TrabajadorOficina(String nombre) {
        super(nombre);
    }

    public int getHorasMinimasOficina() {
        return horasMinimasOficina;
    }

    public int getHorasMaximasOficina() {
        return horasMaximasOficina;
    }

    public double cobrarNomina(TrabajadorOficina t){
        
        double nomina;
        
            if ((t.getHorasTrabajadas()>t.horasMinimasOficina) && (t.getHorasTrabajadas()<=t.horasMaximasOficina)){
                //Cobra trabajador de oficina
                nomina = t.getHorasTrabajadas()*t.getSueldoBase();
                t.setContadorHorasTrabajadas(0);
                
            } else if (t.getHorasTrabajadas()<t.horasMinimasOficina){
                nomina = t.getHorasTrabajadas()*t.getSueldoBase();
                t.setContadorHorasTrabajadas(0);
                return (nomina-((nomina*25)/100));
            }
            
            return -1; //Devuelve -1 si no se genera nómina
    }
    
}
    

