
import java.io.File;

/*
Implementa un programa que haga lo siguiente:
● Cambiar el nombre de la carpeta ‘C:/Pruebas/Documentos’ a ‘C:/Pruebas/DOCS’,
el de la carpeta ‘C:/Pruebas/DOCS/Fotografias’ a ‘C:/Pruebas/DOCS/FOTOS’ y el de
la carpeta ‘C:/Pruebas/DOCS/Libros’ a ‘C:/Pruebas/DOCS/LECTURAS’
● Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS quitándole la
extensión. Por ejemplo, ‘astronauta.jpg’ pasará a llamarse ‘astronauta’.
 */

public class Ej_A_3 {
    
    public static void main(String[] args) {
        
        File dir = new File("C:/Pruebas");
        dir.mkdir();
        
        dir = new File("C:/Pruebas/Documentos");
        dir.mkdir();
        
        dir = new File("C:/Pruebas/Fotografias");
        dir.mkdir();
        
        dir = new File("C:/Pruebas/Libros");
        dir.mkdir();
        
        File origen = new File("C:/Pruebas/Documentos");
        File destino = new File("C:/Pruebas/DOCS");
        origen.renameTo(destino);
        
        origen = new File("C:/Pruebas/Fotografias");
        destino = new File("C:/Pruebas/FOTOS");
        origen.renameTo(destino);
        
        origen = new File("C:/Pruebas/Libros");
        destino = new File("C:/Pruebas/LECTURAS");
        origen.renameTo(destino);

        
    }
    
}
