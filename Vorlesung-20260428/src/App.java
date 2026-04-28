public class App {
    public static void main(String[] args) throws Exception {
        long start, end;
        int n = 10000;

        start = System.currentTimeMillis();
        System.out.println("Rekursion: " + Rekursion.fakultaet(n));
        end = System.currentTimeMillis();
        System.out.println("Dauer: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        System.out.println("Iteration: " + Iteration.fakultaet(n));
        end = System.currentTimeMillis();
        System.out.println("Dauer: " + (end - start) + "ms");
    }
}
