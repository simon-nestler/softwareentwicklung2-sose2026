import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeineErsteGUI {

    private JFrame frame;
    private JPanel panel;

    public MeineErsteGUI() {
        create();
    }

    public void create() {
        frame = new JFrame("Meine erste GUI");

        frame.setSize(600, 300);

        panel = new JPanel();
        panel.setBackground(new Color(30, 200, 30));
        frame.add(panel);

        // Wenn der Frame geschlossen wird, wird das Programm beendet
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
