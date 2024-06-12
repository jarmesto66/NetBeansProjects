package Enunciado;

public class RegistroFutbolistaException extends Exception {

    public RegistroFutbolistaException(Futbolista futbolista) {
        super("No se puede añadir el futbolista " + futbolista.getNombre() + " a la posición " + futbolista.getPosicion().getNombrePosicion() + ": Se han alcanzaod el número máximo de jugadores para esa posición");
    }
    
}
