//Miembros estáticos de una clase
package paquete1;

/**
 *
 * @author jarmesto
 */
public class Estatico {
    //Atributos
    //private String frase = "Primera frase";
    private static String frase = "Primera frase"; //Ahora pertenece a la clase y no al objeto
    
    public static int sumar(int n1,int n2){ //Pertenece a la clase
        int suma = n1+n2;
        return suma;
        
    }
    
    public static void main(String[] args) {
/*        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase = "Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);*/
        
        System.out.println(Estatico.frase);
        System.out.println("La suma es: "+Estatico.sumar(3, 4));
        
    }
    
}
