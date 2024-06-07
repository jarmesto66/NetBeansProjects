package programa1_B;

public class Main {
    
    public static void main(String[] args) {
        
        Maestro leon = new Jedi ("LEON", 20, 7);
        Maestro zack = new Sith ("Zack", 20, 8);
        System.out.println(leon);
        System.out.println(zack);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("### TURNO " + (i+1));
            leon.ataca(zack);
            zack.ataca(leon);
            System.out.println(leon);
            System.out.println(zack);
            
        }
    }
    
}
