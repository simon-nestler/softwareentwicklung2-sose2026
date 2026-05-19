public class Pkw extends Fahrzeug {

    public Pkw() {
        this(4);
    }

    public Pkw(int anzahlRaeder) {
        this(anzahlRaeder, 200);
    }

    public Pkw(int anzahlRaeder, int hoechstgeschwindigkeit) {
        super(anzahlRaeder, hoechstgeschwindigkeit);
        this.name = "Der Pkw";
    }
}
