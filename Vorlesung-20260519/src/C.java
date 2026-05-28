public class C extends B {
    protected int c;

    public C() {
        super(); // Aufruf des Konstruktors der Oberklasse B (ist aber nicht notwendig, da er
                 // automatisch aufgerufen wird)

        System.out.println("Konstruktor von C");

    }

    public void eineMethodeInC() {
        System.out.println("Eine Methode in C");
    }

    @Override
    public String toString() {
        return "C{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

}
