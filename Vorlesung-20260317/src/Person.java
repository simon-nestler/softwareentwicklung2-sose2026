public class Person {
    private String name;

    // Copy Konstruktor
    public Person(Person p) {
        this.name = p.name;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
