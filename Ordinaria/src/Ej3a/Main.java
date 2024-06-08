/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3a;

/**
 *
 * @author María
 */
public class Main {
    public static void main(String[] args) {
        
        // Crear objetos Pelicula
        Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan", Formato.dvd, 148, "Leonardo DiCaprio", "Ellen Page");
        Pelicula pelicula2 = new Pelicula("The Dark Knight", "Christopher Nolan", Formato.mov, 152, "Christian Bale", null);

        // Mostrar información de las películas
        System.out.println(pelicula1);
        System.out.println(pelicula2);
    }
}

