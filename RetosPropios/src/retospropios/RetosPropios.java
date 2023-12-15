/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retospropios;

/**
 *
 * @author USER
 */
public class RetosPropios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroMes = 9;
        String estacion;
        estacion = "";
        String mes = "";

switch (numeroMes) {
  case 12:
    mes = "Diciembre";
    estacion = "Invierno";
  case 1 :
    mes = "Enero";
  case 2 :
    mes = "Febrero";
    estacion = "Invierno";
    break;
  case 3 :
    mes = "Marzo";
  case 4 :
    mes = "Abril";
  case 5 :
    mes = "Mayo";
    estacion = "Primavera";
    break;
  case 6 :
    mes = "Junio";
  case 7 :
    mes = "Julio";
  case 8 :
    mes = "Agosto";
    estacion = "Verano";
    break;
  case 9 :
    mes = "Septiembre";
  case 10 :
    mes = "Octubre";
  case 11 :
    mes = "Noviembre";
    estacion = "Otoño";
  break;
    }
    System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
}
}
