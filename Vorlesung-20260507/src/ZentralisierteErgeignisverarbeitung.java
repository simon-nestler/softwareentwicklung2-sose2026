import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ZentralisierteErgeignisverarbeitung extends JFrame {
    private JTextArea textArea;

    public ZentralisierteErgeignisverarbeitung() {
        setTitle("Zentralisierte Ereignisverarbeitung");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void logEvent(String event) {
        textArea.append(event + "\n");
    }

}
