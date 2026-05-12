import javax.swing.*;
import java.awt.*;

public class BewerbenButton extends JButton {

    BewerbenButton(String text) {
        super(text);
        setFont(new Font("SansSerif", Font.PLAIN, 13));
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(THIWebsite.BTN_BG);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(THIWebsite.DARK_BLUE);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

        g.setFont(getFont());
        FontMetrics fm = g.getFontMetrics();
        int tx = (getWidth() - fm.stringWidth(getText())) / 2;
        int ty = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
        g.drawString(getText(), tx, ty);
        g.dispose();
    }
}
