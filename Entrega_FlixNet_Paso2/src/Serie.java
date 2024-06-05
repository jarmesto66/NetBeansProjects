
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

    
class Serie extends Contenido {
        
        protected int nTemporadas;

    public Serie(int nTemporadas, boolean visto, String titulo, String productora, int anio) {
        super(titulo, productora, anio, visto);
        this.nTemporadas = nTemporadas;
    }
    
    

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public static Serie crearSerieDesdeFormulario(JFrame parent) {
        JTextField tituloField = new JTextField();
        JTextField productoraField = new JTextField();
        JTextField annoField = new JTextField();
        JTextField temporadasField = new JTextField();
        JCheckBox vistoBox = new JCheckBox("Visto");
        
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Título:"));
        panel.add(tituloField);
        panel.add(new JLabel("Productora:"));
        panel.add(productoraField);
        panel.add(new JLabel("Año:"));
        panel.add(annoField);
        panel.add(new JLabel("Número de Temporadas:"));
        panel.add(temporadasField);
        panel.add(vistoBox);
        
        int result = JOptionPane.showConfirmDialog(parent, panel, "Agregar Serie",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                String titulo = tituloField.getText();
                String productora = productoraField.getText();
                int annio = Integer.parseInt(annoField.getText());
                int temporadas = Integer.parseInt(temporadasField.getText());
                boolean visto = vistoBox.isSelected();


                if (titulo.isEmpty() || productora.isEmpty()) {
                    JOptionPane.showMessageDialog(parent, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return null;
                }

                // Crear y retornar la Serie
                return new Serie(temporadas, false, titulo, productora, annio);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(parent, "Error: Año y Número de Temporadas deben ser números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } else {
            return null; // Si se cancela, retorna null
        }
    }
}