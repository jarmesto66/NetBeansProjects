
import java.io.File;
import java.util.Arrays;
import java.util.Date;


public class MiniFileManager {
    
    private File dirTrabajo;

    public MiniFileManager() {
        dirTrabajo = new File(System.getProperty("user.dir"));
    }
    
    public String generaPrompt(){
        return System.getProperty("user.name") + "@" + System.getProperty("user.name") + ":" + dirTrabajo.getAbsolutePath() + "$ ";
    }

    public String getPWD() {
        return dirTrabajo.getAbsolutePath();
    }

    public boolean changeDir(String dir) {
        File newDir = new File(dirTrabajo, dir);
        if (newDir.isDirectory()) {
            dirTrabajo = newDir;
            return true;
        } else if (dir.equals("..")) {
            dirTrabajo = dirTrabajo.getParentFile();
            return true;
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
        File newDir = new File(dirTrabajo, dir);
        return newDir.mkdir();
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
