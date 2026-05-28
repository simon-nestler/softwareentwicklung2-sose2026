public class B extends A {
    protected int b;

    public B() {
        super(200);
        System.out.println("Konstruktor von B ohne Parameter");
    }

    public B(int a) {
        super(a);
        System.out.println("Konstruktor von B mit einem Parameter");
    }

    public B(int a, int b) {
        this(a);
        this.b = b;
        System.out.println("Konstruktor von B mit zwei Parametern");
    }

    /*
     * public B(int a, int b) {
     * super(a);
     * this.b = b;
     * System.out.println("Konstruktor von B mit zwei Parametern");
     * }
     */

    public void eineMethodeInB() {
        System.out.println("Eine Methode in B");
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
