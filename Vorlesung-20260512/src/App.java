import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        // new THIWebsite().setVisible(true);

        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new Example());
        frame.setVisible(true);
    }
}
