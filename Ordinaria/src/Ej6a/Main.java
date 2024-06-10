package Ej6a;

public class Main {
    
    public static void main(String[] args) {
        // Crear coches y camiones
        Coche coche = new Coche("1234ABC", 4);
        Camion camion = new Camion("5678DEF");
        Remolque remolque = new Remolque(500);

        // Mostrar la información inicial
        System.out.println(coche);
        System.out.println(camion);

        // Acelerar los vehículos
        coche.acelerar(60);
        camion.acelerar(50);

        // Mostrar la información después de acelerar
        System.out.println("\nDespués de acelerar:");
        System.out.println(coche);
        System.out.println(camion);

        // Añadir el remolque al camión y acelerar nuevamente
        camion.ponRemolque(remolque);
        System.out.println("\nCamión con remolque:");
        System.out.println(camion);

        try {
            camion.acelerar(100); // Esto lanzará una excepción
        } catch (DemasiadoRapidoException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

        // Mostrar la información final
        System.out.println("\nInformación final:");
        System.out.println(coche);
        System.out.println(camion);
    }
}
