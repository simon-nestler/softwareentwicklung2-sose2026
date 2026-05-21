public class App {
    public static void main(String[] args) throws Exception {
        C c = new C();
    }

    public static void motorrad() {
        Motorrad m = new Motorrad();
        m.setName("Das Motorrad");
        System.out.println(m);
    }

    public static void fahrzeuge() {

        Fahrzeug f = new Fahrzeug();
        f.fahren(-100);
        f.stoppen();
        f.fahren(500);
        f.stoppen();
        f.stoppen();
        System.out.println(f);

        Pkw p = new Pkw();
        p.fahren(-10);
        p.stoppen();
        p.fahren(50);
        p.stoppen();
        System.out.println(p);

        Lkw l = new Lkw();
        l.fahren(-20);
        l.stoppen();
        l.fahren(100);
        l.stoppen();
        System.out.println(l);
    }
}
