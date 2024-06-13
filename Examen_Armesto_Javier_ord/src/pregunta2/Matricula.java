package pregunta2;

public class Matricula {
    
    private String nombreNave;
    private String idPais;
    private int idNave;
    
    private static int idNaveContador = 0;

    public Matricula(String nombreNave, String idPais) {
            if (nombreNave.length() > 3 && nombreNave.length() < 6 && idPais.length() == 3) {
                this.nombreNave = nombreNave;
                this.idPais = idPais.toUpperCase();
                this.idNave = ++idNaveContador; // Incrementa y asigna el contador a idNave
            } else {
                throw new IllegalArgumentException("Invalid arguments for Matricula");
            }
        }
    
    //Getters
    public String getNombreNave() {
        return nombreNave;
    }

    public String getIdPais() {
        return idPais;
    }

    public int getIdNave() {
        return idNave;
    }

    //Setters - No generamos setIdNave pues el enunciado indica que no puede cambiarse
    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    @Override
    public String toString() {
        return nombreNave + "-" + idPais + "-" + idNave;
    }
    
    
    
    
    
    
}
