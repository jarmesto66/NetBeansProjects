package Ejercicios_A;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        
        //Lista de personas
        ArrayList<Persona> listado = new ArrayList();
       
        Persona p1 = new Persona ("Javier", "Armesto Bartolome", "01/11/1966");
        Persona p2 = new Persona("María", "González Pérez", "15/05/1989");
        Persona p3 = new Persona("Carlos", "Martínez López", "03/07/1975");
        
        listado.add(p1);
        listado.add(p2);
        listado.add(p3);
        
        // Creamos 3 objetos Profesor y los añadimos a la lista
        p1 = new Profesor(2000, "INF", "Lionel", "Tarazón", "4/4/1990");
        p2 = new Profesor(2250, "INF", "Paco", "Ramis", "5/5/1990");
        p3 = new Profesor(2500, "INF", "Emilio", "Javaloyas", "6/6/1990");
        listado.add(p1);
        listado.add(p2);
        listado.add(p3);
        
        // Creamos 3 objetos Alumno y los añadimos a la lista
        p1 = new Alumno("SMR1", 6, "Laura", "Bolinches", "7/7/2000");
        p2 = new Alumno("ASIR1", 9, "Mark", "Dev", "8/8/2000");
        p3 = new Alumno("DAW2", 7, "Elen", "Mika", "9/9/2000");
        listado.add(p1);
        listado.add(p2);
        listado.add(p3);
        
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i));
        }
        
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("");
        
        for (Persona l : listado) {
            System.out.println(l);
        }

        
    }
    
}
