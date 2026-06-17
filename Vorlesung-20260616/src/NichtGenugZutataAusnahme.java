public class NichtGenugZutataAusnahme extends BrauereiAusnahme {

    private String zutat;
    private int fehlt;

    public NichtGenugZutataAusnahme(String zutat, int vorhanden, int benoetigt) {
        super("Nicht genug " + zutat + ": " + vorhanden
                + " vorhanden, " + benoetigt + " benötigt.");
        this.zutat = zutat;
        this.fehlt = benoetigt - vorhanden;
    }

    public String getZutat() {
        return zutat;
    }

    public int getFehlt() {
        return fehlt;
    }
}
