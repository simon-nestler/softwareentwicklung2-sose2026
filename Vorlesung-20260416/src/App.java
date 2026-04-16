public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Max");

        System.out.println("Name der Mutter: " + p1.getMutter().getName());
        System.out.println("------");
        System.out.println(p1.printPerson());

    }
}
