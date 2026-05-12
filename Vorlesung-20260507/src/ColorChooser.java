import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChooser extends JFrame {
    public ColorChooser() {
        setTitle("Color Chooser");
        setSize(400, 300);

        JPanel panel = new JPanel();
        JButton button = new JButton("Choose Color");
        panel.add(button);
        add(panel);

        button.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(this, "Choose a color", panel.getBackground());
            if (selectedColor != null) {
                panel.setBackground(selectedColor);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
