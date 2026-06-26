package de.thi.mensa.modell;

/**
 * Fähigkeit: Auf dieses Gericht kann ein Rabatt gewährt werden.
 *
 * Thema: Interfaces (kleine, fokussierte Fähigkeiten statt großer Oberklasse).
 * Vorbild: Anklickbar / Validierbar (Vorlesung-20260602).
 */
public interface Rabattfaehig {

    /**
     * Liefert den Rabatt in Euro, der auf dieses Gericht gewährt wird.
     */
    double rabattInEuro();
}
