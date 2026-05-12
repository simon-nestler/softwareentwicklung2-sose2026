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
        g.drawString("Hello, World!", 20, 30);
        g.drawString("Kurzer Test", 20, 50);
    }
}
