public class Auto {
    private Person fahrer;
    private Person[] insassen = new Person[4];
    private String name;
    public static final int HOECHSTGESCHWINDIGKEIT = 250;
    public static final int MAXSTRECKE = 10000;

    public Auto() {
    }

    public Auto(String name) {
        this.name = name;
    }

    public void setFahrer(Person fahrer) {
        this.fahrer = fahrer;
    }

    public void addInsasse(Person insasse) {
        // Logik zum Hinzufügen eines Insassen
    }

    public void removeInsasse(Person insasse) {
        // Logik zum Entfernen eines Insassen
    }

    public void inhaltAusgeben() {
        // Logik zum Ausgeben der Insassen und des Fahrers
    }

    public void fahren(int streckeInMetern) {
        if (fahrer == null) {
            System.out.println("Das Auto hat keinen Fahrer und kann nicht fahren.");
            return;
        }

        if ((streckeInMetern < 0) || (streckeInMetern > MAXSTRECKE)) {
            System.out.println("Die Strecke muss positiv und kleiner als " + MAXSTRECKE + " Meter sein.");
        } else {
            System.out.println("Das Auto fährt " + streckeInMetern + " Meter.");
        }
    }
}
