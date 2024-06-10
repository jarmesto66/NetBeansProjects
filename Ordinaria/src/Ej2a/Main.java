package Ej2a;

public class Main {
    
    public static void main(String[] args) {
        
        Punto[] puntos ={
            new Punto(0,0),
            new Punto(2,0),
            new Punto(2,2),
            new Punto(0,2)
        };
        
        Poligono poligono = new Poligono (puntos);
        
        // Mostrar información del polígono y su perímetro
        System.out.println("Información del polígono:");
        System.out.println(poligono);
        System.out.println("Perímetro: " + poligono.perimetro() + "\n");

        // Trasladar el polígono 4 en el eje x y -3 en el eje y
        poligono.trasladar(4, -3);

        // Mostrar información del polígono después de trasladarlo
        System.out.println("Información del polígono después de trasladarlo:");
        System.out.println(poligono);
    }
}
