/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enunciado;

/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {
        
        Equipo equipo = new Equipo("Valencia");
        
        equipo.agregarFutbolista(new Futbolista ("Portero_1", 22, Posicion.PORTERO));
        equipo.agregarFutbolista(new Futbolista ("Centrocampista_1", 24, Posicion.CENTROCAMPISTA));
        equipo.agregarFutbolista(new Futbolista ("Defensa_1", 25, Posicion.DEFENSA));
        equipo.agregarFutbolista(new Futbolista ("Delantero_1", 21, Posicion.DELANTERO));
        equipo.agregarFutbolista(new Futbolista ("Portero_2", 22, Posicion.PORTERO));
        equipo.agregarFutbolista(new Futbolista ("Centrocampista_2", 24, Posicion.CENTROCAMPISTA));
        equipo.agregarFutbolista(new Futbolista ("Defensa_2", 25, Posicion.DEFENSA));
        equipo.agregarFutbolista(new Futbolista ("Delantero_2", 21, Posicion.DELANTERO));
        equipo.agregarFutbolista(new Futbolista ("Portero_3", 22, Posicion.PORTERO));
        equipo.agregarFutbolista(new Futbolista ("Centrocampista_3", 24, Posicion.CENTROCAMPISTA));
        equipo.agregarFutbolista(new Futbolista ("Defensa_3", 25, Posicion.DEFENSA));
        equipo.agregarFutbolista(new Futbolista ("Delantero_3", 21, Posicion.DELANTERO));
        
        equipo.listarFormacionEquipo();
    }
    
}
