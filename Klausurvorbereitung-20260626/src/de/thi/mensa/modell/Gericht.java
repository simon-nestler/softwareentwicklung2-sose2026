package de.thi.mensa.modell;

/**
 * Oberklasse aller Gerichte in der Mensa.
 *
 * Thema: Vererbung & Polymorphie (abstract, abstrakte Methode, toString).
 * Vorbild aus der Vorlesung: Fahrzeug (Vorlesung-20260519).
 */
public abstract class Gericht {

    // protected, damit Unterklassen direkt zugreifen können (wie bei Fahrzeug).
    protected String name;
    protected double grundpreis;

    public Gericht(String name, double grundpreis) {
        this.name = name;
        this.grundpreis = grundpreis;
    }

    public String getName() {
        return name;
    }

    /**
     * Jedes Gericht berechnet seinen Preis selbst.
     * Abstrakte Methode: kein Rumpf, endet mit Semikolon.
     * Die Unterklassen MÜSSEN diese Methode überschreiben.
     */
    public abstract double berechnePreis();

    /**
     * Jedes Gericht beschreibt sich selbst (z. B. für die Speisekarte).
     */
    public abstract String beschreibung();

    @Override
    public String toString() {
        return name + " (" + String.format("%.2f", berechnePreis()) + " Euro)";
    }
}
