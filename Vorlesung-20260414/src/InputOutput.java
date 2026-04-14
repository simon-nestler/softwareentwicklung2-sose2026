import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InputOutput {
    public static void schreiben() {
        PrintWriter writer = new PrintWriter(System.out, true);
        writer.println("Hello, World!");
        writer.printf("The value of pi is approximately %.2f%n", Math.PI);
        writer.close();
    }

    public static void inDateiSchreiben() {
        PrintWriter writer;
        try {
            writer = new PrintWriter("Test.txt");
            writer.println("Hello, Ingolstadt!");
            writer.printf("The value of pi is approximately %.2f%n", Math.PI);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
