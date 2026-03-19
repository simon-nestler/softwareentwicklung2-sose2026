public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto();
        auto1.fahren(200);

        Person[] insassen = new Person[4];
        insassen[0] = new Person("Alice");
        insassen[1] = new Person("Bob");
        insassen[2] = new Person("Charlie");
        insassen[2].setIstFahrer();
        insassen[3] = new Person("Diana");
        insassen[3].setIstFahrer();
        Auto auto2 = new Auto("BMW", insassen);
    }
}
