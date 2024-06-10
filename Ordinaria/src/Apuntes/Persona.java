/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apuntes;

/**
 *
 * @author María
 */
public class Persona {
    
    private String nombre;
    private String dni;
    private String direccion;
    private int telefono;

    public Persona(String nombre, String dni, String direccion, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("DNI: "+this.dni);
        System.out.println("Dirección: "+this.direccion);
        System.out.println("Teléfono: "+this.telefono);
    }

    @Override
    public String toString() {
        return "Persona { " + "nombre= " + nombre + " , dni= " + dni + " , direccion= " + direccion + " , telefono= " + telefono + " }";
    }
    
    
    
}
