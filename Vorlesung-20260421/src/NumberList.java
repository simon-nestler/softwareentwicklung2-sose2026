public class NumberList {
    public NumberNode head; // 1. Listenelement = Kopf der Liste

    public void add(int value) {
        NumberNode q = new NumberNode(value);
        NumberNode p = head;
        NumberNode prev = null;

        while ((p != null) && (p.value < value)) { // Suche bis zum Ende der Liste
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
        NumberNode p = head;
        while (p != null) {
            System.out.print(p.value + ", ");
            p = p.next;
        }
        System.out.println(); // Neuer Zeile
    }
}
