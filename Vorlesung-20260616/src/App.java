public class App {
    public static void main(String[] args) {

        // Konstruktor: (wasser, malz, hopfen, hefe, wasserAnschlussOk)

        System.out.println("=== Durchlauf 1: alles korrekt ===");
        bierBrauen(new Brauerei(300, 50, 100, "untergärig", true));

        System.out.println("\n=== Durchlauf 2: Wasseranschluss gestört ===");
        bierBrauen(new Brauerei(300, 50, 100, "untergärig", false));

        System.out.println("\n=== Durchlauf 3: zu wenig Malz ===");
        bierBrauen(new Brauerei(300, 10, 100, "untergärig", true));

        System.out.println("\n=== Durchlauf 4: kein Hopfen / falsche Hefe ===");
        bierBrauen(new Brauerei(300, 50, 0, "obergärig", true));

        Braumeister max = new Braumeister();
        System.out.println("\n=== Letzter Test: " + max.getName() + " ===");
        System.out.println("Länge des Namens: " + max.getLaengeDesNamens());
    }

    public static void bierBrauen(Brauerei brauerei) {
        try {
            brauerei.maischen(40, 250);
            brauerei.laeutern();
            brauerei.kochen(80);
            brauerei.gärung();
            brauerei.abfuellen();
            System.out.println("  -> Sud erfolgreich gebraut!");
        }
        // Spezifische Störung zuerst
        catch (KeinWasserAusnahme e) {
            System.err.println("  ABBRUCH (Wasser): " + e.getMessage());
        } catch (KeineHopfenAusnahme e) {
            System.err.println("  ABBRUCH (Hopfen): " + e.getMessage());
        }
        // Erweiterte Exception mit Zusatzinfos
        catch (NichtGenugZutataAusnahme e) {
            System.err.println("  ABBRUCH (Zutat): " + e.getMessage());
            System.err.println("  Bitte " + e.getFehlt() + " "
                    + e.getZutat() + " nachbestellen.");
        }
        // Oberklasse fängt alle übrigen Brauereifehler
        catch (BrauereiAusnahme e) {
            System.err.println("  ABBRUCH (Brauerei): " + e.getMessage());
        }
        // Unchecked: müsste nicht gefangen werden, hier zur Demo
        catch (FalscheHefeAusnahme e) {
            System.err.println("  ABBRUCH (Rezept): " + e.getMessage());
        } finally {
            System.out.println("  Anlage wird gereinigt.");
        }
    }
}