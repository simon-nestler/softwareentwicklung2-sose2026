public class PrintAlphabet {

    public void run() throws InterruptedException {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
            Thread.sleep(500);
        }
    }

}
