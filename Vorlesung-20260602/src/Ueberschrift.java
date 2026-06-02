import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

public final class Ueberschrift extends TextWidget {

    public Ueberschrift(String text) {
        super(text);
    }

    @Override
    public JComponent erzeugeKomponente() {
        JLabel label = new JLabel(this.text);
        label.setFont(new Font("SansSerif", Font.BOLD, 20));
        return label;
    }
}
