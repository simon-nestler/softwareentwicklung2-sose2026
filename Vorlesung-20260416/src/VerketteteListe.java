public class VerketteteListe {
    private ListenElement kopf;

    public void anhangen(String inhalt) {
        this.kopf = new ListenElement(inhalt);
    }
}
