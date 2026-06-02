import javax.swing.JComponent;
import javax.swing.JLabel;

public class TextWidget extends Widget {

    public TextWidget(String text) {
        super(text, 200, 25);
    }

    @Override
    public JComponent erzeugeKomponente() {
        JLabel label = new JLabel(this.text);
        return label;
    }
}
