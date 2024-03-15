
package problema1;

/**
 *
 * @author jarmesto
 */
public class Main {
    
    public static void main(String[] args) {
        
        Tienda miTienda = new Tienda("Botica de Lionel");

        miTienda.añadir("Zapatillas Nike", 120.50, 10);
        
        miTienda.añadir("Zapatillas Bambas", 60.22, 10);
        miTienda.añadir("Mochila Decathlon", 30.33, 5);
        
        
        miTienda.toString();
        
        
        
        
    }
    
}
