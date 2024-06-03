/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author María
 */
public class Profesor extends Persona {
    
    private int cod;
    private String depto, horario;
    private ArrayList modulos;

    public Profesor(int cod, String depto, String horario, ArrayList modulos, String nombre, String dni, String direccion, int telefono) {
        super(nombre, dni, direccion, telefono);
        this.cod = cod;
        this.depto = depto;
        this.horario = horario;
        this.modulos = modulos;
    }
    
    public void mostrarPersona(){
        
        super.mostrarPersona();
        
        System.out.println("Código: " + this.cod);
        System.out.println("Departamento: " + this.depto);
        System.out.println("Horario: " + this.horario);
        System.out.println("Módulos:");
        for (Iterator it = this.modulos.iterator(); it.hasNext();) {
            System.out.println("\tMódulo: " + it.next());
        }
    }

    public int getCod() {
        return cod;
    }

    public String getDepto() {
        return depto;
    }

    public String getHorario() {
        return horario;
    }

    public ArrayList getModulos() {
        return modulos;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setModulos(ArrayList modulos) {
        this.modulos = modulos;
    }
    
    
    
}
