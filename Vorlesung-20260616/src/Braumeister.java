public class Braumeister {

    private String name;

    public Braumeister() {
        // Alternativ: Dafür sorgen, dass der Name niemals null ist.
        // Entweder hier oder direkt oben (private String name = "";)
        this.name = "";
    }

    public Braumeister(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return "Braumeister " + name;
    }

    public String getLaengeDesNamens() {

        // Wenn der Name null sein kann, dann so lösen:
        if (name != null) {
            return "Der Name '" + name + "' hat " + name.length() + " Zeichen.";
        } else {
            return "Der Name ist nicht definiert.";
        }

        // Kein Mensch würde das so bauen (und die KI hoffentlich auch nicht...):
        // try {
        // return "Der Name '" + name + "' hat " + name.length() + " Zeichen.";
        // } catch (NullPointerException e) {
        // return "Der Name ist nicht definiert.";
        // }
    }
}
