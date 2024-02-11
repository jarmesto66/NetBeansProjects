
package paquete1;

/**
 *
 * @author jarmesto
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Javier", 57);
        
        persona1.mostrarDatos();
        
        persona1.setEdad(58);
        
        System.out.println("");
        persona1.mostrarDatos();
    }
    
}
