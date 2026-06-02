import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        List<Widget> oberflaeche = List.of(
                new Ueberschrift("Anmeldung"),
                new TextWidget("Bitte Daten eingeben:"),
                new Eingabefeld("Benutzername"),
                new Eingabefeld("Passwort"),
                new Button("Anmelden"));

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
