public class Fahrrad extends Fahrzeug {

    // Unterklassen dürfen finale Methoden nicht überschreiben.
    @Override
    public final void geraeuschMachen() {
        System.out.println("Klingeling!");
    }

}
