
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


class Pelicula extends Contenido {

public static Pelicula crearPeliculaDesdeFormulario(JFrame frame) {
    JTextField tituloField = new JTextField();
    JTextField productoraField = new JTextField();
    JTextField añoField = new JTextField();
    JTextField nominacionesField = new JTextField();
    JTextField oscarsField = new JTextField();

    JPanel panel = new JPanel(new GridLayout(5, 2));
    panel.add(new JLabel("Título:"));
    panel.add(tituloField);
    panel.add(new JLabel("Productora:"));
    panel.add(productoraField);
    panel.add(new JLabel("Año:"));
    panel.add(añoField);
    panel.add(new JLabel("Nominaciones:"));
    panel.add(nominacionesField);
    panel.add(new JLabel("Oscars:"));
    panel.add(oscarsField);

    int result = JOptionPane.showConfirmDialog(frame, panel, "Crear Película",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        try {
            String titulo = tituloField.getText();
            String productora = productoraField.getText();
            int año = Integer.parseInt(añoField.getText());
            int nominaciones = Integer.parseInt(nominacionesField.getText());
            int oscars = Integer.parseInt(oscarsField.getText());

            return new Pelicula(nominaciones, oscars, titulo, productora, año);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    return null;
}

    
    int numNominaciones, numOscars;

    public Pelicula(int numNominaciones, int numOscars, String titulo, String productora, int año) {
        super(titulo, productora, año);
        this.numNominaciones = numNominaciones;
        this.numOscars = numOscars;
    }
        
    public int getNumNominaciones() {
        return numNominaciones;
    }

    public int getNumOscars() {
        return numOscars;
    }

    public void setNumNominaciones(int numNominaciones) {
        this.numNominaciones = numNominaciones;
    }

    public void setNumOscars(int numOscars) {
        this.numOscars = numOscars;
    }
    
    static Pelicula crearPelicula(){
        
        Scanner scanner = new Scanner(System.in);
        String titulo1, productora1;
        Calendar cal = Calendar.getInstance();
        int numNominaciones1, numOscars1, año1;
        
        // Solicitar información de la película al usuario
        System.out.print("Ingrese el título de la película: ");
        titulo1 = scanner.nextLine();
        System.out.print("Ingrese la productora: ");
        productora1 = scanner.nextLine();

        do {
        
            try{
                System.out.print("Ingrese el año: "); //Entre 1895 (invención del cine) y el actual
                año1 = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
            }
            catch (InputMismatchException eIMEaño){ //Por si leemos algo distinto de Integer
                scanner.nextLine();
                System.out.print("Revise el año introducido");
                año1 = 0;
                System.out.println("");
            }
            
        } while (!(1894 < año1 && año1 <= cal.get(Calendar.YEAR)));
        
        do {
            System.out.println("");
            System.out.println("¡Recuerde que una película debe tener más o las mismas nominaciones que Oscars obtuvo!");
            System.out.println("");
            try{
                System.out.print("Ingrese el número de nominaciones: ");
                numNominaciones1 = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                System.out.print("Ingrese el número de Oscars: ");
                numOscars1 = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
            }
            catch (InputMismatchException eIMEnom){ //Por si leemos algo distinto de Integer
                scanner.nextLine();
                System.out.println("Revise los Oscars y nominaciones introducidos");
                numNominaciones1 = 0;
                numOscars1 = 1;
                System.out.println("");
            }
        }
        while (!(numNominaciones1 >= numOscars1));
        
        // Crear un nuevo objeto pelicula con la información proporcionada
        Pelicula pel = new Pelicula(numNominaciones1, numOscars1, titulo1, productora1, año1);
        
        System.out.println("**********************************************************");
        System.out.println("La película se ha registrado correctamente en el catálogo.");
        System.out.println("**********************************************************");
        return pel;

    }

}