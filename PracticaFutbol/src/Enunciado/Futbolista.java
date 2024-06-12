package Enunciado;

import java.util.ArrayList;
import java.util.List;

public class Futbolista implements Deportista {
    
    private String nombre;
    private int edad;
    private Posicion posicion;
    
    private int anyosProfesional;
    private List<String> equipos;
    private int trofeos;

    public Futbolista(String nombre, int edad, Posicion posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.anyosProfesional = 0;
        this.trofeos = 0;
        this.equipos = new ArrayList<>();
    }

    public Futbolista(String nombre, int edad, Posicion posicion, int anyosProfesional, int trofeos) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.anyosProfesional = anyosProfesional;
        this.trofeos = trofeos;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public List<String> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<String> equipos) {
        this.equipos = equipos;
    }

    public int getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(int trofeos) {
        this.trofeos = trofeos;
    }
    
    public void agregarEquipo(String equipo){
        equipos.add(equipo);
    }

    @Override
    public String toString() {
        return "Futbolista " + nombre + " con edad " + edad + " que ocupa la posición " 
                + posicion.getNombrePosicion() + " con " + anyosProfesional 
                + " con " + trofeos + " trofeos. Su rango salarial estará entre " + posicion.getSalarioMinimo() + " y " 
                + posicion.getSalarioMaximo();
    }
  

    @Override
    public int getAnyosProfesional() {
        return anyosProfesional;
    }

    @Override
    public List<String> getListadoEquipos() {
        return new ArrayList<>(this.equipos); //Devolvemos copia
    }

    @Override
    public int getTotalTrofeos() {
        return trofeos;
    }
    
    
    
}
