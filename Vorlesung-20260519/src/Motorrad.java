public class Motorrad extends Fahrzeug {
    // Motorrad muss alle abstrakten Methoden implementieren oder selbst abstrakt
    // sein.

    public Motorrad() {
        super(2);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println("Hup");
    }

}
