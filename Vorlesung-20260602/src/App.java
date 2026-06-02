import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Widget> oberflaeche = new ArrayList<>();
        oberflaeche.add(new Ueberschrift("Anmeldung"));
        oberflaeche.add(new TextWidget("Bitte Daten eingeben:"));
        oberflaeche.add(new Eingabefeld("Benutzername"));
        oberflaeche.add(new Eingabefeld("Passwort"));
        oberflaeche.add(new Button("Anmelden"));

        JFrame fenster = new JFrame("Eigene Widget-Hierarchie");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setLayout(new GridLayout(0, 1, 5, 5));

        for (Widget w : oberflaeche) {
            fenster.add(w.erzeugeKomponente());

            if (w instanceof Anklickbar) {
                System.out.println("'" + w.getText() + "' ist anklickbar.");
            }

            if (w instanceof Validierbar) {
                Validierbar v = (Validierbar) w;
                System.out.println("'" + w.getText() + "' ist validierbar (gueltig: "
                        + v.istGueltig() + ").");
            }
        }

        fenster.setSize(400, 300);
        fenster.setVisible(true);
    }
}
