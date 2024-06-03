/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaSolar;

import java.util.ArrayList;

/**
 *
 * @author María
 */
public class SistemaSolar {
    
    String nombre;
    ArrayList<Planeta> planetas;

    public SistemaSolar(String nombre) {
        this.nombre = nombre;
        this.planetas = new ArrayList<>();
    }

    public ArrayList<Planeta> getPlanetas(){
        return planetas;
    }
    
    public Planeta getPlaneta(int posicion){
        return planetas.get(posicion);
    }
    
    
    public void agregarPlaneta(){
        
        
    }
    
}
