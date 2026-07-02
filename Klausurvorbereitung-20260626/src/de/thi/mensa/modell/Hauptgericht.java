package de.thi.mensa.modell;

/**
 * Ein Hauptgericht, z. B. Schnitzel mit Pommes.
 *
 * Thema: Vererbung (extends, super-Konstruktor, Überschreiben).
 */
public class Hauptgericht extends Gericht {

    private boolean vegetarisch;

    public Hauptgericht(String name, double grundpreis, boolean vegetarisch) {
        // super(...) muss als erste Anweisung stehen, bevor this.* gesetzt wird.
        super(name, grundpreis);
        this.vegetarisch = vegetarisch;
    }

    @Override
    public double berechnePreis() {
        // Vegetarische Hauptgerichte sind 50 Cent günstiger
        // (THI-Nachhaltigkeitsrabatt).
        if (vegetarisch) {
            return grundpreis - 0.50;
        }
        return grundpreis;
    }

    @Override
    public String beschreibung() {
        String art = vegetarisch ? "vegetarisches" : "fleischhaltiges";
        return "Hauptgericht (" + art + "): " + name;
    }
}
