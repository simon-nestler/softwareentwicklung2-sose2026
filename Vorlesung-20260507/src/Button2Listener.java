import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2Listener implements ActionListener {

    private ExterneKlassen externeKlassen;

    public Button2Listener(ExterneKlassen externeKlassen) {
        this.externeKlassen = externeKlassen;
    }

    public void actionPerformed(ActionEvent e) {
        externeKlassen.setTextOnJLabel("Button2 wurde gedrückt");
    }
}