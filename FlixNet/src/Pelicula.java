
class Pelicula extends Contenido {
    
    protected int numNominaciones, numOscars;

    public Pelicula(int numNominaciones, int numOscars, String titulo, String productora, int año) {
        super(titulo, productora, año);
        this.numNominaciones = numNominaciones;
        this.numOscars = numOscars;
    }
    
    public int getNumNominaciones() {
        return numNominaciones;
    }

    public int getNumOscars() {
        return numOscars;
    }

    public void setNumNominaciones(int numNominaciones) {
        this.numNominaciones = numNominaciones;
    }

    public void setNumOscars(int numOscars) {
        this.numOscars = numOscars;
    }

}