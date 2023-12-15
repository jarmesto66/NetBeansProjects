import java.util.Scanner;
/**
 * @author JAVIER ARMESTO
 */
public class TareaEntregableUD2_Ej3 {
    public static void main(String[] args) {
        
        double pvp1 , pvp2, pvp3, pvp4, pvp5, suma, descuento, bruto, pvp ;
        Scanner lector = new Scanner (System.in) ;
        
        System.out.print("Dame el precio del artículo 1: ");
        pvp1 = lector.nextDouble();
        System.out.print("Dame el precio del artículo 2: ");
        pvp2 = lector.nextDouble();
        System.out.print("Dame el precio del artículo 3: ");
        pvp3 = lector.nextDouble();
        System.out.print("Dame el precio del artículo 4: ");
        pvp4 = lector.nextDouble();
        System.out.print("Dame el precio del artículo 5: ");
        pvp5 = lector.nextDouble();
        suma = pvp1+pvp2+pvp3+pvp4+pvp5 ;
        System.out.println("La suma total de los artículos es: " + suma);
        descuento = suma * 0.1;
        suma = suma - descuento ; /* Valor de los 5 artículos tras aplicar el descuento */
        bruto = suma * 0.21; /* 21% de IVA */
        System.out.println("El descuento a aplicar es de: " + descuento + " euros");
        System.out.println("La suma total tras el descuento es : " + suma);
        System.out.println("El IVA es : " + bruto);
        pvp = suma + bruto ; /* Precio final con IVA incluido */
        System.out.println("Precio IVA incluido : " + pvp);
    }
}
