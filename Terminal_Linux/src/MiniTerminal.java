

import java.util.Scanner;


public class MiniTerminal {
   
    
    private static String generaPrompt(String directory) {
        return System.getProperty("user.name") + "@" + System.getProperty("hostname") + ":" + directory + "$ ";
    }

    public static void main(String[] args) {

        MiniFileManager fileManager = new MiniFileManager();
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Bienvenido al MiniTerminal. Escribe 'help' para obtener ayuda.");
        
        while (true) {
            String prompt = generaPrompt(fileManager.getPWD());
            System.out.print(prompt);
            
            String input = scr.nextLine().trim();
            
            if (input.equals("exit")) {
                System.out.println("Saliendo del MiniTerminal...");
                break;
            }
            
            try {
                String[] parts = input.split(" ");
                String command = parts[0];
                
                switch (command) {
                    case "pwd":
                        System.out.println(fileManager.getPWD());
                        break;
                    case "cd":
                        if (parts.length < 2) {
                            System.out.println("Falta el argumento para cd.");
                        } else {
                            if (!fileManager.changeDir(parts[1])) {
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
                        if (parts.length < 2) {
                            System.out.println("Falta el nombre del directorio.");
                        } else {
                            if (!fileManager.makeDir(parts[1])) {
                                System.out.println("No se pudo crear el directorio.");
                            }
                        }
                        break;
                    case "rm":
                        if (parts.length < 2) {
                            System.out.println("Falta el nombre del archivo/directorio a borrar.");
                        } else {
                            if (!fileManager.deleteFile(parts[1])) {
                                System.out.println("No se pudo borrar el archivo/directorio.");
                            }
                        }
                        break;
                    case "mv":
                        if (parts.length < 3) {
                            System.out.println("Faltan argumentos para mv.");
                        } else {
                            if (!fileManager.moveFile(parts[1], parts[2])) {
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
        
        scr.close();
    }
}
