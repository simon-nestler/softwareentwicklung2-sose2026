public class Rekursion {

    public static long fakultaet(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fakultaet(n - 1);
        }
    }

    public static void endlos() {
        if (Math.random() < 0.5) {
            endlos2();
        } else {
            endlos3();
        }
    }

    public static void endlos2() {
        endlos3();
    }

    public static void endlos3() {
        endlos();
    }
}
