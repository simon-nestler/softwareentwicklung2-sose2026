package de.thi.mensa.modell;

import java.util.ArrayList;

import de.thi.mensa.ausnahmen.GerichtAusverkauftAusnahme;
import de.thi.mensa.ausnahmen.GuthabenAusnahme;
import de.thi.mensa.ausnahmen.MensaAusnahme;

/**
 * Die Mensa: verwaltet die Speisekarte und wickelt Bestellungen ab.
 *
 * Themen:
 *  - Exceptions werfen (throws, throw) – Vorbild: Brauerei (Vorlesung-20260616)
 *  - Rekursion – Vorbild: Rekursion.fakultaet (Vorlesung-20260428)
 *  - Sortieren – einfacher Bubble-Sort auf der Speisekarte
 */
public class Mensa {

    private ArrayList<Gericht> speisekarte = new ArrayList<Gericht>();
    private ArrayList<String> ausverkauft = new ArrayList<String>();

    public void aufnehmen(Gericht g) {
        speisekarte.add(g);
    }

    public void alsAusverkauftMarkieren(String name) {
        ausverkauft.add(name);
    }

    /**
     * Bucht eine Bestellung ab.
     *
     * Wirft GerichtAusverkauftAusnahme, wenn ein Gericht ausverkauft ist,
     * und GuthabenAusnahme, wenn das Guthaben nicht reicht.
     */
    public void abrechnen(Bestellung bestellung) throws MensaAusnahme {
        double preis = bestellung.gesamtpreis();
        Student kunde = bestellung.getBesteller();

        // Prüfung 1: Ist etwas ausverkauft?
        // (Vereinfachte Prüfung über die Speisekarte.)
        for (int i = 0; i < speisekarte.size(); i++) {
            Gericht g = speisekarte.get(i);
            if (ausverkauft.contains(g.getName())) {
                throw new GerichtAusverkauftAusnahme(
                        "Das Gericht '" + g.getName() + "' ist leider ausverkauft.");
            }
        }

        // Prüfung 2: Reicht das Guthaben?
        if (kunde.getGuthaben() < preis) {
            // TODO (Thema Exceptions): Wirf eine GuthabenAusnahme und übergib
            // das vorhandene Guthaben sowie den benötigten Preis.

        }

        kunde.abbuchen(preis);
        System.out.println(preis + " Euro abgebucht. Neues Guthaben: "
                + String.format("%.2f", kunde.getGuthaben()) + " Euro.");
    }

    /**
     * Rekursive Berechnung des Gesamtwerts der Speisekarte ab Index i.
     *
     * Thema: Rekursion (Basisfall + rekursiver Aufruf).
     * Vorbild: Rekursion.fakultaet (Vorlesung-20260428).
     */
    public double summeAb(int index) {
        // Basisfall: hinter dem letzten Element angekommen.
        if (index >= speisekarte.size()) {
            return 0.0;
        }
        // Rekursiver Fall: dieses Gericht + Summe des Rests.
        // TODO (Thema Rekursion): Ersetze die rechte Seite so, dass der
        // Preis des aktuellen Gerichts plus der rekursive Aufruf für den
        // Rest der Liste zurückgegeben wird.
        return speisekarte.get(index).berechnePreis() + 0.0; // <-- 0.0 ersetzen
    }

    /**
     * Sortiert die Speisekarte aufsteigend nach Preis (Bubble-Sort).
     *
     * Thema: Sortieralgorithmen.
     */
    public void nachPreisSortieren() {
        for (int i = 0; i < speisekarte.size() - 1; i++) {
            for (int j = 0; j < speisekarte.size() - 1 - i; j++) {
                Gericht a = speisekarte.get(j);
                Gericht b = speisekarte.get(j + 1);
                if (a.berechnePreis() > b.berechnePreis()) {
                    // Tauschen
                    speisekarte.set(j, b);
                    speisekarte.set(j + 1, a);
                }
            }
        }
    }

    public void speisekarteAusgeben() {
        System.out.println("--- Speisekarte ---");
        for (Gericht g : speisekarte) {
            System.out.println(g + "  | " + g.beschreibung());
        }
    }
}
