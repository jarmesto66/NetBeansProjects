/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5_funciones;

import java.util.Scanner;

/**
 *
 * @author JAVIER ARMESTO
 */
public class Retrobank_Javier_Armesto {
    
    //VARIABLES GLOBALES
    
    public static int maxC = 100; // Máximo nº de cuentas
    public static int numC = 0;   // Nº de cuentas registradas
    
// FUNCIONES IMPLEMENTADAS
//  validarNombre Comprueba y valida que el nombre de una cuenta que se pasa como String no esté repetido, devuelve true si cumple condición.
//  int pedirIntEnRango(int min, int max) Lee un entero, que devuelve, entre un rango mínimo y máximo.
//  String pedirString() Lee un String, que devuelve, por entrada de teclado.
//  printCuentasTodas(String[] vc, String[] vn, String[] vs) Imprime todas las cuentas en el formato solicitado.
//  printCuentasVector(String[] vc, String[] vn, String[] vs, int i) Imprime la cuenta en el formato solicitado de la posición pos que se pasa como argumento.
//  printCuentaPos (String[] vc, String[] vn, String[] vs, int pos) Hace lo mismo que la anterior pero añade tabuladores en la presentación.
//  agregarCuenta(String[] vc, String[] vn, String[] vs, String c, String n, String s) Añade una cuenta nueva comprobando que no se exceda el número máximo de cuentas.
//  agregarSaldo(String[] vc, String[] vn, String[] vs, String ingreso, int IDCuenta) Añade saldo a una cuenta.
//  retirarSaldo(String[] vc, String[] vn, String[] vs, String retirada, int IDCuenta) Retira saldo de una cuenta.
//  eliminarCuenta(String[] vc, String[] vn, String[] vs, int pos) Elimina la cuenta de una posición determinada.
//  eliminarPosDeVector(String[] vector, int pos) Mueve todos los elementos a la derecha de una posición determinada, desplazándolos una posición a la izquierda.
//  buscarCuenta(String[] vc, String[] vn, String[] vs, String buscar) Pide un texto que busca en los nombres de cuentas y si existen las imprime.
//  boolean validarNombre(String[] vc, String[] vn, String[] vs,String nombre) Nos devuelve un valor booleano si el nombre no está repetido en otra cuenta.
    
    
    //PRINCIPAL
    
    public static void main(String[] args) {
        
        // Vectores con la información de las cuentas
        String[] vc = new String[maxC]; // vector de cuentas
        String[] vn = new String[maxC]; // vector de nombres de clientes
        String[] vs = new String[maxC]; // vector de saldos
        
        // Variables auxiliares
        int opcion;     // opcion del menú
        String c, n, s; // cuenta, nombre y saldo
        String buscar;  // término a buscar
        int pos;        // posicion
//        int[] vpos;     // vector de posiciones
        String ingreso; //cantidad a ingresar o retirar
        
        // Bucle principal
        do {
            opcion = menu();

            switch (opcion) {

                case 1:
                    // Ver cuentas numeradas con ID
                    if (numC==0) System.out.println("No hay cuentas");
                    else printCuentasTodas(vc, vn, vs);
                    break;

                case 2:
                    // Ingresar dinero y actualizar saldo de la cuenta
                    printCuentasTodas(vc, vn, vs);
                    System.out.print("¿En qué cuenta? ");
                    int IDC = pedirIntEnRango(0, numC);
                    System.out.print("¿Cuanto dinero ingresas? ");
                    boolean cierto = true;
                    
                    do {
                    ingreso = pedirString();
                    int cant = Integer.parseInt(ingreso);
                    if (cant>0) { cierto = false;}
                    }
                    while (cierto);
                    agregarSaldo(vc, vn, vs, ingreso, IDC);
                    break;

                case 3:
                    // Retirar dinero y actualizar saldo de la cuenta
                    printCuentasTodas(vc, vn, vs);
                    System.out.print("¿En qué cuenta? ");
                    IDC = pedirIntEnRango(0, numC);
                    System.out.print("¿Cuanto dinero retiras? ");
                    cierto = true;
                    do {
                    ingreso = pedirString();
                    int cant = Integer.parseInt(ingreso);
                    if (cant<0) { cierto = false;}
                    }
                    while (cierto);
                    retirarSaldo(vc, vn, vs, ingreso, IDC);
                    break;

                case 4:
                    // Añadir cuenta
                    System.out.print("¿Número de cuenta? ");
                    c = pedirString();
                    boolean noOkNombre;
                    do {
                    System.out.print("¿Nombre del cliente? ");
                    n = pedirString();
                    noOkNombre = validarNombre(vc, vn, vs, n);
                    }
                    while (!noOkNombre);
                    System.out.print("¿Saldo inicial? ");
                    s = pedirString();
                    agregarCuenta(vc, vn, vs, c, n, s);
                    break;

                case 5:
                    // Eliminar cuenta
                    System.out.print("¿ID de cuenta a eliminar? ");
                    pos = pedirIntEnRango(0, numC - 1);
                    eliminarCuenta(vc, vn, vs, pos);
                    break;

                case 6:
                    // Buscar cuentas por cadenas nombre
                    System.out.print("¿Cadena a buscar en el nombre? ");
                    buscar = pedirString();
                    buscarCuenta(vc, vn, vs, buscar);
                    break;

                case 7:
                    // Mostrar morosos
                    System.out.println("Listado de morosos ");
                    for (int i = 0; i < numC; i++) {
                        if (Integer.parseInt(vs[i])<0) {
                          printCuentaPos(vc, vn, vs, i);  
                        }
                    }
                    break;

                case 8:
                    // Salir
                    System.out.println("¡Gracias! ¡Hasta la próxima!");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }

            System.out.println("");
        } while (opcion != 8);
    }

    // Muestra el menú y devuelve la opción elegida por el usuario
    public static int menu() {

        System.out.println("1. Ver cuentas.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero.");
        System.out.println("4. Agregar cuenta.");
        System.out.println("5. Eliminar cuenta.");
        System.out.println("6. Buscar cuenta.");
        System.out.println("7. Mostrar morosos.");
        System.out.println("8. Salir.");
        System.out.println("--------------------------");
        System.out.print("¿Opción? ");

        int opcion = pedirIntEnRango(1, 8);
        
        return opcion;
    }
    
    // Pide al usuario un valor int, una y otra vez hasta que responde con valor en rango
    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("AVISO: No válido. Debe ser entre " + min + " y " + max);
                System.out.print("Vuelve a intentarlo: ");
            }
        } while (valor < min || valor > max);

        return valor;
    }
    
    // Pide al usuario un texto y lo devuelve
    public static String pedirString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    
    // Imprime la información de todas las cuentas printCuentasTodas(vc, vn, vs);
    public static void printCuentasTodas(String[] vc, String[] vn, String[] vs) {
        //System.out.println("Orden\tNúm. Cuenta\tNombre\tSaldo");
        for (int i = 0; i < numC; i++) {
            printCuentaPos(vc, vn, vs, i);
        }
    }
    
    public static void printCuentasVector(String[] vc, String[] vn, String[] vs, int i) {
        for (int j = 0; j < numC; j++) {
            printCuentaPos(vc, vn, vs, j);
        }
    }
    
    public static void printCuentaPos (String[] vc, String[] vn, String[] vs, int pos) {
        
        System.out.println(pos + ". \t" + vc[pos] + " - \t" + vn[pos] + " - \t" + "Saldo: "+ vs[pos]);
    }
    
    public static void agregarCuenta(String[] vc, String[] vn, String[] vs, String c, String n, String s) {
        
        if (numC < maxC) {
            vc[numC] = c;
            vn[numC] = n;
            vs[numC] = s;
            numC++;
        } else {
            System.out.println("ERROR: No se puede agregar más cuentas. Lista llena.");
        }
    }
    
    public static void agregarSaldo(String[] vc, String[] vn, String[] vs, String ingreso, int IDCuenta) {
        
        int saldoAnterior, saldoNuevo, cantIngresar;
        cantIngresar = Integer.parseInt(ingreso);
        saldoAnterior = Integer.parseInt(vs[IDCuenta]);
        saldoNuevo = saldoAnterior + cantIngresar;
        vs[IDCuenta] = String.valueOf(saldoNuevo);
    }
    
    public static void retirarSaldo(String[] vc, String[] vn, String[] vs, String retirada, int IDCuenta) {
        
        int saldoAnterior, saldoNuevo, cantretirar;
        cantretirar = Integer.parseInt(retirada);
        saldoAnterior = Integer.parseInt(vs[IDCuenta]);
        saldoNuevo = saldoAnterior - cantretirar;
        vs[IDCuenta] = String.valueOf(saldoNuevo);
    }
    
    // Elimina de los vectores la cuenta en la posición 'pos'
    public static void eliminarCuenta(String[] vc, String[] vn, String[] vs, int pos) {
        if (pos >= 0 && pos < numC) {
            eliminarPosDeVector(vc, pos);
            eliminarPosDeVector(vn, pos);
            eliminarPosDeVector(vs, pos);
            numC--;
        } else {
            System.out.println("ERROR: No se puede eliminar cuenta. Posición fuera de rango.");
        }
    }
    
    // Elimina la posición 'pos' de 'vector' (mueve todos los elementos a la derecha una posición a la izquierda)
    public static void eliminarPosDeVector(String[] vector, int pos) {
        for (int i = pos; i < (numC - 1); i++) {
            vector[i] = vector[i + 1];
        }
    }
    
    public static void buscarCuenta(String[] vc, String[] vn, String[] vs, String buscar) {
//        int[] vpos = new int[maxC];
//        int npos = 0;
        for (int i = 0; i < numC; i++) {
            if (vn[i].toUpperCase().contains(buscar.toUpperCase())) {
                //imprimir cuenta
                printCuentaPos (vc, vn, vs, i);
//                npos++;
            }
            
        }
    }
    
    public static boolean validarNombre(String[] vc, String[] vn, String[] vs,String nombre){
        boolean nombreBueno;
        nombreBueno = true;
        for (int i = 0; i < numC; i++) {
            if (vn[i].contains(nombre)) {
                nombreBueno = false;
            }
        }
        return nombreBueno;
    }
}
