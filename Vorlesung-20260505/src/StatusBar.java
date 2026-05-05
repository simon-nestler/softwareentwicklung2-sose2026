import javax.swing.*;
import java.awt.*;

public class StatusBar extends JPanel {

    public StatusBar() {
        setPreferredSize(new Dimension(0, 28));
        setBackground(new Color(0, 122, 204));
        setLayout(new BorderLayout());

        JLabel left = new JLabel("  main   ⟳   ✕ 0   ⚠ 0   Java: Ready");
        JLabel right = new JLabel("Zeile 24, Spalte 11     Leerzeichen: 4     UTF-8     LF     Java   ");

        left.setForeground(Color.WHITE);
        right.setForeground(Color.WHITE);

        left.setFont(new Font("SansSerif", Font.PLAIN, 13));
        right.setFont(new Font("SansSerif", Font.PLAIN, 13));

        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
    }
}