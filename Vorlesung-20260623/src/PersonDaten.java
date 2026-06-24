public class PersonDaten {

    private int alter;
    private double gewicht;

    public PersonDaten(int alter, double gewicht) {
        this.alter = alter;
        this.gewicht = gewicht;
    }

    public void update(int alter, double gewicht) {
        this.alter = alter;
        this.gewicht = gewicht;
    }

    public PersonDaten copy() {
        return new PersonDaten(this.alter, this.gewicht);
    }

    public int getAlter() {
        return alter;
    }

    public double getGewicht() {
        return gewicht;
    }

}