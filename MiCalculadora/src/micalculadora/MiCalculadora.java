package micalculadora;

public class MiCalculadora {
    // Atributos de la clase
    private int numero1;
    private int numero2;
    private int numero3;
    
    // Constructor que recibe tres datos enteros
    public MiCalculadora(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }
    
    // Método cartesiano que devuelve el producto de los tres datos
    public int cartesiano() {
        return numero1 * numero2 * numero3;
    }
    
    // Método sumatriple que devuelve la suma de los tres datos
    public int sumatriple() {
        return numero1 + numero2 + numero3;
    }
    
    // Método media que devuelve la media de los tres
    public float media() {
        return (float)(numero1 + numero2 + numero3) / 3;
    }
    
    // Método mayordelostres que devuelve el mayor de los tres
    public int mayordelostres() {
        int mayor = numero1;
        
        if (numero2 > mayor) {
            mayor = numero2;
        }
        
        if (numero3 > mayor) {
            mayor = numero3;
        }
        
        return mayor;
    }
    
    // Método principal para probar la clase (opcional)
    public static void main(String[] args) {
        MiCalculadora calc = new MiCalculadora(5, 10, 15);
        
        System.out.println("Producto: " + calc.cartesiano());
        System.out.println("Suma: " + calc.sumatriple());
        System.out.println("Media: " + calc.media());
        System.out.println("Mayor: " + calc.mayordelostres());
    }
}
