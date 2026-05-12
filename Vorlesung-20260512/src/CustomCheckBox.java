import javax.swing.*;
import java.awt.*;

public class CustomCheckBox extends JPanel {
    private boolean checked;
    private final String label;

    CustomCheckBox(String label, boolean checked) {
        this.label = label;
        this.checked = checked;
        setOpaque(false);
        setPreferredSize(new Dimension(110, 22));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int boxSize = 14;
        int bx = 0, by = (getHeight() - boxSize) / 2;

        g.setColor(THIWebsite.WHITE);
        g.fillRect(bx, by, boxSize, boxSize);

        g.setColor(new Color(0x666666));
        g.drawRect(bx, by, boxSize, boxSize);

        if (checked) {
            g.setColor(THIWebsite.DARK_BLUE);
            g.drawLine(bx + 3, by + 7, bx + 6, by + 11);
            g.drawLine(bx + 6, by + 11, bx + 12, by + 4);
        }

        g.setColor(Color.DARK_GRAY);
        g.setFont(THIWebsite.FONT_BODY);
        FontMetrics fm = g.getFontMetrics();
        g.drawString(label, bx + boxSize + 5, by + fm.getAscent());
        g.dispose();
    }
}
