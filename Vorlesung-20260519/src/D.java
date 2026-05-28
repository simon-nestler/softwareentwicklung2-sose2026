public class D extends A {
    protected int d;

    public D(int a) {
        super(a);
        System.out.println("Konstruktor von D");
    }

    public void eineMethodeInD() {
        System.out.println("Eine Methode in D");
    }

    @Override
    public String toString() {
        return "D{" +
                "a=" + a +
                ", d=" + d +
                '}';
    }
}
