import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Listener implements ActionListener {

    private ExterneKlassen externeKlassen;

    public Button1Listener(ExterneKlassen externeKlassen) {
        this.externeKlassen = externeKlassen;
    }

    public void actionPerformed(ActionEvent e) {
        externeKlassen.setTextOnJLabel("Button1 wurde gedrückt");
    }
}
