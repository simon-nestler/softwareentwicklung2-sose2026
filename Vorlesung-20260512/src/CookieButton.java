import javax.swing.*;
import java.awt.*;

public class CookieButton extends JButton {
    private final boolean primary;

    CookieButton(String text, boolean primary) {
        super(text);
        this.primary = primary;
        setFont(THIWebsite.FONT_COOKIE_BTN);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setPreferredSize(new Dimension(155, 38));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (primary) {
            g.setColor(THIWebsite.DARK_BLUE);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(THIWebsite.WHITE);
        } else {
            g.setColor(THIWebsite.COOKIE_GRAY);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(new Color(0x222222));
        }

        g.setFont(getFont());
        FontMetrics fm = g.getFontMetrics();
        int tx = (getWidth() - fm.stringWidth(getText())) / 2;
        int ty = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
        g.drawString(getText(), tx, ty);
        g.dispose();
    }
}
