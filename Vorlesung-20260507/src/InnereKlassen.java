import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnereKlassen extends JFrame {
    private JButton button1, button2, button3;
    private JLabel jlabel;
    private JPanel panel;

    public InnereKlassen() {
        setTitle("Zentralisierte Ereignisverarbeitung");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("Button1");

        button2 = new JButton("Button2");

        button3 = new JButton("Button3");

        jlabel = new JLabel("leer");

        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(jlabel);

        add(panel);
    }
}
