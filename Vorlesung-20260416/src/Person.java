public class Person {
    private Person mutter;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void printPerson() {
        System.out.print("Name: " + name + ", ");
        if (mutter != null) {
            System.out.println("Mutter: " + mutter.name);
        } else {
            System.out.println("Keine Mutter angegeben.");
        }
    }
}
