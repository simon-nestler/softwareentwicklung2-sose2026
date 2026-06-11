package de.thi.nestler.sport;

public class Person {

    private String vorname;
    private Sportart sportart;

    public Person(String vorname, Sportart sportart) {
        this.vorname = vorname;
        this.sportart = sportart;
        sportart.name = "Laufen";
        sportart.istMannschaftssport = false;

        System.out.println("Person (Sport) " + vorname + " wurde erstellt. Sie macht die Sportart " + sportart.name);
    }

    public String getVorname() {
        return vorname;
    }

    public Sportart getSportart() {
        return sportart;
    }
}
