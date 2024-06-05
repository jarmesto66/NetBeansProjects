package Persona;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        //Instanciamos Persona
        Persona persona1 = new Persona("Javier", "Armesto Bartolomé", "01/11/1966");
        Persona persona2 = new Persona("Lionel", "Alcocer", "02/01/1976");
        Persona persona3 = new Persona("Andrés", "Martínez Prior", "11/08/1936");
        
        //Instanciamos Profesor
        Profesor profesor1 = new Profesor(2000, "PRG", "Javier", "Armesto Bartolomé", "01/11/1966");
        Profesor profesor2 = new Profesor(2000, "SSII", "Jose Manuel", "Navarro", "05/10/1976");
        Profesor profesor3 = new Profesor(2000, "PRG", "Javier", "Armesto Bartolomé", "09/12/1980");
        
        //Instanciamos Alumno
        Alumno alumno1 = new Alumno("PRIMERO", 5.6, "Javier", "Pérez Pérez", "28/08/2000");
        Alumno alumno2 = new Alumno("SEGUNDO", 6.7, "Maikol", "Andrés Navarro", "28/08/2000");
        Alumno alumno3 = new Alumno("TFC", 9, "Luis", "Martínez Andrés", "28/08/2000");
        
        // Persona String nombre, String apellidos, String fechaNacim
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(profesor1);
        personas.add(profesor2);
        personas.add(profesor3);
        personas.add(alumno1);
        personas.add(alumno2);
        personas.add(alumno3);
        
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
        
    }
    
}
