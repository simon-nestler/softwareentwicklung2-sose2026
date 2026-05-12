import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Example extends JPanel {
    public Example() {
        setBackground(Color.GREEN);
    }

    protected void paintComponent(Graphics g) {
        // super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(getBackground());
        g.fillRect(10, 10, this.getWidth() - 20, this.getHeight() - 20);

        g.setColor(Color.BLACK);

        g.drawRect(20, 30, 200, 100);
        g.drawOval(20, 30, 200, 100);

        g.setColor(Color.BLUE);
        g.fillArc(20, 30, 200, 100, 0, 180);

        g.drawLine(20, 30, 220, 130);

        g.fillRect(250, 30, 50, 50);
        g.fillOval(320, 30, 50, 50);

        /*
         * int[] xPoints = { 400, 450, 500 };
         * int[] yPoints = { 30, 80, 30 };
         * g.fillPolygon(xPoints, yPoints, 3);
         * 
         * int[] xPoints2 = { 400, 450, 500, 600, 200, 150 };
         * int[] yPoints2 = { 150, 200, 150, 175, 175, 150 };
         * g.fillPolygon(xPoints2, yPoints2, 6);
         */
    }
}
