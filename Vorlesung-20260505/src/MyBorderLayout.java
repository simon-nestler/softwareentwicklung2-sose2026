import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBorderLayout extends JFrame {

    public MyBorderLayout() {
        invertedLayout();
    }

    public void invertedLayout() {
        setTitle("My BorderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);

        setLayout(new BorderLayout());

        JPanel innerPanel = new JPanel(new BorderLayout());
        innerPanel.add(new JButton("North"), BorderLayout.NORTH);
        innerPanel.add(new JButton("South"), BorderLayout.SOUTH);
        innerPanel.add(new JButton("Center"), BorderLayout.CENTER);

        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("East"), BorderLayout.EAST);
        add(innerPanel, BorderLayout.CENTER);

    }

    public void standardLayout() {
        setTitle("My BorderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);

        setLayout(new BorderLayout());

        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new MyBorderLayout().setVisible(true);
    }
}
