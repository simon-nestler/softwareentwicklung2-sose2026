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
}
