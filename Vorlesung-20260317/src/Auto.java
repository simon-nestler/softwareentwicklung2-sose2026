public class Auto {
    private Person[] insassen;
    private String name;
    public static final int HOECHSTGESCHWINDIGKEIT = 250;

    public Auto() {
    }

    public Auto(String name, Person[] insassen) {
        this.name = name;
        this.insassen = insassen;
    }

    public void fahren(int streckeInMetern) {
        System.out.println("Das Auto fährt " + streckeInMetern + " Meter.");
    }
}
