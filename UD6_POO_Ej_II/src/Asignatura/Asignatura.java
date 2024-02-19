/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignatura;

/**
 *
 * @author USER
 */
public class Asignatura {
    
    //Atributos de clase
    private String nombre;
    private int codigo;
    private int curso;

    public Asignatura(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }
    
    public Asignatura(){
        this.nombre="Vacía";
        this.codigo=0;
        this.curso=0;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCurso() {
        return curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void imprime(){
        
        System.out.println("La asignatura es: "+this.getNombre()+" código "+this.getCodigo()+" de "+this.getCurso()+" curso.");
        
    }
    
}
