public class PruefThread extends Thread {

    private PersonHalter halter;

    public PruefThread(PersonHalter halter) {
        this.halter = halter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000000; i++) {
            // synchronized sorgt dafür, dass dieser Zugriff
            // nur stattfindet, wenn kein anderer Thread gerade den
            // Token für das Objekt "halter" hat

            synchronized (halter) {
                if (halter.person != null) {
                    try {
                        halter.person.getName();
                    } catch (NullPointerException e) {
                        System.out.println("Problem: NullPointerException trotz vorheriger "
                                + "Pruefung auf != null! (Durchlauf " + i + ")");
                        return;
                    }
                }
            }
        }
        System.out.println("Pruef-Thread fertig - diesmal kein Problem aufgetreten.");
    }

}