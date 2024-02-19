package Coche;

/**
 *
 * @author USER
 */
public class Coche {
    
    public enum TipoCoche { 
        MINI,
        UTILITARIO,
        FAMILIAR,
        DEPORTIVO };

    public enum ModalidadSeguro {
        TERCEROS,
        TODO_RIESGO };
    
        
    //ATRIBUTOS
    private String modelo,color;
    private boolean metalizada;
    private String matricula;
    private int año;
    private TipoCoche tipo;
    private ModalidadSeguro modalidad;

    public Coche(String modelo, String color, boolean metalizada, String matricula, int año, TipoCoche tipo, ModalidadSeguro modalidad) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.año = año;
        this.tipo = tipo;
        this.modalidad = modalidad;
    }



    public Coche() {
    }
    
    
    
    //GETTERS
    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public String getModelo() {
        return modelo;
    }

    public ModalidadSeguro getSeguro() {
        return modalidad;
    }

    public TipoCoche getTipo() {
        return tipo;
    }
    
    
    //SETTERS
    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setSeguro(ModalidadSeguro seguro) {
        this.modalidad = seguro;
    }

    public void setTipo(TipoCoche tipo) {
        this.tipo = tipo;
    }
    
    
    //OTROS METODOS
    public void imprime() {
        System.out.println("MODELO: " + modelo + "\n"
                + "COLOR: " + color + "\n"
                + "PINTURA METALIZADA: " + metalizada + "\n"
                + "MATRÍCULA: " + matricula + "\n"
                + "AÑO FABRICACIÓN: " + año + "\n"
                + "TIPO COCHE: " + tipo + "\n"
                + "MODALIDAD SEGURO: " + modalidad + "\n"
                + "");
}
}