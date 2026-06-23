public class PrintAlphabetThread extends Thread {

    @Override
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
