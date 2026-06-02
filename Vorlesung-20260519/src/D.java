public class D extends A {
    protected int d;

    public D(int a) {
        super(a);
        System.out.println("Konstruktor von D");
    }

    // Neben überschreiben und erben von Methoden, können wir Methoden auch
    // erweitern.
    @Override
    public void eineMethodeInA() {
        System.out.println("... und noch etwas mehr :-)");
        super.eineMethodeInA();
    }

    public void eineMethodeInD() {
        System.out.println("Eine Methode in D");
    }

    @Override
    public String toString() {
        return "D{" +
                "a=" + a +
                ", d=" + d +
                '}';
    }
}
