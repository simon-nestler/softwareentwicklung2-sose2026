public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto();
        auto1.fahren(200);

        Auto auto2 = new Auto("BMW");
        auto2.setFahrer(new Person("Diana"));
        auto2.addInsasse(new Person("Alice"));
        auto2.addInsasse(new Person("Bob"));
        auto2.removeInsasse(new Person("Bob"));
        auto2.fahren(10);
    }
}
