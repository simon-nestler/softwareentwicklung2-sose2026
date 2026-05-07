import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button3Listener implements ActionListener {

    private ExterneKlassen externeKlassen;

    public Button3Listener(ExterneKlassen externeKlassen) {
        this.externeKlassen = externeKlassen;
    }

    public void actionPerformed(ActionEvent e) {
        externeKlassen.setTextOnJLabel("Button3 wurde gedrückt");
    }
}