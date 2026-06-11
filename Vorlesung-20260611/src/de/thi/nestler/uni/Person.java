package de.thi.nestler.uni;

public class Person {

    private int matrikelnummer;
    private Kurs kurs;

    public Person(int matrikelnummer, Kurs kurs) {
        this.matrikelnummer = matrikelnummer;
        this.kurs = kurs;
        System.out.println("Person (Uni) " + matrikelnummer + " wurde erstellt.");
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public Kurs getKurs() {
        return kurs;
    }
}
