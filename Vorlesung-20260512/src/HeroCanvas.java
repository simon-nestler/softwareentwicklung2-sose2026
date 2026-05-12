import javax.swing.*;
import java.awt.*;

public class HeroCanvas extends JPanel {
    HeroCanvas() {
        setOpaque(true);
        setBackground(new Color(0xDDE0E8));
        setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = getWidth(), h = getHeight();

        paintBackground(g, w, h);
        paintGeometry(g, w, h);
        paintPersons(g, w, h);
    }

    private void paintBackground(Graphics g2, int w, int h) {
        g2.setColor(THIWebsite.DARK_BLUE);
        g2.fillRect(0, 0, w / 2, h);
        g2.setColor(new Color(0xE4E8EE));
        g2.fillRect(w / 2, 0, w / 2, h);
    }

    private void paintGeometry(Graphics g2, int w, int h) {
        int cx = (int) (w * 0.48);
        int cy = h / 2;
        int rw = 230;
        int rh = h / 2 + 30;

        Polygon r1 = new Polygon(
                new int[] { cx, cx + rw, cx, cx - rw },
                new int[] { cy - rh, cy, cy + rh, cy },
                4);
        g2.setColor(new Color(THIWebsite.MID_BLUE.getRed(), THIWebsite.MID_BLUE.getGreen(),
                THIWebsite.MID_BLUE.getBlue(), 215));
        g2.fillPolygon(r1);

        int cx2 = cx - 170;
        Polygon r2 = new Polygon(
                new int[] { cx2, cx2 + rw - 40, cx2, cx2 - rw + 40 },
                new int[] { cy - rh, cy, cy + rh, cy },
                4);
        g2.setColor(new Color(THIWebsite.LIGHT_BLUE.getRed(), THIWebsite.LIGHT_BLUE.getGreen(),
                THIWebsite.LIGHT_BLUE.getBlue(), 175));
        g2.fillPolygon(r2);

        Polygon tri = new Polygon(
                new int[] { 0, 100, 0 },
                new int[] { 0, 0, h },
                3);
        g2.setColor(new Color(15, 25, 55, 190));
        g2.fillPolygon(tri);
    }

    private void paintPersons(Graphics g2, int w, int h) {
        paintSilhouette(g2, w * 63 / 100, h / 2 + 20, 44, 125, new Color(0xA5AEBB));
        paintSilhouette(g2, w * 74 / 100, h / 2 - 15, 50, 145, new Color(0x888EA0));
        paintSilhouette(g2, w * 84 / 100, h / 2 + 5, 46, 135, new Color(0x9AA0B0));
    }

    private void paintSilhouette(Graphics g2, int cx, int by, int r, int bodyH, Color c) {
        g2.setColor(c);
        g2.fillOval(cx - r / 2, by - bodyH - r, r, r);
        g2.fillRoundRect(cx - (int) (r * 0.55), by - bodyH, (int) (r * 1.1), bodyH, 10, 10);
    }
}
