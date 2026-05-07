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

    private class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jlabel.setText("Button1 wurde gedrückt");
        }
    }

    private class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jlabel.setText("Button2 wurde gedrückt");
        }
    }

    private class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jlabel.setText("Button3 wurde gedrückt");
        }
    }

    public InnereKlassen() {
        setTitle("Ereignisverarbeitung mit inneren Klassen");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("Button1");
        button1.addActionListener(new Button1Listener());

        button2 = new JButton("Button2");
        button2.addActionListener(new Button2Listener());

        button3 = new JButton("Button3");
        button3.addActionListener(new Button3Listener());

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
