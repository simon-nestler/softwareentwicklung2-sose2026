public class VerketteteListe {
    private ListenElement kopf;

    public void anhaengen(String inhalt) {
        if (kopf == null) {
            kopf = new ListenElement(inhalt);
        } else {
            kopf.nachfolgerAnhaengen(inhalt);
        }
    }

    public void printList() {
        kopf.printElement();
    }
}
