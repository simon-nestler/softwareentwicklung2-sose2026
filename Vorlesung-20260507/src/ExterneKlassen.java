import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ExterneKlassen extends JFrame {
    private JButton button1, button2, button3;
    private JLabel jlabel;
    private JPanel panel;

    public ExterneKlassen() {
        setTitle("Externe Ereignisverarbeitung");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("Button1");
        button1.addActionListener(new Button1Listener(this));

        button2 = new JButton("Button2");
        button2.addActionListener(new Button2Listener(this));

        button3 = new JButton("Button3");
        button3.addActionListener(new Button3Listener(this));

        jlabel = new JLabel("leer");

        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(jlabel);

        add(panel);
    }

    public void setTextOnJLabel(String text) {
        jlabel.setText(text);
    }
}
