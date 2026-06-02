import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // fahrzeuge();
        superReferenz();
    }

    public static void superReferenz() {
        A a = new A();
        D d = new D(100);

        System.out.println("--- ---");

        a.eineMethodeInA();
        d.eineMethodeInA();
        d.eineMethodeInD();
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
        int[] geschwindigkeit1 = { -100, -10, -20, -30, -100 };
        int[] geschwindigkeit2 = { 500, 50, 100, 150, 500 };

        fahrzeuge.add(new Pkw());
        fahrzeuge.add(new Pkw());
        fahrzeuge.add(new Lkw());
        fahrzeuge.add(new Lkw());
        fahrzeuge.add(new Motorrad());

        for (int j = 0; j < fahrzeuge.size(); j++) {
            fahrzeuge.get(j).fahren(geschwindigkeit1[j]);
            fahrzeuge.get(j).stoppen();
            fahrzeuge.get(j).fahren(geschwindigkeit2[j]);
            fahrzeuge.get(j).stoppen();

            System.out.println(fahrzeuge.get(j));

            // Wir brauchen hier eine Fallunterscheidung, weil Pkw und Lkw unterschiedliche
            // Methoden haben, um ein Geräusch zu machen.

            // Wenn wir keine abstrakte Methode in Fahrzeug hätten.
            /*
             * if (fahrzeuge.get(j) instanceof Pkw) {
             * Pkw pkw = (Pkw) fahrzeuge.get(j);
             * pkw.geraeuschMachen();
             * } else if (fahrzeuge.get(j) instanceof Lkw) {
             * Lkw lkw = (Lkw) fahrzeuge.get(j);
             * lkw.geraeuschMachen();
             * } else if (fahrzeuge.get(j) instanceof Motorrad) {
             * Motorrad motorrad = (Motorrad) fahrzeuge.get(j);
             * motorrad.geraeuschMachen();
             * }
             */

            fahrzeuge.get(j).geraeuschMachen();
            System.out.println("---");
        }
    }
}
