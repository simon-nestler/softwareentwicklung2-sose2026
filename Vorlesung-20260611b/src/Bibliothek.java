public class Bibliothek {

    String[] buecher;

    public Bibliothek() {
        // this.buecher = new String[groesse];
    }

    public void initBuecher(int groesse) {
        this.buecher = new String[groesse];
    }

    public void addBuch(int index, String buch) {
        if (buecher != null && index >= 0 && index < buecher.length) {
            buecher[index] = buch;
        } else {
            System.out.println("Der Index " + index + " ist ungültig!");
        }
    }

    public void getBuch(int index) {
        if (buecher != null && index >= 0 && index < buecher.length) {
            System.out.println("Das Buch an Index " + index + " lautet: " + buecher[index]);
        } else {
            System.out.println("Der Index " + index + " ist ungültig!");
        }
    }
}
