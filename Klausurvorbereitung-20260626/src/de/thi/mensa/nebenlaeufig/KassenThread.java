package de.thi.mensa.nebenlaeufig;

/**
 * Eine Kasse, die in einem eigenen Thread Essen verkauft und dabei den
 * gemeinsamen Kassenstand hochzählt.
 *
 * Thema: Threads – benannte Thread-Unterklasse (NICHT Lambda),
 *        passend zur Kurskonvention.
 * Vorbild: ZaehlThread / SetzerThread (Vorlesung-20260623).
 */
public class KassenThread extends Thread {

    private Kassenstand kasse;
    private int anzahlVerkaeufe;

    public KassenThread(Kassenstand kasse, int anzahlVerkaeufe) {
        this.kasse = kasse;
        this.anzahlVerkaeufe = anzahlVerkaeufe;
    }

    @Override
    public void run() {
        for (int i = 0; i < anzahlVerkaeufe; i++) {
            // Ohne Synchronisierung ist 'wert = wert + 1' nicht atomar:
            // Lesen, Erhöhen und Schreiben können sich zwischen den Threads
            // verschränken -> verlorene Erhöhungen (lost updates).

            // TODO (Thema Threads): Kapsle die folgende Zeile so, dass immer nur
            // EIN Thread gleichzeitig auf 'kasse' zugreift. (synchronized-Block
            // auf das gemeinsame Objekt 'kasse'.)
            kasse.anzahlVerkaufteEssen = kasse.anzahlVerkaufteEssen + 1;
        }
    }
}
