public class A extends Object {
    // Alles Klassen erben implizit von Object
    // Wir erben tolle Methoden:
    // toString(): Gibt eine String-Repräsentation des Objekts zurück
    // equals(Object o): Vergleicht das aktuelle Objekt mit einem anderen Objekt
    // clone(): Erzeugt eine Kopie des Objekts

    protected int a;

    public A() {
        a = -1;
        System.out.println("Konstruktor von A ohne Parameter");
    }

    public A(int a) {
        this.a = a;
        System.out.println("Konstruktor von A mit einem Parameter");
    }

    public void eineMethodeInA() {
        System.out.println("Eine Methode in A");
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }
}
