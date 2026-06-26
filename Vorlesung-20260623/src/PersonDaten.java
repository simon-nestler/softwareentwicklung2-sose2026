public class PersonDaten {

    private int alter;
    private double gewicht;

    public PersonDaten(int alter, double gewicht) {
        this.alter = alter;
        this.gewicht = gewicht;
    }

    // Durch synchronized wird diese Methode nicht von anderen
    // Methoden unterbrochen.

    public synchronized void update(int alter, double gewicht) {
        this.alter = alter;
        this.gewicht = gewicht;
    }

    // Alle Methoden, die nur von einem Thread gleichzeitig betreten
    // werden dürfen, brauchen das Schlüsselwort "synchronized".

    public synchronized PersonDaten copy() {
        return new PersonDaten(this.alter, this.gewicht);
    }

    public int getAlter() {
        return alter;
    }

    public double getGewicht() {
        return gewicht;
    }

}