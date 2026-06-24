public class PruefThread extends Thread {

    private PersonHalter halter;

    public PruefThread(PersonHalter halter) {
        this.halter = halter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000000; i++) {
            if (halter.person != null) {
                // Zwischen Prüfung und Zugriff vergeht Zeit (hier: yield()).
                // In dieser Lücke kann der andere Thread halter.person = null setzen!
                Thread.yield();
                try {
                    halter.person.getName();
                } catch (NullPointerException e) {
                    System.out.println("Problem: NullPointerException trotz vorheriger "
                            + "Pruefung auf != null! (Durchlauf " + i + ")");
                    return;
                }
            }
        }
        System.out.println("Pruef-Thread fertig - diesmal kein Problem aufgetreten.");
    }

}