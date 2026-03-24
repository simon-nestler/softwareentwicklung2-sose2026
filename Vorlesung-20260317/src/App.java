public class App {
    public static void main(String[] args) throws Exception {
        Person alice = new Person("Alice");
        System.out.println("Name der Person: " + alice.getName());

        Person bob = new Person(alice);
        bob.setName("Bob");
        System.out.println("Name der Person: " + bob.getName());

        System.out.println("Name der Person: " + alice.getName());

        Auto auto1 = new Auto();
        auto1.fahren(200);

        Auto auto2 = new Auto("BMW");
        auto2.inhaltAusgeben();

        auto2.setFahrer(new Person("Diana"));
        auto2.addInsasse(new Person("Alice"));

        auto2.addInsasse(new Person("Bob"));
        auto2.inhaltAusgeben();

        auto2.removeInsasse(new Person("Bob"));
        auto2.inhaltAusgeben();

        auto2.fahren(10);
    }
}
