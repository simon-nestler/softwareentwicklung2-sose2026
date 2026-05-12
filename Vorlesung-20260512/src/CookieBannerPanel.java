import javax.swing.*;
import java.awt.*;

public class CookieBannerPanel extends JPanel {
    CookieBannerPanel() {
        setLayout(new BorderLayout(20, 0));
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(16, 24, 16, 24));
        initComponents();
    }

    private void initComponents() {
        JPanel left = new JPanel();
        left.setOpaque(false);
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));

        JLabel cookieTitle = new JLabel("Cookies in diesem Browser akzeptieren?");
        cookieTitle.setFont(THIWebsite.FONT_TITLE_COOKIE);
        cookieTitle.setForeground(THIWebsite.DARK_BLUE);
        cookieTitle.setAlignmentX(Component.LEFT_ALIGNMENT);
        left.add(cookieTitle);
        left.add(Box.createVerticalStrut(5));

        JLabel desc = new JLabel("<html><div style='width:500px;'>"
                + "Auf unserer Webseite werden Cookies verwendet. Einige davon werden zwingend "
                + "benoetigt, waehrend es uns andere ermoeglichen, Ihre Nutzererfahrung auf unserer "
                + "Webseite zu verbessern.</div></html>");
        desc.setFont(THIWebsite.FONT_BODY);
        desc.setAlignmentX(Component.LEFT_ALIGNMENT);
        left.add(desc);
        left.add(Box.createVerticalStrut(10));

        JPanel checks = new JPanel(new FlowLayout(FlowLayout.LEFT, 18, 0));
        checks.setOpaque(false);
        checks.setAlignmentX(Component.LEFT_ALIGNMENT);
        checks.add(new CustomCheckBox("Essentiell", true));
        checks.add(new CustomCheckBox("Analytics", false));
        left.add(checks);

        add(left, BorderLayout.CENTER);

        JPanel right = new JPanel(new GridBagLayout());
        right.setOpaque(false);
        JPanel btnRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 6, 0));
        btnRow.setOpaque(false);
        btnRow.add(new CookieButton("Cookie-Information", false));
        btnRow.add(new CookieButton("Auswahl speichern", false));
        btnRow.add(new CookieButton("Alle akzeptieren", true));
        right.add(btnRow);

        add(right, BorderLayout.EAST);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics g2 = g.create();
        g2.setColor(THIWebsite.COOKIE_BG);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setColor(new Color(0xBBBBBB));
        g2.drawLine(0, 0, getWidth(), 0);
        g2.dispose();
        super.paintComponent(g);
    }
}
