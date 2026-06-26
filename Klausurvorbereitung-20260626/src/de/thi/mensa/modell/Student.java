package de.thi.mensa.modell;

/**
 * Ein Studierender, der in der Mensa bestellt.
 *
 * Thema: OOP & Konstruktoren
 *  - Copy-Konstruktor (Vorbild: Person in Vorlesung-20260317)
 *  - static-Zähler (Vorbild: Button.anzahlButtons in Vorlesung-20260326)
 *  - Konstruktor-Verkettung mit this(...)
 */
public class Student {

    private String name;
    private int matrikelnummer;
    private double guthaben;

    // Klassenweite Zählung: wie viele Studierende wurden insgesamt angelegt?
    private static int anzahlStudenten = 0;

    /**
     * Copy-Konstruktor: legt einen neuen Studenten mit denselben Werten an.
     */
    public Student(Student anderer) {
        this(anderer.name, anderer.matrikelnummer, anderer.guthaben);
    }

    /**
     * Bequemer Konstruktor: startet mit 0 Euro Guthaben.
     */
    public Student(String name, int matrikelnummer) {
        // this(...) ruft den Hauptkonstruktor auf (Konstruktor-Verkettung).
        this(name, matrikelnummer, 0.0);
    }

    /**
     * Hauptkonstruktor.
     */
    public Student(String name, int matrikelnummer, double guthaben) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.guthaben = guthaben;
        anzahlStudenten++;
    }

    public static int getAnzahlStudenten() {
        return anzahlStudenten;
    }

    public String getName() {
        return name;
    }

    public double getGuthaben() {
        return guthaben;
    }

    public void aufladen(double betrag) {
        this.guthaben += betrag;
    }

    public void abbuchen(double betrag) {
        this.guthaben -= betrag;
    }

    @Override
    public String toString() {
        return name + " (Matrikelnr. " + matrikelnummer
                + ", Guthaben: " + String.format("%.2f", guthaben) + " Euro)";
    }
}
