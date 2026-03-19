public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto();
        auto1.fahren(200);

        Auto auto2 = new Auto("BMW", new Person[4]);
    }
}
