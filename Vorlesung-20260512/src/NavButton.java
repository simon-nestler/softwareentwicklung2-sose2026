import javax.swing.*;
import java.awt.*;

public class NavButton extends JButton {

    NavButton(String text) {
        super(text);
        setPreferredSize(new Dimension(200, 44));
        setFont(THIWebsite.FONT_NAV_BTN);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics g2 = g.create();

        g2.setColor(THIWebsite.DARK_BLUE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setColor(THIWebsite.WHITE);
        g2.setFont(getFont());
        FontMetrics fm = g2.getFontMetrics();
        int tx = (getWidth() - fm.stringWidth(getText())) / 2;
        int ty = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
        g2.drawString(getText(), tx, ty);
        g2.dispose();
    }
}
