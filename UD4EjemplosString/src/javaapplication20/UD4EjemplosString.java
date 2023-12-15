
package javaapplication20;

/**
 *
 * @author USER
 */
public class UD4EjemplosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Dos cadenas de texto s1 y s2 para realizar pruebas con String
        String s1 = "Hola Que tal";
        String s2 = "Hola amigo";
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 1) Mostrar s1 y s2 en mayúsculas y en minúsculas
        System.out.println("\n*** 1 *** ");
        System.out.println("s1 mayus: " + s1.toUpperCase());
        System.out.println("s2 mayus: " + s2.toUpperCase());
        System.out.println("s1 minus: " + s1.toLowerCase());
        System.out.println("s2 minus: " + s2.toLowerCase());

        // 2) Decir si s1 y s2 son iguales
        System.out.println("\n*** 2 *** ");
        if (s1.equals(s2)) {
            System.out.println("s1 y s2 SÍ son iguales");
        } else {
            System.out.println("s1 y s2 NO son iguales");
        }

        // 3) Decir si s1 y s2 en mayúsculas son iguales
        System.out.println("\n*** 3 *** ");
        String s1m = s1.toUpperCase();
        String s2m = s2.toUpperCase();
        if (s1m.equals(s2m)) {
            System.out.println("s1 y s2 en MAYUS SÍ son iguales");
        } else {
            System.out.println("s1 y s2 en MAYUS NO son iguales");
        }

        // 4) Lo mismo con menos código (sin guardar en variables)
        System.out.println("\n*** 4 *** ");
        if (s1.toUpperCase().equals(s2.toUpperCase())) {
            System.out.println("s1 y s2 en MAYUS SÍ son iguales");
        } else {
            System.out.println("s1 y s2 en MAYUS NO son iguales");
        }

        // 5) Decir cual va antes alfabeticamente
        System.out.println("\n*** 5 *** ");
        int comparacion = s1.toUpperCase().compareTo(s2.toUpperCase());
        System.out.println(comparacion);
        if (comparacion < 0) {
            System.out.println("s1 va antes alfabeticamente");
        } else if (comparacion > 0) {
            System.out.println("s2 va antes alfabeticamente");
        } else {
            System.out.println("s1 y s2 son iguales");
        }

        // 6) A partir de un String con nombre y dos apellidos, obtener el nombre de usuario GVA
        //    Por ejemplo, Pepito Perez Garcia => p.perezgarcia@alu.edu.gva.es
        System.out.println("\n*** 6 *** ");
        String nombrecompleto = "Javier Armesto Bartolome";

        // Pasamos el nombre completo a minuscula
        String nombreMinus = nombrecompleto.toLowerCase();

        // Obtenemos la primera letra
        char letra = nombreMinus.charAt(0);

        // Obtenemos la primera y segunda posicion donde hay espacio
        int posicionEspacio1 = nombreMinus.indexOf(" ");
        int posicionEspacio2 = nombreMinus.indexOf(" ", posicionEspacio1 + 1);

        // Obtenemos los apellidos por separado
        String apellido1 = nombreMinus.substring(posicionEspacio1 + 1, posicionEspacio2);
        String apellido2 = nombreMinus.substring(posicionEspacio2 + 1);

        // Creamos nombre de usuario (concatenando todo lo anterior)
        String usernameFinal = letra + "." + apellido1 + apellido2 + "@alu.edu.gva.es";

        // Mostramos la información
        System.out.println("Nombre completo : " + nombrecompleto);
        System.out.println("Nombre minúscula: " + nombreMinus);
        System.out.println("Letra           : " + letra);
        System.out.println("Espacio 1 en    : " + posicionEspacio1);
        System.out.println("Espacio 2 en    : " + posicionEspacio2);
        System.out.println("Apellido 1      : " + apellido1);
        System.out.println("Apellido 2      : " + apellido2);
        System.out.println("Username final  : " + usernameFinal);

        // 5) Recorrer String con for y contar cuantas veces aparece la letra 'a'
        System.out.println("\n*** 7 *** ");
        String s3 = "Anda mira";
        int contador_a = 0;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == 'a') {
                contador_a++;
            }
        }
        System.out.println(s3);
        System.out.println("Cuantas 'a': " + contador_a);

    }

    
}
