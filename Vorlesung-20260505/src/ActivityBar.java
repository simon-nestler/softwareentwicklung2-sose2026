import javax.swing.*;
import java.awt.*;

public class ActivityBar extends JPanel {

    public ActivityBar() {
        setPreferredSize(new Dimension(56, 0));
        setBackground(new Color(45, 45, 48));
        setLayout(new GridLayout(10, 1, 0, 8));

        addIcon("📄");
        addIcon("🔍");
        addIcon("⑂");
        addIcon("▶");
        addIcon("🧩");
        addIcon("⚠");
        add(new JLabel());
        add(new JLabel());
        addIcon("👤");
        addIcon("⚙");
    }

    private void addIcon(String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("SansSerif", Font.PLAIN, 24));
        add(label);
    }
}