
package ClasesYObjetosII;

/**
 *
 * @author jarmesto
 */
public class Operacion {
    //Atributos
    int numero1, numero2, suma, resta,multiplicacion, division;
    
    
    
    
    //Métodos
    

    //Método para pedir dos números
/*    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Teclee un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Teclee un número: "));
    }*/
    
    //Método para sumar ambos números
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
        
    }
    
    
    //Método para restar ambos números
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
        
    }
    
    //Mëtodo para multiplicar ambos números
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
        
    }
    
    //Método para dividir ambos números
    public void dividir(int numero1, int numero2){
        division = numero1 / numero2;
        
    }
    
    public void mostrarResultados (){
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
        
    }
    
}
