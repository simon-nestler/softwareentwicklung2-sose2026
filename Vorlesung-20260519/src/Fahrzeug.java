public class Fahrzeug {
    private int anzahlRaeder;
    private int hoechstgeschwindigkeit;

    // Protected, damit die Unterklassen darauf zugreifen können
    protected int geschwindigkeit;
    protected String name;

    public Fahrzeug() {
        this(4);
    }

    public Fahrzeug(int anzahlRaeder) {
        this(anzahlRaeder, 150);
    }

    public Fahrzeug(int anzahlRaeder, int hoechstgeschwindigkeit) {
        this.anzahlRaeder = anzahlRaeder;
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
        this.geschwindigkeit = 0;
        this.name = "Das Fahrzeug";
    }

    /*
     * public void setName(String name) {
     * this.name = name;
     * }
     * 
     * public void setAnzahlRaeder(int anzahlRaeder) {
     * this.anzahlRaeder = anzahlRaeder;
     * }
     * 
     * public void setHoechstgeschwindigkeit(int hoechstgeschwindigkeit) {
     * this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
     * }
     * 
     * public int getAnzahlRaeder() {
     * return this.anzahlRaeder;
     * }
     * 
     * public int getHoechstgeschwindigkeit() {
     * return this.hoechstgeschwindigkeit;
     * }
     * 
     * public int getGeschwindigkeit() {
     * return this.geschwindigkeit;
     * }
     */

    public void fahren(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;

        this.geschwindigkeit = Math.min(this.geschwindigkeit, this.hoechstgeschwindigkeit);
        // Alternative:
        /*
         * if (this.geschwindigkeit > this.hoechstgeschwindigkeit) {
         * this.geschwindigkeit = this.hoechstgeschwindigkeit;
         * }
         */

        this.geschwindigkeit = Math.max(this.geschwindigkeit, -this.hoechstgeschwindigkeit / 5);
        // Alternative:
        /*
         * if (this.geschwindigkeit < -this.hoechstgeschwindigkeit / 5) {
         * this.geschwindigkeit = -this.hoechstgeschwindigkeit / 5;
         * }
         */

        if (this.geschwindigkeit > 0) {
            System.out.println(name + " fährt jetzt vorwärts mit " + this.geschwindigkeit + " km/h");
        } else if (this.geschwindigkeit < 0) {
            System.out.println(name + " fährt jetzt rückwärts mit "
                    + -this.geschwindigkeit + " km/h");
        }

    }

    public void stoppen() {
        if (this.geschwindigkeit == 0) {
            System.out.println(this.name + " steht bereits still");
        } else {
            System.out.println(this.name + " stoppt jetzt");
        }
        this.geschwindigkeit = 0;
    }

    /*
     * @Override
     * public String toString() {
     * return name + " mit " + this.anzahlRaeder +
     * " Rädern, Höchstgeschwindigkeit: "
     * + this.hoechstgeschwindigkeit + " km/h, aktuelle Geschwindigkeit: "
     * + this.geschwindigkeit + " km/h";
     * }
     */
}
