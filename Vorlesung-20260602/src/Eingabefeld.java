import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Eingabefeld extends Widget implements Editierbar, Validierbar {

    private String inhalt;

    public Eingabefeld(String beschriftung) {
        super(beschriftung, 200, 25);
        this.inhalt = "";
    }

    @Override
    public JComponent erzeugeKomponente() {
        JTextField feld = new JTextField(15);
        feld.setText(this.inhalt);

        feld.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ausgabeGueltig(feld.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ausgabeGueltig(feld.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ausgabeGueltig(feld.getText());
            }
        });

        return feld;
    }

    private void ausgabeGueltig(String text) {
        this.inhalt = text;
        System.out.println("Eingabefeld '" + getText() + "': " + getInhalt() + " - Gültigkeit: " + istGueltig());
    }

    @Override
    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    @Override
    public String getInhalt() {
        return this.inhalt;
    }

    @Override
    public boolean istGueltig() {
        return this.inhalt != null && !this.inhalt.isBlank();
    }
}
