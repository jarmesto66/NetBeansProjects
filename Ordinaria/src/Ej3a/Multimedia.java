package Ej3a;

/**
Escribe una clase Multimedia para almacenar información de objetos de tipo multimedia
* (películas, discos, mp3...). Esta clase contiene título, autor, formato y duración como atributos.
* El formato puede ser uno de los siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd.
* El valor de todos los atributos se pasa por parámetro en el momento de crear el objeto.
* Esta clase tiene, además, un método para devolver cada uno de los atributos y un método toString()
* que devuelve la información del objeto. Por último un método equals() que recibe un objeto de tipo
* Multimedia y devuelve true en caso de que el título y el autor sean iguales a los del objeto que
* llama al método y false en caso contrario.
 */
public class Multimedia {
    
    private String titulo;
    private String autor;
    private int duracion;
    private Formato formato;

    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Multimedia{ ");
        sb.append("titulo= ").append(titulo);
        sb.append(", autor= ").append(autor);
        sb.append(", formato= ").append(formato);
        sb.append(", duracion= ").append(duracion);
        sb.append(" }");
        return sb.toString();
    }
    
    public boolean equals(Multimedia m){
        return (this.titulo.equals(m.getTitulo()))&&(this.autor.equals(m.getAutor()));
    }
    
    
}