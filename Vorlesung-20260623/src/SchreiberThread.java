public class SchreiberThread extends Thread {

    private PersonDaten daten;

    public SchreiberThread(PersonDaten daten) {
        this.daten = daten;
    }

    @Override
    public void run() {
        // Schreibt abwechselnd zwei gültige Zustände: (26, 78) und (27, 83).
        for (int i = 0; i < 10_000_000; i++) {
            if (i % 2 == 0) {
                daten.update(26, 78);
            } else {
                daten.update(27, 83);
            }
        }
    }

}