import javax.swing.*;
import java.awt.*;

public class HeroPanel extends JPanel {
    HeroPanel() {
        setLayout(new OverlayLayout(this));

        HeroCanvas canvas = new HeroCanvas();
        add(canvas);

        JPanel overlay = new JPanel(null);
        overlay.setOpaque(false);
        overlay.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

        JLabel title = new JLabel("<html><b>Jetzt bewerben,<br>ab Oktober studieren!</b></html>");
        title.setFont(new Font("SansSerif", Font.BOLD, 26));
        title.setForeground(THIWebsite.WHITE);
        title.setBounds(26, 70, 430, 90);
        overlay.add(title);

        JLabel sub = new JLabel("<html><div style='width:380px;font-size:11px;'>"
                + "Unser Bewerbungsportal PRIMUSS ist fuer viele Bachelor- und "
                + "Masterstudiengaenge sowie Promotions- und Weiterbildungsangebote "
                + "mit Start im Wintersemester geoeffnet!</div></html>");
        sub.setFont(THIWebsite.FONT_BODY);
        sub.setForeground(THIWebsite.WHITE);
        sub.setBounds(26, 168, 430, 90);
        overlay.add(sub);

        BewerbenButton btn = new BewerbenButton("Jetzt informieren und bewerben!");
        btn.setBounds(26, 272, 350, 46);
        overlay.add(btn);

        add(overlay);
    }
}
