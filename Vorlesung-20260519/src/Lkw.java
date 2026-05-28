public class Lkw extends Fahrzeug {

    public Lkw() {
        this(10);
    }

    public Lkw(int anzahlRaeder) {
        this(anzahlRaeder, 80);
    }

    public Lkw(int anzahlRaeder, int hoechstgeschwindigkeit) {
        super(anzahlRaeder, hoechstgeschwindigkeit);
        this.name = "Der Lkw";
    }

    @Override
    public void geraeuschMachen() {
        System.out.println("Tröööt!");
    }

}
