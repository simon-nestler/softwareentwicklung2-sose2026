package de.thi.mensa.listen;

/**
 * Ein Element einer einfach verketteten Liste.
 *
 * Thema: Lineare Listen & Generics.
 * Vorbild: XyNode (Vorlesung-20260421), ListenElement (Vorlesung-20260416).
 */
public class Knoten<E> {

    public E wert;
    public Knoten<E> next; // Verweis auf das nächste Element

    public Knoten(E wert) {
        this.wert = wert;
    }
}
