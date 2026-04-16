public class App {
    public static void main(String[] args) throws Exception {
        // personenTest();
    }

    public static void personenTest() {
        Person p1 = new Person("Max");

        System.out.println("Name der Mutter: " + p1.getMutter().getName());
        System.out.println("Name der Grossmutter: " + p1.getGrossMutter().getName());
        System.out.println("Name der UrGrossmutter: " + p1.getUrGrossMutter().getName());

        System.out.println("------");
        p1.setMutter(p1.getGrossMutter());

        System.out.println("Name der Mutter: " + p1.getMutter().getName());
        System.out.println("Name der Grossmutter: " + p1.getGrossMutter().getName());
        System.out.println("Name der UrGrossmutter: " + p1.getUrGrossMutter().getName());

        System.out.println("------");
        Person p2 = new Person("Anna");
        p2.setMutter(p1.getMutter());
        p1.setMutter(p2);

        System.out.println("Name der Mutter: " + p1.getMutter().getName());
        System.out.println("Name der Grossmutter: " + p1.getGrossMutter().getName());
        System.out.println("Name der UrGrossmutter: " + p1.getUrGrossMutter().getName());

        System.out.println("------");

        System.out.println(p1.printPerson());
    }
}
