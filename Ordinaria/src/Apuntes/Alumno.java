/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apuntes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author María
 */
public class Alumno extends Persona{
    
    private int exp;
    private String ciclo;
    private int curso;
    private ArrayList notas;

    public Alumno(int exp, String ciclo, int curso, ArrayList notas, String nombre, String dni, String direccion, int telefono) {
        super(nombre, dni, direccion, telefono);
        this.exp = exp;
        this.ciclo = ciclo;
        this.curso = curso;
        this.notas = notas;
    }

    public int getExp() {
        return exp;
    }

    public String getCiclo() {
        return ciclo;
    }

    public int getCurso() {
        return curso;
    }

    public ArrayList getNotas() {
        return notas;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setNotas(ArrayList notas) {
        this.notas = notas;
    }
    
    public void mostrarPersona(){
        super.mostrarPersona();
        System.out.println("Núm expediente: " + this.exp);
        System.out.println("Ciclo: " + this.ciclo);
        System.out.println("Curso: " + this.curso);
        System.out.println("Notas: ");
        for (Iterator it = this.notas.iterator(); it.hasNext();){
            System.out.println("\tNota: " + it.next());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlumno { " + " exp= " + exp + " , ciclo= " + ciclo + " , curso= " + curso + " , notas= " + notas + " }";
    }
    
    
    
    
}
