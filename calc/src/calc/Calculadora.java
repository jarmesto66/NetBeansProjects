package calc;
public class Calculadora {
        private int num1;
        private int num2;
        
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int suma() {
        int result = num1 + num2;
        return result;
    }
    public int resta () {
        int result = num1 - num2;
        return result;
    }
    public int multiplica () {
        int result = num1 * num2;
        return result;
    }
    public int divide () {
        int result = num1 / num2;
        return result;
    }
    
    public static void main(String[] args) {
        int uno = 10;
        int dos = 10;
        
        Calculadora instance = new Calculadora (uno, dos);
        System.out.println(instance.suma());
        System.out.println(instance.resta());
    }
}