import java.util.ArrayList;

import de.thi.mensa.ausnahmen.GerichtAusverkauftAusnahme;
import de.thi.mensa.ausnahmen.GuthabenAusnahme;
import de.thi.mensa.ausnahmen.MensaAusnahme;
import de.thi.mensa.modell.Aktionsgericht;
import de.thi.mensa.modell.Beilage;
import de.thi.mensa.modell.Bestellung;
import de.thi.mensa.modell.Gericht;
import de.thi.mensa.modell.Hauptgericht;
import de.thi.mensa.modell.Mensa;
import de.thi.mensa.modell.Rabattfaehig;
import de.thi.mensa.modell.ShallowCopy;
import de.thi.mensa.modell.Student;
import de.thi.mensa.nebenlaeufig.KassenThread;
import de.thi.mensa.nebenlaeufig.Kassenstand;

/**
 * Einstiegspunkt des Mensa-Bestellsystems.
 *
 * Hier laufen alle Themen zusammen. Jede Methode demonstriert ein Thema und
 * lässt sich in main() einzeln aktivieren.
 */
public class App {

    public static void main(String[] args) throws Exception {
        // gerichteUndPolymorphie();
        // bestellungUndExceptions();
        rekursionUndSortieren();
        // interfacesUndCasting();
        // threads();
        // gui();

        // copyKonstruktor();
        // ShallowCopy.demonstrateShallowCopy();
    }

    public static void copyKonstruktor() {
        Student student1 = new Student("Max", 22241);
        System.out.println(student1);
        Student student2 = new Student(student1);
        System.out.println(student2);
        student2.setName("Lorenz");

        System.out.println(student1);
        System.out.println(student2);

    }

    /** Thema 6/7: Vererbung, Polymorphie, abstrakte Methoden. */
    public static void gerichteUndPolymorphie() {
        ArrayList<Gericht> gerichte = new ArrayList<Gericht>();
        gerichte.add(new Hauptgericht("Schnitzel mit Pommes", 5.50, false));
        gerichte.add(new Hauptgericht("Gemüsecurry", 4.80, true));
        gerichte.add(new Beilage("Gemischter Salat", 1.80));
        gerichte.add(new Aktionsgericht("Mensa-Burger", 5.00, false, 1.00));

        // Polymorphie: derselbe Aufruf, je nach echtem Typ andere Berechnung.
        for (Gericht g : gerichte) {
            System.out.println(g + "  | " + g.beschreibung());
        }
    }

    /** Thema 8: Exceptions werfen und in passender Reihenfolge fangen. */
    public static void bestellungUndExceptions() {
        Mensa mensa = new Mensa();
        Hauptgericht schnitzel = new Hauptgericht("Schnitzel mit Pommes", 5.50, false);
        Beilage salat = new Beilage("Gemischter Salat", 1.80);
        mensa.aufnehmen(schnitzel);
        mensa.aufnehmen(salat);

        Student max = new Student("Max", 12345, 3.00); // zu wenig Guthaben

        Bestellung bestellung = new Bestellung(max);
        bestellung.hinzufuegen(schnitzel);
        bestellung.hinzufuegen(salat);

        try {
            mensa.abrechnen(bestellung);
            System.out.println("Bestellung erfolgreich!");
        }
        // Spezifische Ausnahmen zuerst ...
        catch (GerichtAusverkauftAusnahme e) {
            System.err.println("Ausverkauft: " + e.getMessage());
        } catch (GuthabenAusnahme e) {
            System.err.println("Problem: " + e.getMessage());
            System.err.println("Es fehlen noch " + e.getFehlbetrag() + " Euro.");
        }
        // ... die Oberklasse zuletzt.
        catch (MensaAusnahme e) {
            System.err.println("Allgemeiner Mensa-Fehler: " + e.getMessage());
        } finally {
            System.out.println("Bestellvorgang abgeschlossen.");
        }
    }

    /** Thema 4: Rekursion und Sortieren. */
    public static void rekursionUndSortieren() {
        Mensa mensa = new Mensa();
        mensa.aufnehmen(new Hauptgericht("Schnitzel mit Pommes", 5.50, false));
        mensa.aufnehmen(new Beilage("Gemischter Salat", 1.80));
        mensa.aufnehmen(new Aktionsgericht("Mensa-Burger", 5.00, false, 1.00));
        mensa.aufnehmen(new Hauptgericht("Gemüsecurry", 4.80, true));
        mensa.aufnehmen(new Beilage("Pommes", 1.50));

        System.out.println("Vor dem Sortieren:");
        mensa.speisekarteAusgeben();

        mensa.nachPreisSortieren();

        System.out.println("\nNach dem Sortieren (aufsteigend nach Preis):");
        mensa.speisekarteAusgeben();

        System.out.println("\nGesamtwert (rekursiv berechnet): "
                + String.format("%.2f", mensa.summeAb(0)) + " Euro");
    }

    /** Thema 7: Interface-Prüfung mit instanceof und Casten. */
    public static void interfacesUndCasting() {
        ArrayList<Gericht> gerichte = new ArrayList<Gericht>();
        gerichte.add(new Hauptgericht("Gemüsecurry", 4.80, true));
        gerichte.add(new Aktionsgericht("Mensa-Burger", 5.00, false, 1.00));

        for (Gericht g : gerichte) {
            // Vorbild: if (a instanceof E) { E e = (E) a; ... } (Vorlesung-20260519)
            if (g instanceof Rabattfaehig) {
                Rabattfaehig r = (Rabattfaehig) g;
                System.out.println(g.getName() + " ist rabattfähig: "
                        + r.rabattInEuro() + " Euro Rabatt.");
            } else {
                System.out.println(g.getName() + " ist nicht rabattfähig.");
            }
        }
    }

    /** Thema 9: Threads und Race Condition auf dem Kassenstand. */
    public static void threads() throws InterruptedException {
        Kassenstand kasse = new Kassenstand();
        KassenThread k1 = new KassenThread(kasse, 1000000);
        KassenThread k2 = new KassenThread(kasse, 1000000);

        k1.start();
        k2.start();
        k1.join();
        k2.join();

        // Erwartet: 2000000. Ohne synchronized oft weniger (lost updates).
        System.out.println("Verkaufte Essen laut Kasse: " + kasse.anzahlVerkaufteEssen);
        System.out.println("Erwartet: 2000000");
    }

    /** Thema 5: GUI per Komposition. */
    public static void gui() {
        ArrayList<Gericht> speisekarte = new ArrayList<Gericht>();
        speisekarte.add(new Hauptgericht("Schnitzel mit Pommes", 5.50, false));
        speisekarte.add(new Beilage("Gemischter Salat", 1.80));
        speisekarte.add(new Aktionsgericht("Mensa-Burger", 5.00, false, 1.00));
        speisekarte.add(new Hauptgericht("Gemüsecurry", 4.80, true));
        speisekarte.add(new Beilage("Pommes", 1.50));

        de.thi.mensa.gui.SpeisekarteFenster fenster = new de.thi.mensa.gui.SpeisekarteFenster(speisekarte);
        fenster.anzeigen();
    }
}
