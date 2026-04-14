import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InputOutput {
    public static void schreibenAufKonsole() {
        PrintWriter writer = new PrintWriter(System.out, true);
        schreiben(writer);
    }

    public static void inDateiSchreiben() {
        PrintWriter writer;
        try {
            writer = new PrintWriter("Test.txt");
            schreiben(writer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void schreiben(PrintWriter writer) {
        writer.println("Hello, World!");
        writer.printf("The value of pi is approximately %.2f%n", Math.PI);
        writer.close();
    }

}
