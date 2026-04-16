public class Person {
    private Person mutter;
    private String name;

    public Person(String name) {
        this.name = name;

        if (this.name.length() < 100) {
            this.mutter = new Person("Mutter von " + name);
        }
    }

    public Person getGrossMutter() {
        if (this.getMutter() != null) {
            return this.getMutter().getMutter();
        } else {
            return null;
        }
    }

    public Person getUrGrossMutter() {
        if (this.getGrossMutter() != null) {
            return this.getGrossMutter().getMutter();
        } else {
            return null;
        }
    }

    public Person getMutter() {
        return mutter;
    }

    public void setMutter(Person mutter) {
        this.mutter = mutter;
    }

    public String getName() {
        return name;
    }

    public String printPerson() {
        String result = "Name: " + name + ", ";
        if (mutter != null) {
            result += "Mutter: " + mutter.printPerson();
        } else {
            result += "Keine Mutter angegeben.";
        }
        return result;
    }
}
