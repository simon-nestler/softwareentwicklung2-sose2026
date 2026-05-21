public class C extends B {
    private int c;

    public C() {
        super(); // Aufruf des Konstruktors der Oberklasse B (ist aber nicht notwendig, da er
                 // automatisch aufgerufen wird)

        System.out.println("Konstruktor von C");
    }
}
