public class Auto {
    private Person fahrer;
    private Person[] insassen;
    private String name;
    public static final int HOECHSTGESCHWINDIGKEIT = 250;
    public static final int MAXSTRECKE = 10000;

    public Auto() {
    }

    public Auto(String name, Person[] insassen) {
        this.name = name;
        this.insassen = insassen;
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

    public void fahren2(int streckeInMetern) {
        if ((streckeInMetern >= 0) && (streckeInMetern <= MAXSTRECKE)) {
            System.out.println("Das Auto fährt " + streckeInMetern + " Meter.");
        } else {
            System.out.println("Die Strecke muss positiv und kleiner als " + MAXSTRECKE + " Meter sein.");
        }
    }

    public void fahren3(int streckeInMetern) {
        if (streckeInMetern < 0) {
            System.out.println("Die Strecke darf nicht negativ sein.");
        } else if (streckeInMetern > MAXSTRECKE) {
            System.out.println("Die Strecke darf nicht größer als " + MAXSTRECKE + " Meter sein.");
        } else {
            System.out.println("Das Auto fährt " + streckeInMetern + " Meter.");
        }
    }
}
