import javax.swing.*;
import java.awt.*;

public class MiniCodeEditor extends JFrame {

    public MiniCodeEditor() {
        setTitle("softwareentwicklung2-sose2026");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 750);

        setLayout(new BorderLayout());

        add(new ActivityBar(), BorderLayout.WEST);
        add(new StatusBar(), BorderLayout.SOUTH);

        JSplitPane mainSplit = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                new ExplorerPanel(),
                createEditorArea());

        mainSplit.setDividerLocation(260);
        mainSplit.setDividerSize(4);

        add(mainSplit, BorderLayout.CENTER);
    }

    private Component createEditorArea() {
        JPanel panel = new JPanel(new BorderLayout());

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Iteration.java", new JScrollPane(new CodeEditor("""
                public class Iteration {

                    public static long fakultaet(long n) {
                        long result = 1;

                        for (long i = 1; i <= n; i++) {
                            result = result * i;
                        }

                        return result;
                    }
                }
                """)));

        tabs.addTab("Rekursion.java", new JScrollPane(new CodeEditor("""
                public class Rekursion {

                    public static long fakultaet(long n) {
                        if (n == 0) {
                            return 1;
                        }

                        return n * fakultaet(n - 1);
                    }

                    public static void endlos() {
                        if (Math.random() < 0.5) {
                            endlos2();
                        } else {
                            endlos3();
                        }
                    }

                    public static void endlos2() {
                        endlos3();
                    }

                    public static void endlos3() {
                        endlos();
                    }
                }
                """)));

        JSplitPane verticalSplit = new JSplitPane(
                JSplitPane.VERTICAL_SPLIT,
                tabs,
                new TerminalPanel());

        verticalSplit.setDividerLocation(470);
        verticalSplit.setDividerSize(4);

        panel.add(verticalSplit, BorderLayout.CENTER);
        return panel;
    }

}