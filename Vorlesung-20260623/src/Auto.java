public class Auto {

    private String marke;
    private int baujahr;

    public Auto(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }

    public void fahren() {
        System.out.println("Das " + this + " fährt 100 Meter.");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marke='" + marke + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
