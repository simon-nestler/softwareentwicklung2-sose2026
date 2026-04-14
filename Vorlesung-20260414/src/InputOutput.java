import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {
    public static void schreibenAufKonsole() {
        PrintWriter writer = new PrintWriter(System.out, true);
        schreiben(writer);
    }

    public static void lesenVonKonsoleMitSystemIn() {
        try {
            int i = System.in.read();
            System.out.println("Gelesenes Zeichen: " + (char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lesenVonKonsoleMitScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();
        System.out.println("Hallo, " + name + "!");
        scanner.close();
    }

    public static void lesenVonKonsoleMitBufferedReader() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.print("Geben Sie Ihren Namen ein: ");
        try {
            String name = reader.readLine();
            System.out.println("Hallo, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        writer.println("Hello, World! \nWas für ein schöner Tag!");
        writer.printf("The value of pi is approximately %.2f%n", Math.PI);
        writer.close();
    }

}
