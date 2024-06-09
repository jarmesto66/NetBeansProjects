/*
Escribe una clase Disco que herede de la clase Multimedia ya realizada. La clase Disco tiene,
aparte de los elementos heredados, un atributo para almacenar el género al que pertenece
(rock, pop, punk, etc.). La clase debe tener un método para obtener el nuevo atributo y debe
sobrescribir el método toString() para que devuelva, además de la información heredada,
la nueva información.
 */
package Ej3a;

/**
 *
 * @author María
 */
public class Disco extends Multimedia {
    
    String genero;

    public Disco(String genero, String titulo, String autor, Formato formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Disco{" + "genero=" + genero + '}';
    }
    
    
    
}
