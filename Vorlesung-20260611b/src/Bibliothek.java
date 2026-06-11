public class Bibliothek {

    String[] buecher;

    public Bibliothek(int groesse) {
        this.buecher = new String[groesse];
    }

    public void addBuch(int index, String buch) {
        buecher[index] = buch;
    }

    public void getBuch(int index) {
        System.out.println("Das Buch an Index " + index + " lautet: " + buecher[index]);
    }
}
