package de.thi.mensa.modell;

/**
 * Eine Beilage, z. B. Salat oder Pommes.
 *
 * Thema: Vererbung + final Methode.
 */
public class Beilage extends Gericht {

    public Beilage(String name, double grundpreis) {
        super(name, grundpreis);
    }

    @Override
    public double berechnePreis() {
        // Beilagen kosten einfach ihren Grundpreis.
        return grundpreis;
    }

    /**
     * Diese Methode ist final: Unterklassen von Beilage dürfen sie NICHT überschreiben.
     * (Vorbild: Fahrrad.geraeuschMachen() in Vorlesung-20260519.)
     */
    @Override
    public final String beschreibung() {
        // TODO (Thema Vererbung): Gib einen String der Form
        //   "Beilage: <name>"
        // zurück. Nutze das geerbte Feld 'name'.
        return null; // <-- ersetzen
    }
}
