/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package Ejercicio_E2;

import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
    public class Persona {
    
    private int edad;
    private final String dni;
    private String nombre, apellidos;
    private final boolean mayoriaEdad;

    public Persona(String dni, int edad, String nombre, String apellidos) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mayoriaEdad = esMayorEdad();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public void imprime(){
        System.out.println("DNI: " + this.getDni() + " Nombre y apellidos: " + this.getNombre() + " " + this.getApellidos() + " Edad: " + this.getEdad());
    }
    
    public boolean esMayorEdad(){
        if (this.getEdad()>17) return true;
        else return false;
    }
    
    public boolean esJubilado(){
        if (this.getEdad()>=65) return true;
        else return false;
    }
    
    public int diferenciaEdad(Persona p){
        return Math.abs(this.getEdad()-p.getEdad());
    }
    
    public static boolean validarDNI(String dni){
        //Expresión regular que indica 8 digitos y al final alguna de las letras que se permiten
        //A-H J-N P-T V-Z
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        return Pattern.matches(dniRegexp, dni);
    }
        
}
