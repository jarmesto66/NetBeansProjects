/*
Ejercicio 2. Clase Coche
Escribe una clase que represente a un coche:
• Atributos private: modelo, color, si la pintura es metalizada o no, matrícula, el tipo de
coche (puede ser MINI, UTILITARIO, FAMILIAR o DEPORTIVO), año de fabricación,
modalidad del seguro (puede ser a TERCEROS o a TODO_RIESGO).
• Para el tipo de coche y la modalidad del seguro crea tipos de datos enum.
• Constructor al que se le pasen todos los valores iniciales.
• Métodos getters y setters para todos los atirbutos de la clase.
• Crea un método que imprima por pantalla la información del objeto.
Escribe otra clase con método main para hacer pruebas: instancia tres objetos de tipo
coche y luego imprime su información por pantalla.
 */



package Coche;

/**
 *
 * @author USER
 */
public class Programa {
    
    public static void main(String[] args) {
        
        
        //public Coche(String modelo, String color, boolean metalizada, String matricula, int año, tipoCoche tipo, modalidadSeguro seguro)
        // Instanciando tres objetos de tipo Coche
        Coche coche1 = new Coche("Toyota Corolla", "Rojo", false, "1234 ABC", 2022, Coche.TipoCoche.FAMILIAR, Coche.ModalidadSeguro.TODO_RIESGO);
        Coche coche2 = new Coche("Ford Fiesta", "Azul", true, "5678 XYZ", 2020, Coche.TipoCoche.UTILITARIO, Coche.ModalidadSeguro.TERCEROS);
        Coche coche3 = new Coche("BMW M3", "Negro", true, "9876 DEF", 2023, Coche.TipoCoche.MINI, Coche.ModalidadSeguro.TODO_RIESGO);
    
        System.out.println("Información del coche 1:");
        coche1.imprime();
        System.out.println("Información del coche 2:");
        coche2.imprime();
        System.out.println("Información del coche 3:");
        coche3.imprime();
        
        
    }
            
    
}
