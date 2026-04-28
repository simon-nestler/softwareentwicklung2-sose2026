import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // manuellerWeg();
        // listenErzeugen();

        // generischeListenErzeugen();
        arbeitenMitJavaApi();

    }

    public static void arbeitenMitJavaApi() {
        String[] stringArray = new String[10];
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");

        // Fügen Sie drei Strings in die Liste hinzu
        list.add("def");
        list.add("ghi");
        list.add("jkl");

        // Geben Sie den Index von "abc" aus
        System.out.println("Index von abc ist: " + list.indexOf("abc"));

        // Fügen Sie "abc" ein zweites Mal hinzu
        list.add("abc");

        // Wie oft kommt "abc" in der Liste vor?
        int abcCount = 0;
        for (String s : list) {
            if (s.equals("abc")) {
                abcCount++;
            }
        }
        System.out.println("Anzahl von abc ist: " + abcCount);

        // Was steht an Index 2? Geben Sie es aus.
        System.out.println("Element an Index 2 ist: " + list.get(2));

        // Setzen Sie Element an Index 2 auf "XY".
        list.set(2, "XY");
        stringArray[2] = "XY";

        // Löschen Sie Element an Index 0.
        list.remove(0);

        // Kopieren der Liste mithilfe des Konstruktors
        ArrayList<String> list1 = new ArrayList<String>(list);

        // Geben Sie list und list1 aus.
        System.out.println("list: " + list);
        System.out.println("list1: " + list1);

        // Löschen Sie Element an Index 0.
        list1.remove(0);

        // Geben Sie list und list1 aus.
        System.out.println("list: " + list);
        System.out.println("list1: " + list1);

    }

    public static void generischeListenErzeugen() {
        XyList<String> list0 = new XyList<String>();
        list0.add("abc");
        list0.add("def");
        list0.print();

        XyList<Integer> list1 = new XyList<Integer>();
        list1.add(10);
        list1.add(12);
        list1.print();

        XyList<Character> list2 = new XyList<Character>();
        list2.add('a');
        list2.add('b');
        list2.print();

        XyList<XyPerson> list3 = new XyList<XyPerson>();
        list3.add(new XyPerson("Alice"));
        list3.add(new XyPerson("Bob"));
        list3.print();
    }

    public static void listenErzeugen() {
        NumberList list0 = new NumberList();
        list0.add(10);
        list0.print();

        NumberList list1 = new NumberList();
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(10);
        list1.print();

        NumberList list2 = new NumberList();
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        list2.add(3);
        list2.print();

        NumberList list3 = new NumberList();
        list3.add(4);
        list3.add(3);
        list3.add(2);
        list3.add(1);
        list3.add(1);
        list3.print();
    }

    public static void manuellerWeg() {
        NumberList list = new NumberList();

        NumberNode node1 = new NumberNode(4);
        NumberNode node2 = new NumberNode(3);
        NumberNode node3 = new NumberNode(2);
        NumberNode node4 = new NumberNode(1);

        list.head = node1; // Kopf der Liste auf erstes Element setzen
        node1.next = node2; // 1. Element zeigt auf 2. Element
        node2.next = node3; // 2. Element zeigt auf 3. Element
        node3.next = node4; // 3. Element zeigt auf 4. Element

        list.print();
    }
}
