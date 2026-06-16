import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ExceptionHandling {

    public ExceptionHandling() {
        // nichtRiskanteMethode();
        // riskanteMethodeDieMitRessourcenArbeitet();
        // System.out.println(einfachesFinallyBeispiel());

        try {
            methodeNurMitFinally();
        } catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    // Ohne Catch-Block: Ich muss die Exception deklarieren
    public void methodeNurMitFinally() throws IOException {
        try {
            System.out.println("Dieser Block könnte eine Exception werfen.");
            throw new IOException("Ein Fehler ist aufgetreten!");
        } finally {
            System.out.println("Dieser Block wird immer ausgeführt.");
        }
    }

    public boolean einfachesFinallyBeispiel() {
        Random random = new Random();
        boolean fehler = random.nextBoolean();

        try {
            System.out.println("Dieser Block könnte eine Exception werfen.");
            if (fehler) {
                throw new ArithmeticException("Ein Fehler ist aufgetreten!");
            }
            System.out.println("Dieser Block wird nur ausgeführt, wenn kein Fehler aufgetreten ist.");
            return true;
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch Null ist nicht erlaubt!");
            return false;
        } finally {
            System.out.println("Dieser Block wird immer ausgeführt.");
        }

        // System.out.println("Warum brauchen wir überhaupt ein finally?");
        // return false;
    }

    public void riskanteMethodeDieMitRessourcenArbeitet() {
        BufferedWriter writer = null;
        BufferedReader reader = null;
        // try-with-resources: Automatisches Schließen von Ressourcen
        try {
            writer = new BufferedWriter(new FileWriter("ziel.txt", false));
            reader = new BufferedReader(new FileReader("quelle.txt"));

            String line = reader.readLine();
            writer.write(line);

        } catch (IOException e) {
            System.out.println("Fehler beim Verarbeiten der Datei " + e.getMessage());
        } finally {
            System.out.println("Dieser Block wird immer ausgeführt.");

            try {
                if (writer != null)
                    writer.close();
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Fehler beim Schließen der Ressourcen");
            }

        }

    }

    // throws: Exception deklarieren oder
    // catch: Exception abfangen

    // throw: Exception werfen

    // NullPointerExeption is eine RuntimeException, die nicht zwingend deklariert
    // oder abgefangen werden muss
    // IOException ist eine checked Exception (aka Compiler geprüfte Exception), die
    // entweder deklariert oder
    // abgefangen werden muss
    public void riskanteMethode1() throws IOException, NullPointerException {
        Random random = new Random();
        boolean fehler = random.nextBoolean();

        if (!fehler) {
            throw new NullPointerException("Ein NullPointerException Fehler ist aufgetreten!");
        } else {
            throw new IOException("Eine IOException ist aufgetreten!");
        }
    }

    // riskanteMethode2 ist ebenfalls riskant, da sie riskanteMethode1 aufruft,
    // die eine IOException werfen kann
    public void riskanteMethode2() throws IOException, NullPointerException {
        riskanteMethode1();
    }

    // Diese Methode ist nicht mehr riskant, da sie die Exception abfängt.
    public void nichtRiskanteMethode() {
        try {
            riskanteMethode2();
        } catch (IOException e) {
            System.out.println("IOFehler");
        }
        // Mehrere catch Blöcke: Ein bisschen wie if-else, aber für Exceptions
        catch (NullPointerException e) {
            System.out.println("NullPointer-Fehler");
        }
        // Ein bisschen wie ein else-Block, der alle anderen Exceptions abfängt
        // Muss immer am Ende stehen
        catch (Exception e) {
            System.out.println("Sonstiger Fehler");
        }
    }
}
