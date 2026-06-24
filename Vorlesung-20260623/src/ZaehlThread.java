public class ZaehlThread extends Thread {

    private Zaehler zaehler;
    private int ziel;

    public ZaehlThread(Zaehler zaehler, int ziel) {
        this.zaehler = zaehler;
        this.ziel = ziel;
    }

    @Override
    public void run() {
        // Beide Threads zählen denselben (gemeinsamen) Wert hoch.
        // Da beide gleichzeitig erhöhen, springt der Wert über das eigene Ziel
        // hinweg -> die Bedingung wert != ziel wird nie mehr falsch -> stecken.
        while (zaehler.wert != ziel) {
            zaehler.wert = zaehler.wert + 1;
        }
        System.out.println("Thread mit Ziel " + ziel + " hat sein Ziel erreicht.");
    }

}