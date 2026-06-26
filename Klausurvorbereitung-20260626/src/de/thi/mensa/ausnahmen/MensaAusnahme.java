package de.thi.mensa.ausnahmen;

/**
 * Oberklasse aller Mensa-Ausnahmen (checked Exception, da von Exception abgeleitet).
 *
 * Thema: Pakete & Exceptions – Exception-Hierarchie.
 * Vorbild: BrauereiAusnahme (Vorlesung-20260616).
 */
public class MensaAusnahme extends Exception {

    public MensaAusnahme(String message) {
        super(message);
    }
}
