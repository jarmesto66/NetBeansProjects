import java.util.Scanner;

public class MiniTerminal {
    
    private static String generaPrompt(String directory, String nombreUsuario, String nombreHost) {
        return nombreUsuario + "@" + nombreHost + ":" + directory + "$ ";
    }

    public static void main(String[] args) {

        String nombreUsuario = System.getProperty("user.name");
        String nombreHost = "localhost";
        

        String dirInicial = "C:\\Users\\armes\\Downloads"; // Aquí se proporciona el directorio de trabajo inicial para la simulación

        MiniFileManager fileManager = new MiniFileManager(dirInicial, nombreUsuario, nombreHost);
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Bienvenido al MiniTerminal. Escribe 'help' para obtener ayuda.");
        
        while (true) {
            String prompt = generaPrompt(fileManager.getPWD(), nombreUsuario, nombreHost);
            System.out.print(prompt);
            
            String comando = scr.nextLine().trim(); //Elimina espacios iniciales y finales del String leído
            
            if (comando.equals("exit")) {
                System.out.println("Saliendo del MiniTerminal...");
                break;
            }
            
            try {
                String[] argumentos = comando.split(" "); //Separa el String usando espacio como separador
                String command = argumentos[0]; //El comando será el primer String resultante (posición 0)
                
                switch (command) {
                    case "pwd":
                        System.out.println(fileManager.getPWD());
                        break;
                    case "cd":
                        if (argumentos.length < 2) {
                            System.out.println("Falta el argumento para cd.");
                        } else {
                            if (!fileManager.changeDir(argumentos[1])) {
                                System.out.println("No se pudo cambiar de directorio.");
                            }
                        }
                        break;
                    case "ls":
                        fileManager.printList(false);
                        break;
                    case "ll":
                        fileManager.printList(true);
                        break;
                    case "mkdir":
                        if (argumentos.length < 2) {
                            System.out.println("Falta el nombre del directorio.");
                        } else {
                            if (!fileManager.makeDir(argumentos[1])) {
                                System.out.println("No se pudo crear el directorio.");
                            }
                        }
                        break;
                    case "rm":
                        if (argumentos.length < 2) {
                            System.out.println("Falta el nombre del archivo/directorio a borrar.");
                        } else {
                            if (!fileManager.deleteFile(argumentos[1])) {
                                System.out.println("No se pudo borrar el archivo/directorio.");
                            }
                        }
                        break;
                    case "mv":
                        if (argumentos.length < 3) {
                            System.out.println("Faltan argumentos para mv.");
                        } else {
                            if (!fileManager.moveFile(argumentos[1], argumentos[2])) {
                                System.out.println("No se pudo mover/renombrar el archivo/directorio.");
                            }
                        }
                        break;
                    case "help":
                        System.out.println("Comandos disponibles:\n" +
                                           "pwd\n" +
                                           "cd <DIR>\n" +
                                           "ls\n" +
                                           "ll\n" +
                                           "mkdir <DIR>\n" +
                                           "rm <FILE>\n" +
                                           "mv <FILE1> <FILE2>\n" +
                                           "help\n" +
                                           "exit");
                        break;
                    default:
                        System.out.println("Comando no reconocido. Escribe 'help' para obtener ayuda.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
        
        scr.close(); //Limpiamos el scanner para la nueva iteración
    }
}