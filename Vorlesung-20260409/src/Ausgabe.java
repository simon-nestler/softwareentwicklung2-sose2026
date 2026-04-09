public class Ausgabe {
    public static void systemInformationen() {
        System.out.println("User Home-Verzeichnis: " + System.getProperty("user.home"));
        System.out.println("Betriebssystem: " + System.getProperty("os.name"));
        System.out.println("Betriebssystem-Version: " + System.getProperty("os.version"));
        System.out.println("Benutzername: " + System.getProperty("user.name"));
        System.out.println("Java-Version: " + System.getProperty("java.version"));
        System.out.println("Arbeitsverzeichnis: " + System.getProperty("java.class.path"));
    }

    public static void weitereAusgaben() {
        System.out.println("Mein Name ist: \t\t \"Simon Nestler.\"");
        System.out.println("Nach \\n kommt eine neue Zeile \nJetzt neue Zeile.");
    }

    public static void arbeitenMitPrintF() {
        String name1 = "Softwareentwicklung 1";
        String name2 = "Softwareentwicklung 2";
        double preis1 = 18.80;
        double preis2 = 9.80;

        System.out.println("Das Buch " + name1 + " kostet " + preis1 + " Euro.");

        System.out.printf("Das Buch %s kostet %6.2f Euro.%n", name1, preis1);
        System.out.printf("Das Buch %s kostet %6.2f Euro.%n", name2, preis2);
    }
}
