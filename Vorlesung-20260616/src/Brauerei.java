public class Brauerei {

    // Lagerbestände
    private int wasser;
    private int malz;
    private int hopfen;
    private String hefe;

    // Wasseranschluss (Störung möglich)
    private boolean wasserAnschlussOk;

    // Tank
    private int tankInhalt = 0;

    public Brauerei(int wasser, int malz, int hopfen, String hefe,
            boolean wasserAnschlussOk) {
        this.wasser = wasser;
        this.malz = malz;
        this.hopfen = hopfen;
        this.hefe = hefe;
        this.wasserAnschlussOk = wasserAnschlussOk;
    }

    // --- Schritt 1: Maischen (Malz + Wasser) ---
    public void maischen(int malzMenge, int wasserMenge)
            throws KeinWasserAusnahme, NichtGenugZutataAusnahme {
        // Spezifische Störung: Anschluss defekt
        if (!wasserAnschlussOk) {
            throw new KeinWasserAusnahme(
                    "Störung am Wasseranschluss: Leitung liefert kein Wasser.");
        }
        // Erweiterte Exception mit Zusatzinfos: Malz reicht nicht
        if (malz < malzMenge) {
            throw new NichtGenugZutataAusnahme("Malz", malz, malzMenge);
        }
        if (wasser < wasserMenge) {
            throw new NichtGenugZutataAusnahme("Wasser", wasser, wasserMenge);
        }
        malz -= malzMenge;
        wasser -= wasserMenge;
        tankInhalt += wasserMenge;
        System.out.println("  Maischen: " + malzMenge + " kg Malz in "
                + wasserMenge + " Liter Wasser.");
    }

    // --- Schritt 2: Läutern ---
    public void laeutern() {
        System.out.println("  Läutern: Treber abgetrennt, Würze bleibt.");
    }

    // --- Schritt 3: Kochen (Hopfen) ---
    public void kochen(int hopfenMenge) throws KeineHopfenAusnahme {
        // Spezifische Exception: gar kein Hopfen mehr im Lager
        if (hopfen == 0) {
            throw new KeineHopfenAusnahme("Kein Hopfen mehr im Lager.");
        }
        if (hopfen < hopfenMenge) {
            throw new KeineHopfenAusnahme("Nur noch " + hopfen
                    + " g Hopfen, " + hopfenMenge + " g benötigt.");
        }
        hopfen -= hopfenMenge;
        System.out.println("  Kochen: " + hopfenMenge + " g Hopfen zugegeben.");
    }

    // --- Schritt 4: Gärung (Hefe) ---
    public void gärung() {
        if (!hefe.equals("untergärig")) {
            throw new FalscheHefeAusnahme(
                    "Falsche Hefe: \"" + hefe + "\" (erwartet: \"untergärig\").");
        }
        System.out.println("  Gärung: untergärige Hefe zugegeben.");
    }

    // --- Schritt 5: Abfüllen ---
    public void abfuellen() {
        System.out.println("  Abfüllen: " + tankInhalt + " Liter Bier abgefüllt.");
        tankInhalt = 0;
    }
}