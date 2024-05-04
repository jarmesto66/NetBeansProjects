import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class MiniFileManager {
    
    private File dirTrabajo;
    private String nombreUsuario, nombreHost;

    public MiniFileManager(String dirInicial, String nombreUsuario, String nombreHost) {
        this.dirTrabajo = new File(dirInicial);
        this.nombreUsuario = nombreUsuario;
        this.nombreHost = nombreHost;
    }
    
    public String generaPrompt(){
        return nombreHost + "@" + nombreUsuario + ":" + dirTrabajo.getAbsolutePath() + "$ ";
    }

    public String getPWD() {
        //return dirTrabajo.getAbsolutePath(); <== No acababa de funcionar bien al hacer 'cd ..'
        return dirTrabajo.toPath().normalize().toAbsolutePath().toString(); //Buscada en Google
    }

    public boolean changeDir(String dir) {
        File nuevoDir = new File(dirTrabajo, dir);
        if (nuevoDir.isDirectory()) {
            dirTrabajo = nuevoDir;
            return true;
        } else if (dir.equals("..")) {
                    File padreDir = dirTrabajo.getParentFile(); //Obtenemos el padre
                    if (padreDir != null) { //Verifico que hay un padre
                        dirTrabajo = padreDir;
                        return true;
                    }
               }
        return false;
    }

    public void printList(boolean info) {
        File[] files = dirTrabajo.listFiles();
        if (files != null) {
            Arrays.sort(files, (a, b) -> {
                if (a.isDirectory() && !b.isDirectory()) {
                    return -1;
                } else if (!a.isDirectory() && b.isDirectory()) {
                    return 1;
                } else {
                    return a.getName().compareTo(b.getName());
                }
            });

            for (File file : files) {
                System.out.print(file.getName());
                if (info) {
                    System.out.print(" (" + file.length() + " bytes, " + new Date(file.lastModified()) + ")");
                }
                System.out.println();
            }
        }
    }

    public boolean makeDir(String dir) {
        File nuevoDir = new File(dirTrabajo, dir);
        return nuevoDir.mkdir();
    }

    public boolean deleteFile(String fileName) {
        File fileToDelete = new File(dirTrabajo, fileName);
        if (fileToDelete.exists()) {
            if (fileToDelete.isDirectory()) {
                File[] contents = fileToDelete.listFiles();
                if (contents != null) {
                    for (File f : contents) {
                        deleteFile(f.getName());
                    }
                }
            }
            return fileToDelete.delete();
        }
        return false;
    }

    public boolean moveFile(String srcFileName, String destFileName) {
        File srcFile = new File(dirTrabajo, srcFileName);
        File destFile = new File(dirTrabajo, destFileName);
        return srcFile.renameTo(destFile);
    }
}