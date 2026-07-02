package de.thi.mensa.ausnahmen;

/**
 * Wird geworfen, wenn das Guthaben des Studenten nicht ausreicht.
 *
 * Thema: Erweiterte Exception mit Zusatzinformationen.
 * Vorbild: NichtGenugZutataAusnahme (Vorlesung-20260616), die
 * Zutat/Bestand/Bedarf mitführt.
 */
public class GuthabenAusnahme extends MensaAusnahme {

    private double vorhanden;
    private double benoetigt;

    public GuthabenAusnahme(double vorhanden, double benoetigt) {
        super("Guthaben reicht nicht: " + String.format("%.2f", vorhanden)
                + " Euro vorhanden, " + String.format("%.2f", benoetigt) + " Euro benoetigt.");
        this.vorhanden = vorhanden;
        this.benoetigt = benoetigt;
    }

    public double getFehlbetrag() {
        // TODO (Thema Exceptions): Gib zurueck, wie viel Euro fehlen.
        // (benoetigt minus vorhanden)
        return benoetigt - vorhanden;
    }
}
