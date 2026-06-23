public class App {
    public static void main(String[] args) throws Exception {
        // sequentiell();
        // runnable();
        // thread();
        complexesBeispiel();
    }

    public static void thread() {
        PrintAlphabetThread thread = new PrintAlphabetThread();
        PrintAlphabetThread thread2 = new PrintAlphabetThread();

        thread.start();
        thread2.start();
    }

    public static void runnable() {
        Thread thread = new Thread(new PrintAlphabetRunnable());
        Thread thread2 = new Thread(new PrintAlphabetRunnable());

        thread.start();
        thread2.start();
    }

    public static void sequentiell() throws InterruptedException {
        PrintAlphabet printAlphabet = new PrintAlphabet();
        PrintAlphabet printAlphabet2 = new PrintAlphabet();

        printAlphabet.run();
        printAlphabet2.run();
    }

    public static void complexesBeispiel() throws InterruptedException {
        Thread thread = new ComplexThread();
        Thread thread2 = new ComplexThread();

        thread.start();
        thread2.start();
    }
}
