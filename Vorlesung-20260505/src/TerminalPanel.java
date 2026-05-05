import javax.swing.*;
import java.awt.*;

public class TerminalPanel extends JPanel {

    public TerminalPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        JLabel title = new JLabel("  PROBLEME    AUSGABE    TERMINAL    DEBUGGING-KONSOLE    PORTS");
        title.setPreferredSize(new Dimension(0, 36));
        title.setFont(new Font("SansSerif", Font.BOLD, 13));
        title.setForeground(new Color(90, 90, 90));

        JTextArea terminal = new JTextArea("""
                bash: /Users/nestler/.profile: No such file or directory

                The default interactive shell is now zsh.
                To update your account to use zsh, please run `chsh -s /bin/zsh`.
                For more details, please visit https://support.apple.com/kb/HT208050.
                slash-slash:softwareentwicklung2-sose2026 nestler$
                """);

        terminal.setFont(new Font("Monospaced", Font.PLAIN, 15));
        terminal.setEditable(false);
        terminal.setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 10));

        add(title, BorderLayout.NORTH);
        add(new JScrollPane(terminal), BorderLayout.CENTER);
    }
}