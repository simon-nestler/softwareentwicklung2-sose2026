public class Zaehler {

    // volatile: sonst cacht der JIT den Wert pro Thread in einem Register,
    // beide zählen ihre eigene Kopie hoch und niemand bleibt stecken.
    public volatile int wert = 0;

}