package tareaentregableud3;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
En el centro de salud de tu pueblo necesitan un programa informático de
diagnóstico de riesgo cardiovascular de los pacientes. El riesgo
cardiovascular se representa con un valor numérico y se calcula de la
siguiente manera:
1. Se evalúa qué factores de riesgo tiene o no tiene el paciente.
2. Por estadística todos los pacientes parten de un 5 de riesgo inicial.
3. Cada factor presente aumenta el riesgo inicial en una cantidad fija según
de qué factor se trate.
4. El número de factores presentes tiene un efecto multiplicador sobre el
riesgo inicial. El resultado de la multiplicación es el riesgo final.
Los factores de riesgo y su efecto son:
• Presión arterial alta: +15
• Colesterol elevado: +15
• Diabetes: +10
• Obesidad: +10
• Tabaquismo: +10
• Inactividad física: +10
• Sexo masculino: +5
• Familiares con enfermedades del corazón: +5
• Edad superior a 55 años: +5
El efecto multiplicador según el número de factores de riesgo:
• 2 factores: x1.25
• 3-4 factores: x1.5
• 5-6 factores: x1.75
• 7-8 factores: x2
• 9 factores: x2.5
Crea un programa que pida por teclado los datos necesarios
(supondremos que el usuario es ‘listo’ e introduce valores válidos) y
muestre por pantalla el riesgo inicial, el efecto multiplicador y el
riesgo final.
 *
 * @author JAVIER ARMESTO BARTOLOMÉ
 */

public class TareaEntregableUD3Ej02 {
    
    public static void main(String[] args) throws IOException {
        
        // Declaración de variables. El riesgo inicial es siempre igual a 5 mínimo
        
        int riesgo=5, factores=0;
        char respuesta;
        double multiplicador=1;
        
        // Declaramos Scanner
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("El riesgo inicial del  paciente es "+riesgo);
        System.out.print("¿El paciente tiene presión arterial alta? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+15;
            factores++;
        }
        //  Tenemos que leer el retorno de carro después de S/N
        respuesta=(char) System.in.read();
        
        System.out.print("¿El paciente tiene Colesterol elevado? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+15;
            factores++;
        }
        respuesta=(char) System.in.read();
        System.out.print("¿El paciente tiene Diabetes? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+10;
            factores++;
        }
        respuesta=(char) System.in.read();
        System.out.print("¿El paciente tiene Obesidad? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+10;
            factores++;
        }
        respuesta=(char) System.in.read();
        System.out.print("¿El paciente tiene Tabaquismo? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+10;
            factores++;
        }
        respuesta=(char) System.in.read();
        System.out.print("¿El paciente tiene inactividad física? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+10;
            factores++;
        }
        respuesta=(char) System.in.read();
        System.out.print("¿El paciente es hombre? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+5;
            factores++;
        }
        respuesta=(char) System.in.read();
        System.out.print("¿El paciente tiene antecedentes familiares de enfermedades del corazón? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+5;
            factores++;
        }
        respuesta=(char) System.in.read();
        System.out.print("¿El paciente es mayor de 55 años? (S/N) ");
        respuesta=(char) System.in.read();
        if (respuesta=='S') {
            riesgo=riesgo+5;
            factores++;
        }
        respuesta=(char) System.in.read();
        switch (factores) {
            case 2:
                multiplicador=1.25;
            case 3:
            case 4:
                multiplicador=1.5;
            case 5:
            case 6:
                multiplicador=1.75;
            case 7:
            case 8:
                multiplicador=2.0;
            case 9:
                multiplicador=2.5;
            break;
        }
    System.out.println("El efecto multiplicador es de "+multiplicador);
    System.out.println("El riesgo final es "+(riesgo*multiplicador));
    }    
    
}