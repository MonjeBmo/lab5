import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Programa Suma");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setVisible(true);

        do {
            String no1_str = JOptionPane.showInputDialog(window, "Ingrese el primer número: ", "No.1", JOptionPane.PLAIN_MESSAGE);
            String no2_str = JOptionPane.showInputDialog(window, "Ingrese el segundo número: ", "No.2", JOptionPane.PLAIN_MESSAGE);

            double n1 = 0, n2 = 0;

            try {
                n1 = Double.parseDouble(no1_str);
                n2 = Double.parseDouble(no2_str);
                JOptionPane.showMessageDialog(window, "La suma es de: " + (n1 + n2), "Total", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(window, "Error al parsear números", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(window, "¿Desea hacer otra suma?", "Pregunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

        window.dispose();
    }
}
