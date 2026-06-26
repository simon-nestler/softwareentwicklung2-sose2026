package de.thi.mensa.modell;

import de.thi.mensa.listen.VerketteteListe;

/**
 * Eine Bestellung besteht aus mehreren Gerichten.
 *
 * Thema: Lineare Listen (Verwendung der eigenen VerketteteListe<Gericht>)
 *        + Polymorphie (es werden Gericht-Referenzen gespeichert,
 *        die tatsächlich Hauptgericht/Beilage/Aktionsgericht sind).
 */
public class Bestellung {

    private Student besteller;
    private VerketteteListe<Gericht> gerichte = new VerketteteListe<Gericht>();

    public Bestellung(Student besteller) {
        this.besteller = besteller;
    }

    public void hinzufuegen(Gericht g) {
        gerichte.anhaengen(g);
    }

    public Student getBesteller() {
        return besteller;
    }

    /**
     * Summiert die Preise aller Gerichte.
     * Dank Polymorphie ruft berechnePreis() je nach echtem Typ
     * die richtige Implementierung auf – ohne instanceof.
     */
    public double gesamtpreis() {
        double summe = 0.0;
        for (int i = 0; i < gerichte.getGroesse(); i++) {
            Gericht g = gerichte.get(i);
            summe += g.berechnePreis();
        }
        return summe;
    }

    public void ausgeben() {
        System.out.println("Bestellung von " + besteller.getName() + ":");
        gerichte.ausgeben();
        System.out.println("  Gesamt: " + String.format("%.2f", gesamtpreis()) + " Euro");
    }
}
