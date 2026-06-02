import javax.swing.JButton;
import javax.swing.JComponent;

public class Button extends Widget implements Anklickbar {

    public Button(String text) {
        super(text, 120, 30);
    }

    @Override
    public JComponent erzeugeKomponente() {
        JButton button = new JButton(this.text);
        button.addActionListener(e -> beiKlick());
        return button;
    }

    @Override
    public void beiKlick() {
        System.out.println("Button '" + this.text + "' wurde geklickt.");
    }
}
