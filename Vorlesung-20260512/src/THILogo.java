import javax.swing.*;
import java.awt.*;

public class THILogo extends JPanel {
    THILogo() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(THIWebsite.DARK_BLUE);
        g.drawLine(13, 6, 6, 42);
        g.drawLine(-3, 24, 21, 24);
        g.drawLine(23, 24, 20, 42);
        g.fillOval(22, 3, 6, 6);
        g.setFont(new Font("SansSerif", Font.BOLD, 12));
        g.drawString("Technische Hochschule", 36, 22);
        g.drawString("Ingolstadt", 36, 38);
    }
}