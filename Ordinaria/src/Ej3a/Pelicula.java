/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3a;

/**
 *
 * @author María
 */
public class Pelicula extends Multimedia {
    
    String actor, actriz;

    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        if (actor== null && actriz == null){
            throw new IllegalArgumentException("Debe haber, al menos, un actor o actriz principal.");
        }
        this.actor = actor;
        this.actriz = actriz;
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("actor=").append(actor);
        sb.append(", actriz=").append(actriz);
        sb.append('}');
        return sb.toString();
    }
    
}
