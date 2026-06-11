import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        // numberFormatExceptionBeispiel();
        // arrayIndexOutOfBoundsExceptionBeispiel();
        // bibliothekBeispiel();

        ExceptionHandling exceptionHandling = new ExceptionHandling();
    }

    public static void bibliothekBeispiel() {
        Bibliothek bibliothek = new Bibliothek();

        bibliothek.addBuch(0, "Der Herr der Ringe");
        bibliothek.addBuch(1, "Harry Potter");
        bibliothek.addBuch(2, "Die unendliche Geschichte");

        bibliothek.getBuch(20);
        bibliothek.getBuch(1);
        bibliothek.getBuch(2);
    }

    public static void arrayIndexOutOfBoundsExceptionBeispiel() {
        int[] arr = { 1, 2, 3 };
        arr[3] = 4;
    }

    // Deklaration einer Exception mit throws
    public static void javaIoExceptionBeispiel() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        reader.read();
    }

    public static void numberFormatExceptionBeispiel() {
        String zahl = "13a";

        // Abfangen einer Exception mit try-catch
        try {
            System.out.println("Versuche die Zahl zu parsen...");
            int num = Integer.parseInt(zahl) + 1;
            System.out.println("Die Zahl lautet: " + num);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
