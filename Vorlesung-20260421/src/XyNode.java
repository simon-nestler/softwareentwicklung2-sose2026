public class XyNode<E> {

    public E value;
    public XyNode<E> next; // Verweis auf nächstes Element

    public XyNode(E value) { // Konstruktor
        this.value = value;
    }
}
