public class Button {
    private int x = 0;
    private int y = 0;
    private int hohe = 50;
    private int breite = 50;

    public Button() {
        System.out.println("Standard-Konstruktor.");
    }

    public Button(int breite, int hoehe) {
        System.out.println("Konstruktor mit Breite und Höhe.");
        this.breite = breite;
        this.hohe = hoehe;
    }

    public Button(int x, int y, int breite, int hoehe) {
        System.out.println("Konstruktor mit X, Y, Breite und Höhe.");
        this.x = x;
        this.y = y;
        this.breite = breite;
        this.hohe = hoehe;
    }
}
