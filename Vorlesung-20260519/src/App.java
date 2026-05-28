import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        fahrzeuge();
    }

    public static void vererbung() {
        ArrayList<A> list = new ArrayList<A>();

        list.add(new A());
        list.add(new B());
        list.add(new C());
        list.add(new D(300));
        list.add(new A(100));
        list.add(new B(400));
        list.add(new C());

        for (A a : list) {
            System.out.println(a.toString());

            if (a instanceof C) {
                C c = (C) a;
                c.eineMethodeInC();
            } else if (a instanceof B) {
                B b = (B) a;
                b.eineMethodeInB();
            } else if (a instanceof D) {
                D d = (D) a;
                d.eineMethodeInD();
            }
        }

        /*
         * for (int i = 0; i < list.size(); i++) {
         * System.out.println(list.get(i).toString());
         * }
         */
    }

    public void polymorphismus() {
        A a2 = new C();
        a2.eineMethodeInA();
        System.out.println(a2);

        System.out.println("---");

        // Wenn ich weiß, dass a2 eine Instanz von D ist, kann ich sie auch in D casten
        C c = (C) a2;
        c.eineMethodeInC();

        System.out.println("---");

        a2 = new D(200);
        a2.eineMethodeInA();
        System.out.println(a2);

    }

    public static void abc() {
        C c = new C();
        c.eineMethodeInC();
        System.out.println(c);

        System.out.println("---");

        B b = new B();
        b.eineMethodeInB();
        System.out.println(b);

        System.out.println("---");

        A a = new A();
        a.eineMethodeInA();
        System.out.println(a);

        System.out.println("---");
    }

    public static void motorrad() {
        Motorrad m = new Motorrad();
        // m.setName("Das Motorrad");
        System.out.println(m);
    }

    public static void fahrzeuge() {

        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();

        fahrzeuge.add(new Fahrzeug());

        fahrzeuge.get(0).fahren(-100);
        fahrzeuge.get(0).stoppen();
        fahrzeuge.get(0).fahren(500);
        fahrzeuge.get(0).stoppen();
        fahrzeuge.get(0).stoppen();
        System.out.println(fahrzeuge.get(0));

        System.out.println("---");

        Pkw p = new Pkw();
        p.fahren(-10);
        p.stoppen();
        p.fahren(50);
        p.stoppen();
        System.out.println(p);

        System.out.println("---");

        Lkw l = new Lkw();
        l.fahren(-20);
        l.stoppen();
        l.fahren(100);
        l.stoppen();
        System.out.println(l);
    }
}
