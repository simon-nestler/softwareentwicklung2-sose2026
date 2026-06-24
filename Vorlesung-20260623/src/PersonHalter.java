public class PersonHalter {

    // Gemeinsam genutzte Referenz, die beide Threads sehen.
    // volatile: sonst cacht der JIT den Wert und die Race wird unsichtbar.
    public volatile Person person;

}