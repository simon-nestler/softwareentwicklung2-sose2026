package de.thi.mensa.modell;

/**
 * Ein Aktionsgericht (Tagesangebot), das zusätzlich rabattfähig ist.
 *
 * Thema: Vererbung UND Interface gleichzeitig
 * (extends Gericht implements Rabattfaehig).
 * Vorbild: C/D implements E (Vorlesung-20260519),
 *          Eingabefeld implements Editierbar, Validierbar (Vorlesung-20260602).
 */
public class Aktionsgericht extends Hauptgericht implements Rabattfaehig {

    private double rabatt;

    public Aktionsgericht(String name, double grundpreis, boolean vegetarisch, double rabatt) {
        super(name, grundpreis, vegetarisch);
        this.rabatt = rabatt;
    }

    @Override
    public double rabattInEuro() {
        return rabatt;
    }

    @Override
    public double berechnePreis() {
        // Erst der normale Hauptgericht-Preis (ggf. mit Vegi-Rabatt),
        // dann der Aktionsrabatt obendrauf.
        return super.berechnePreis() - rabatt;
    }

    @Override
    public String beschreibung() {
        return "AKTION: " + name + " (spare " + String.format("%.2f", rabatt) + " Euro)";
    }
}
