/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_libres;

/**
 *
 * @author USER
 */
public class Censo {
    
    Ciudadano habitante;
    Residencias vivienda;
    String fecha_habita;

    public Censo(Ciudadano habitante, Residencias vivienda, String fecha_habita) {
        this.habitante = habitante;
        this.vivienda = vivienda;
        this.fecha_habita = fecha_habita;
    }

    public Ciudadano getHabitante() {
        return habitante;
    }

    public void setHabitante(Ciudadano habitante) {
        this.habitante = habitante;
    }

    public Residencias getVivienda() {
        return vivienda;
    }

    public void setVivienda(Residencias vivienda) {
        this.vivienda = vivienda;
    }

    public String getFecha_habita() {
        return fecha_habita;
    }

    public void setFecha_habita(String fecha_habita) {
        this.fecha_habita = fecha_habita;
    }
    
    
    
}
