import javax.swing.*;
import java.awt.*;

public class TopBarPanel extends JPanel {
    TopBarPanel() {
        setLayout(new BorderLayout(20, 0));
        setBackground(THIWebsite.WHITE);
        setBorder(BorderFactory.createEmptyBorder(18, 24, 8, 16));

        THILogo logo = new THILogo();
        logo.setPreferredSize(new Dimension(220, 56));
        add(logo, BorderLayout.WEST);

        JPanel grid = new JPanel(new GridLayout(2, 4, 3, 3));
        grid.setBackground(THIWebsite.WHITE);
        for (String lbl : new String[] {
                "Hochschule", "Fakulaeten", "Studium", "Forschung & Transfer",
                "Weiterbildung", "Service", "Karriere", "Campus Neuburg" }) {
            grid.add(new NavButton(lbl));
        }
        add(grid, BorderLayout.CENTER);
    }
}
