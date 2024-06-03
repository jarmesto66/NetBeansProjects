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
public class Alumno extends Persona {
    
    private int exp, curso;
    private String ciclo;
    private ArrayList notas;

    public Alumno(int exp, int curso, String ciclo, ArrayList notas, String nombre, String dni, String direccion, int telefono) {
        super(nombre, dni, direccion, telefono);
        this.exp = exp;
        this.curso = curso;
        this.ciclo = ciclo;
        this.notas = notas;
    }
    
    public void mostrarPersona(){
        
        super.mostrarPersona();
        
        System.out.println("Núm. expediente: " + this.exp);
        System.out.println("Ciclo: " + this.ciclo);
        System.out.println("Curso: " + this.curso);
        System.out.println("Notas: ");
        for ( Iterator it = this.notas.iterator(); it.hasNext();){
            System.out.println("\tNota: " + it.next());
        }
    }

    public int getExp() {
        return exp;
    }

    public int getCurso() {
        return curso;
    }

    public String getCiclo() {
        return ciclo;
    }

    public ArrayList getNotas() {
        return notas;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setNotas(ArrayList notas) {
        this.notas = notas;
    }
    
    
    
}
