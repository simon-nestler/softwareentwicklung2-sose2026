public class App {
    public static void main(String[] args) throws Exception {
        Fahrzeug f = new Fahrzeug();
        f.fahren(-10);
        f.stoppen();
        f.fahren(50);
        f.stoppen();
        f.stoppen();
    }
}
