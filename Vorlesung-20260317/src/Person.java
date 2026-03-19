public class Person {
    private String name;
    private boolean istFahrer = false;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getIstFahrer() {
        return istFahrer;
    }

    public void setIstFahrer(boolean istFahrer) {
        this.istFahrer = istFahrer;
    }

    // oder:

    public void setIstFahrer() {
        this.istFahrer = true;
    }

    public void setIstMitfahrer() {
        this.istFahrer = false;
    }
}
