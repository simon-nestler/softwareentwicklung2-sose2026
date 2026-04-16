public class ListenElement {
    private ListenElement nachfolger;
    private String inhalt;

    public ListenElement(String inhalt) {
        this.inhalt = inhalt;
    }

    public void nachfolgerAnhaengen(String inhalt) {
        if (nachfolger == null) {
            nachfolger = new ListenElement(inhalt);
        } else {
            nachfolger.nachfolgerAnhaengen(inhalt);
        }
    }

    public void printElement() {
        System.out.println(inhalt);
        if (nachfolger != null) {
            nachfolger.printElement();
        }
    }

}
