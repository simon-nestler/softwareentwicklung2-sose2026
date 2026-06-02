import javax.swing.JComponent;

public abstract class Widget implements Anzeigbar {

    protected String text;
    protected int breite;
    protected int hoehe;

    public Widget(String text, int breite, int hoehe) {
        this.text = text;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public final String getText() {
        return this.text;
    }

    public abstract JComponent erzeugeKomponente();
}
