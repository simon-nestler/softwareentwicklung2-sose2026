import javax.swing.*;
import java.awt.*;

public class CodeEditor extends JTextArea {

    public CodeEditor(String code) {
        super(code);

        setFont(new Font("Monospaced", Font.PLAIN, 16));
        setTabSize(4);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setCaretColor(Color.BLACK);
        setBorder(BorderFactory.createEmptyBorder(12, 18, 12, 12));
    }
}