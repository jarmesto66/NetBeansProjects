
package ud6_estdinamicas;

/**
 *
 * @author javarmbar
 */
public class foreach {
    
    public static void main(String[] args) {
        
        for (String palabra : alExamen) {
            System.out.println(palabra);
        }
        
        for (int i = 0; i < alExamen.size; i++) {
            String palabra = alExamen.get(i);
            System.out.println(palabra);
            
            
        }
        
    }
    
}
