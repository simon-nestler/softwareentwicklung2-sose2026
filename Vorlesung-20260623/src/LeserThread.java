public class LeserThread extends Thread {

    private PersonDaten daten;

    public LeserThread(PersonDaten daten) {
        this.daten = daten;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            PersonDaten kopie = daten.copy();
            int alter = kopie.getAlter();
            double gewicht = kopie.getGewicht();

            boolean gueltig = (alter == 26 && gewicht == 78)
                    || (alter == 27 && gewicht == 83);

            if (!gueltig) {
                System.out.println("Unsaubere Daten gelesen: alter = " + alter
                        + ", gewicht = " + gewicht + " (Durchlauf " + i + ")");
                return;
            }
        }
        System.out.println("Leser-Thread fertig - diesmal keine unsauberen Daten.");
    }

}