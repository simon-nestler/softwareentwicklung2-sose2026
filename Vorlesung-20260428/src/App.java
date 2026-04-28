public class App {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        System.out.println("Rekursion: " + Rekursion.fakultaet(100));
        long end = System.currentTimeMillis();
        System.out.println("Dauer: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        System.out.println("Iteration: " + Iteration.fakultaet(100));
        end = System.currentTimeMillis();
        System.out.println("Dauer: " + (end - start) + "ms");
    }
}
