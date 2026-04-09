public class Ausgabe {
    public static void systemInformationen() {
        System.out.println("Betriebssystem: " + System.getProperty("os.name"));
        System.out.println("Benutzername: " + System.getProperty("user.name"));
        System.out.println("Java-Version: " + System.getProperty("java.version"));
    }
}
