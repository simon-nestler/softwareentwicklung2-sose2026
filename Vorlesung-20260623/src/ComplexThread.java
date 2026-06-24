import java.util.Random;

public class ComplexThread extends Thread {

    private String[] marken = { "BMW", "Audi", "Mercedes", "Ford" };

    @Override
    public void run() {
        Random random = new Random();
        Auto auto = new Auto(marken[random.nextInt(marken.length)],
                (int) (Math.random() * 20 + 1990));
        System.out.println(auto);

        for (int i = 0; i < 10; i++) {
            auto.fahren();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
