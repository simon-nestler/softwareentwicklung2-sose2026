public class XyList<E> {
    public XyNode<E> head; // 1. Listenelement = Kopf der Liste

    public void add(E value) {
        XyNode<E> q = new XyNode<E>(value);
        XyNode<E> p = head;
        XyNode<E> prev = null;

        while (p != null) { // Suche bis zum Ende der Liste
            prev = p;
            p = p.next;
        }

        q.next = p;
        if (prev == null) { // Liste war leer, neues Element wird zum Kopf
            head = q;
        } else { // Ansonsten neues Element an das Ende der Liste anhängen
            prev.next = q;
        }
    }

    public void print() {
        System.out.println("Die Liste enthält folgende Werte:");
        XyNode<E> p = head;
        while (p != null) {
            System.out.print(p.value + ", ");
            p = p.next;
        }
        System.out.println(); // Neuer Zeile
    }
}
