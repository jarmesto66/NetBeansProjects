package programa2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AEMET {

    public static void main(String[] args) {
        String datos;
        Scanner scr = new Scanner (System.in);
        System.out.print("De qué año quieres los datos (2010 al 2019): ");
        datos = scr.nextLine();
        //scr.nextLine();
        String archivo = ("C:\\\\Users\\\\USER\\\\Documents\\\\NetBeansProjects\\\\ExamenTercera\\\\src\\\\programa2\\\\" + datos + ".txt"); // Nombre del archivo con las temperaturas
        double temperaturaMaxima = Double.MIN_VALUE;
        double temperaturaMinima = Double.MAX_VALUE;
        String diaMaxima = "";
        String diaMinima = "";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split("\\s+");
                String fecha = columnas[0];
                double temperaturaMax = Double.parseDouble(columnas[1]);
                double temperaturaMin = Double.parseDouble(columnas[2]);

                if (temperaturaMax > temperaturaMaxima) {
                    temperaturaMaxima = temperaturaMax;
                    diaMaxima = fecha;
                }

                if (temperaturaMin < temperaturaMinima) {
                    temperaturaMinima = temperaturaMin;
                    diaMinima = fecha;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Temperatura Máxima: " + temperaturaMaxima + " el día " + diaMaxima);
        System.out.println("Temperatura Mínima: " + temperaturaMinima + " el día " + diaMinima);
    }
}
