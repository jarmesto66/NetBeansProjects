    
class Serie extends Contenido {
        
        private int nTemporadas;
        private boolean finalizada;

    public Serie(int nTemporadas, boolean finalizada, String titulo, String productora, int año) {
        super(titulo, productora, año);
        this.nTemporadas = nTemporadas;
        this.finalizada = finalizada;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    /*@Override
    public String toString() {
        return super.toString() + "Serie{" + "nTemporadas=" + nTemporadas + ", finalizada=" + finalizada + '}';
    }*/
    
    
        
        
        
}
