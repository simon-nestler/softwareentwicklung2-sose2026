package de.thi.mensa.listen;

/**
 * Eine einfach verkettete, generische Liste.
 *
 * Thema: Lineare Listen & Generics (Typparameter <E>, Kopf-Zeiger, Durchlauf
 * mit prev/p). Vorbild: XyList (Vorlesung-20260421).
 */
public class VerketteteListe<E> {

    private Knoten<E> kopf;
    private int groesse = 0;

    /**
     * Hängt einen Wert hinten an die Liste an.
     */
    public void anhaengen(E wert) {
        Knoten<E> neu = new Knoten<E>(wert);

        if (kopf == null) {
            // Liste war leer -> neues Element wird zum Kopf.
            kopf = neu;
        } else {
            // Bis zum letzten Element laufen und dort anhängen.
            Knoten<E> p = kopf;
            while (p.next != null) {
                p = p.next;
            }
            // TODO (Thema Listen): Hänge das neue Element 'neu' an das
            // letzte Element 'p' an. (Eine Zeile.)

        }
        groesse++;
    }

    public int getGroesse() {
        return groesse;
    }

    /**
     * Gibt das Element an Position index zurück (0-basiert).
     */
    public E get(int index) {
        Knoten<E> p = kopf;
        int i = 0;
        while (p != null) {
            if (i == index) {
                return p.wert;
            }
            p = p.next;
            i++;
        }
        return null;
    }

    public void ausgeben() {
        Knoten<E> p = kopf;
        while (p != null) {
            System.out.println("  - " + p.wert);
            p = p.next;
        }
    }
}
