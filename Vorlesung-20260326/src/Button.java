public class Button {
    private int x = 0;
    private int y = 0;
    private int hohe = 50;
    private int breite = 50;
    private static int anzahlButtons = 0;

    public Button() {
        System.out.println("Standard-Konstruktor.");
        anzahlButtons++;
    }

    public Button(int x, int y) {
        System.out.println("Konstruktor mit X und Y");
        this.x = x;
        this.y = y;
        anzahlButtons++;
    }

    public Button(int x, int y, int breite, int hoehe) {
        this(x, y);
        System.out.println("Konstruktor mit X, Y, Breite und Höhe.");
        this.breite = breite;
        this.hohe = hoehe;
    }

    public static int getAnzahlButtons() {
        return anzahlButtons;
    }

    public void zeichnen() {
        System.out.println("Button zeichnen");
        int[] a = { 10 };
        System.out.println("a: " + a[0]);
        hintergrundFuellen();
        textSchreiben(a);
        System.out.println("a: " + a[0]);
        rahmenZeichnen();
    }

    public void hintergrundFuellen() {
        System.out.println("Hintergrund des Buttons füllen.");
    }

    public void textSchreiben(int[] max) {
        max[0] = 20;
        System.out.println("max: " + max[0]);
        System.out.println("Text auf den Button schreiben.");
        // int georg = schriftWaehlen();
        // System.out.println("georg: " + georg);
    }

    public void rahmenZeichnen() {
        System.out.println("Rahmen des Buttons zeichnen.");
    }

    public int schriftWaehlen() {
        int b = 20;
        System.out.println("Schriftart für den Button wählen.");
        System.out.println("b: " + b);
        return b;
    }
}
