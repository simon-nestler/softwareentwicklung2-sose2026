import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeineErsteGUI {

    private JFrame frame;
    private JPanel panel;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public MeineErsteGUI() {
        create();
    }

    public void create() {
        frame = new JFrame("Meine erste GUI");

        frame.setSize(600, 300);

        panel = new JPanel();
        panel.setBackground(new Color(30, 200, 30));
        frame.add(panel);

        button1 = new JButton("Button 1");
        button1.setLocation(200, 200);
        button1.setSize(200, 200);

        button2 = new JButton("Button 2");
        button2.setLocation(300, 200);
        button2.setSize(200, 200);

        button3 = new JButton("Button 3");
        button3.setLocation(400, 200);
        button3.setSize(200, 200);

        button4 = new JButton("Button 4");
        button4.setLocation(500, 200);
        button4.setSize(200, 200);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // Wenn der Frame geschlossen wird, wird das Programm beendet
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
