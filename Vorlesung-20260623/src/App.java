public class App {
    public static void main(String[] args) throws Exception {
        // sequentiell();
        // runnable();
        // thread();
        // complexesBeispiel();

        // Probleme bei Nebenläufigkeit (siehe Folien):

        // problemSteckenbleiben(); // Case 1
        // problemNichtInitialisiert(); // Case 2
        // problemUnsaubereDaten(); // Case 3
    }

    public static void thread() {
        PrintAlphabetThread thread = new PrintAlphabetThread();
        PrintAlphabetThread thread2 = new PrintAlphabetThread();

        thread.start();
        thread2.start();
    }

    public static void runnable() {
        Thread thread = new Thread(new PrintAlphabetRunnable());
        Thread thread2 = new Thread(new PrintAlphabetRunnable());

        thread.start();
        thread2.start();
    }

    public static void sequentiell() throws InterruptedException {
        PrintAlphabet printAlphabet = new PrintAlphabet();
        PrintAlphabet printAlphabet2 = new PrintAlphabet();

        printAlphabet.run();
        printAlphabet2.run();
    }

    public static void complexesBeispiel() throws InterruptedException {
        Thread thread = new ComplexThread();
        Thread thread2 = new ComplexThread();

        thread.start();
        thread2.start();
    }

    // ----- Probleme bei Nebenläufigkeit -----

    // Case 1: Thread bleibt "stecken"
    public static void problemSteckenbleiben() throws InterruptedException {
        Zaehler zaehler = new Zaehler();
        ZaehlThread t1 = new ZaehlThread(zaehler, 100000);
        ZaehlThread t2 = new ZaehlThread(zaehler, 200000);

        t1.start();
        t2.start();

        Thread.sleep(1000);
        System.out.println("Status nach 1 Sekunde:");
        System.out.println("  Thread (Ziel 100.000) noch aktiv? " + t1.isAlive());
        System.out.println("  Thread (Ziel 200.000) noch aktiv? " + t2.isAlive());
        System.out.println("  Aktueller Zaehlerwert: " + zaehler.wert);

        // Stecken gebliebene Threads würden die JVM ewig laufen lassen
        // -> Demo sauber beenden:
        System.exit(0);
    }

    // Case 2: Objekt nicht initialisiert (NullPointer)
    public static void problemNichtInitialisiert() throws InterruptedException {
        PersonHalter halter = new PersonHalter();
        SetzerThread setzer = new SetzerThread(halter);
        PruefThread pruefer = new PruefThread(halter);

        setzer.start();
        pruefer.start();

        setzer.join();
        pruefer.join();
    }

    // Case 3: Unsaubere Daten
    public static void problemUnsaubereDaten() throws InterruptedException {
        PersonDaten daten = new PersonDaten(26, 78);
        SchreiberThread schreiber = new SchreiberThread(daten);
        LeserThread leser = new LeserThread(daten);

        schreiber.start();
        leser.start();

        schreiber.join();
        leser.join();
    }
}