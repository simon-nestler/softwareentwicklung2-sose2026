package de.thi.mensa.modell;

public class ShallowCopy {
    private String name;
    private ObjectValue description;

    public ShallowCopy(String name, ObjectValue description) {
        this.name = name;
        this.description = description;
    }

    public ShallowCopy(ShallowCopy original) {
        this.name = original.name;
        this.description = original.description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectValue getDescription() {
        return description;
    }

    public void setDescription(ObjectValue description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " - " + description.getValue();
    }

    public static void demonstrateShallowCopy() {
        ObjectValue description = new ObjectValue("Frühstück");
        ShallowCopy original = new ShallowCopy("Mensa", description);
        ShallowCopy shallowCopy = new ShallowCopy(original);

        System.out.println("Original: " + original);
        System.out.println("Kopie: " + shallowCopy);

        shallowCopy.getDescription().setValue("Abendessen");
        shallowCopy.setName("Reimanns");

        System.out.println("Original nach Änderung: " + original);
        System.out.println("Kopie nach Änderung: " + shallowCopy);
    }
}
