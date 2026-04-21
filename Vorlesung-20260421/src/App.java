public class App {
    public static void main(String[] args) throws Exception {
        // manuellerWeg();

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
