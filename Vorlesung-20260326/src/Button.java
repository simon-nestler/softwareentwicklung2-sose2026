public class Button {
    private int x;
    private int y;
    private int hohe;
    private int breite;

    public Button() {
        System.out.println("Standard-Konstruktor.");
    }

    public Button(int breite, int hoehe) {
        System.out.println("Konstruktor mit Breite und Höhe.");
    }

    public Button(int x, int y, int breite, int hoehe) {
        System.out.println("Konstruktor mit X, Y, Breite und Höhe.");
    }
}
