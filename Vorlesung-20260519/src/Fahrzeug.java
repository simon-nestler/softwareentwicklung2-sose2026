public class Fahrzeug {
    private int anzahlRaeder;
    private int hoechstgeschwindigkeit;
    private int geschwindigkeit;

    public void fahren(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;

        if (this.geschwindigkeit > 0) {
            System.out.println("Das Fahrzeug fährt jetzt vorwärts mit " + this.geschwindigkeit + " km/h");
        } else if (this.geschwindigkeit < 0) {
            System.out.println("Das Fahrzeug fährt jetzt rückwärts mit " + -this.geschwindigkeit + " km/h");
        }

    }

    public void stoppen() {
        if (this.geschwindigkeit == 0) {
            System.out.println("Das Fahrzeug steht bereits still");
        } else {
            System.out.println("Das Fahrzeug stoppt jetzt");
        }
        this.geschwindigkeit = 0;
    }
}
