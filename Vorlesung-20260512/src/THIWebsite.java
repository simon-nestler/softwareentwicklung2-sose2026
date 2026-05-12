import javax.swing.*;
import java.awt.*;

public class THIWebsite extends JFrame {
    static final Color DARK_BLUE = new Color(0x1B2D5B);
    static final Color MID_BLUE = new Color(0x3A5585);
    static final Color LIGHT_BLUE = new Color(0x7A96BB);
    static final Color HOVER_NAV = new Color(0x2A407A);
    static final Color BTN_BG = new Color(0xDDDDDD);
    static final Color BTN_HOVER = new Color(0xBBCCDD);
    static final Color COOKIE_BG = new Color(0xF2F2F2);
    static final Color COOKIE_GRAY = new Color(0xC8C8C8);
    static final Color WHITE = Color.WHITE;

    static final Font FONT_TITLE_COOKIE = new Font("TSSTAR PRO", Font.BOLD | Font.ITALIC, 15);
    static final Font FONT_NAV_BTN = new Font("TSSTAR PRO", Font.ITALIC, 13);
    static final Font FONT_COOKIE_BTN = new Font("TSSTAR PRO", Font.ITALIC, 12);
    static final Font FONT_BODY = new Font("SansSerif", Font.PLAIN, 12);

    public THIWebsite() {
        setTitle("THI \u2013 Technische Hochschule Ingolstadt");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1100, 820);
        setLocationRelativeTo(null);
        setBackground(WHITE);

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(WHITE);
        root.add(new TopBarPanel(), BorderLayout.NORTH);
        root.add(new HeroPanel(), BorderLayout.CENTER);
        root.add(new CookieBannerPanel(), BorderLayout.SOUTH);
        setContentPane(root);
    }

}
