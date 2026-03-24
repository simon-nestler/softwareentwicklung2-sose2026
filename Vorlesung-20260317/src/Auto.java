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
        for (int i = 0; i < insassen.length; i++) {
            if (insassen[i] == null) {
                insassen[i] = insasse;
                return;
            }
        }
        System.out.println("Das Auto ist voll und kann keinen weiteren Insassen aufnehmen.");
    }

    public void removeInsasse(Person insasse) {
        for (int i = 0; i < insassen.length; i++) {
            if (insassen[i] != null && insassen[i].getName().equals(insasse.getName())) {
                insassen[i] = null;
                return;
            }
        }
        System.out.println("Der Insasse " + insasse.getName() + " ist nicht im Auto.");
    }

    public void inhaltAusgeben() {
        System.out.println("--------------------");
        System.out.println("Auto: " + name);
        System.out.println("Fahrer: " + (fahrer != null ? fahrer.getName() : "Kein Fahrer"));
        System.out.println("Insassen:");
        for (int i = 0; i < insassen.length; i++) {
            if (insassen[i] != null) {
                System.out.println("- " + insassen[i].getName());
            }
        }
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
