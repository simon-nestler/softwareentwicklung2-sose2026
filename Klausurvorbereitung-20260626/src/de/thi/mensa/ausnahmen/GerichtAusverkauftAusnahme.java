package de.thi.mensa.ausnahmen;

/**
 * Wird geworfen, wenn ein bestelltes Gericht nicht mehr vorrätig ist.
 *
 * Thema: Spezifische Exception als Unterklasse von MensaAusnahme.
 * Vorbild: KeineHopfenAusnahme (Vorlesung-20260616).
 */
public class GerichtAusverkauftAusnahme extends MensaAusnahme {

    public GerichtAusverkauftAusnahme(String message) {
        super(message);
    }
}
