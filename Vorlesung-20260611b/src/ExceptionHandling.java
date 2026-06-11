import java.io.IOException;
import java.util.Random;

public class ExceptionHandling {

    public ExceptionHandling() {
        nichtRiskanteMethode();
    }

    public void riskanteMethode1() throws IOException {
        Random random = new Random();
        boolean fehler = random.nextBoolean();

        if (!fehler) {
            System.out.println("Alles gut, kein Fehler aufgetreten.");
        } else {
            throw new IOException("Ein Fehler ist aufgetreten!");
        }
    }

    // riskanteMethode2 ist ebenfalls riskant, da sie riskanteMethode1 aufruft,
    // die eine IOException werfen kann
    public void riskanteMethode2() throws IOException {
        riskanteMethode1();
    }

    // Diese Methode ist nicht mehr riskant, da sie die Exception abfängt.
    public void nichtRiskanteMethode() {
        try {
            riskanteMethode2();
        } catch (IOException e) {
            System.out.println("Fehler in nichtRiskanteMethode abgefangen: " + e.getMessage());
        }
    }
}
