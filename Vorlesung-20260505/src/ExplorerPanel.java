import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import java.awt.*;

public class ExplorerPanel extends JPanel {

    public ExplorerPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        JLabel title = new JLabel("  EXPLORER");
        title.setForeground(Color.BLACK);
        title.setFont(new Font("SansSerif", Font.BOLD, 13));
        title.setPreferredSize(new Dimension(0, 42));

        add(title, BorderLayout.NORTH);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("SOFTWAREENTWICKLUNG2");
        DefaultMutableTreeNode vorlesung1 = new DefaultMutableTreeNode("Vorlesung-20260421");
        DefaultMutableTreeNode vorlesung2 = new DefaultMutableTreeNode("Vorlesung-20260428");

        DefaultMutableTreeNode src = new DefaultMutableTreeNode("src");
        src.add(new DefaultMutableTreeNode("App.java"));
        src.add(new DefaultMutableTreeNode("Iteration.java"));
        src.add(new DefaultMutableTreeNode("Rekursion.java"));
        src.add(new DefaultMutableTreeNode("Tree.java"));

        vorlesung1.add(new DefaultMutableTreeNode("README.md"));
        vorlesung2.add(new DefaultMutableTreeNode(".vscode"));
        vorlesung2.add(new DefaultMutableTreeNode("bin"));
        vorlesung2.add(new DefaultMutableTreeNode("lib"));
        vorlesung2.add(src);
        vorlesung2.add(new DefaultMutableTreeNode("README.md"));

        root.add(vorlesung1);
        root.add(vorlesung2);
        root.add(new DefaultMutableTreeNode("Vorlesung-20260430"));
        root.add(new DefaultMutableTreeNode(".gitignore"));
        root.add(new DefaultMutableTreeNode("LICENSE"));

        JTree tree = new JTree(root);
        tree.setBackground(Color.LIGHT_GRAY);
        tree.setForeground(Color.BLACK);
        tree.setFont(new Font("SansSerif", Font.PLAIN, 15));
        tree.setRowHeight(28);
        tree.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree.getCellRenderer();
        renderer.setBackgroundNonSelectionColor(Color.LIGHT_GRAY);

        add(new JScrollPane(tree), BorderLayout.CENTER);
    }
}