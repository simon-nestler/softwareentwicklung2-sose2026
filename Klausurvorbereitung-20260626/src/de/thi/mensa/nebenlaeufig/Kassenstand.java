package de.thi.mensa.nebenlaeufig;

/**
 * Gemeinsam genutzter Kassenstand der Mensa.
 *
 * Thema: Threads & Nebenläufigkeit.
 * Vorbild: Zaehler (Vorlesung-20260623).
 *
 * volatile sorgt für Sichtbarkeit zwischen den Threads, garantiert aber KEINE
 * Atomarität der Operation 'wert = wert + 1'.
 */
public class Kassenstand {

    public volatile int anzahlVerkaufteEssen = 0;
}
