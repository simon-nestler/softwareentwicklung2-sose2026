public class Iteration {

    public static long fakultaet(long n) {
        int ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            ergebnis = ergebnis * i;
        }

        // for (int i = n; i >= 1; i--) {
        // ergebnis = ergebnis * i;
        // }

        return ergebnis;
    }
}
