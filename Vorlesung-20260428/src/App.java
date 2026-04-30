public class App {
    public static void main(String[] args) throws Exception {
        baum();

    }

    public static void baum() {
        Tree<Integer> lllinks = new Tree<Integer>(8);
        Tree<Integer> llinks = new Tree<Integer>(5, lllinks, null);
        Tree<Integer> rlinks = new Tree<Integer>(1);
        Tree<Integer> links = new Tree<Integer>(5, llinks, rlinks);

        Tree<Integer> lrechts = new Tree<Integer>(4, new Tree<Integer>(3), new Tree<Integer>(2));
        Tree<Integer> rrechts = new Tree<Integer>(1);
        Tree<Integer> rechts = new Tree<Integer>(2, lrechts, rrechts);

        Tree<Integer> baum = new Tree<Integer>(10, links, rechts);

        System.out.println("Inorder Traversierung:");
        baum.inorder();
        System.out.println();

        System.out.println("Preorder Traversierung:");
        baum.preorder();
        System.out.println();

        System.out.println("Postorder Traversierung:");
        baum.postorder();
        System.out.println();
    }

    public static void rekursion() {
        Rekursion.endlos();

        long start, end;
        long n = 10;

        start = System.currentTimeMillis();
        System.out.println("Rekursion: " + Rekursion.fakultaet(n));
        end = System.currentTimeMillis();
        System.out.println("Dauer: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        System.out.println("Iteration: " + Iteration.fakultaet(n));
        end = System.currentTimeMillis();
        System.out.println("Dauer: " + (end - start) + "ms");
    }
}
