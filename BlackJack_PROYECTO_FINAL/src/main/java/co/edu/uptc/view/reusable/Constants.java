package co.edu.uptc.view.reusable;

import java.awt.*;
import java.io.IOException;

public class Constants {
    public static final Color PRIMARY_BUTTON_COLOR = new Color(248,244,239,255);
    public static final Color SECONDARY_BUTTON_COLOR = new Color(71,45,60,255);

    public static final String FONT_NAME = "/fonts/PressStart2P-Regular.ttf";

    public static final String REUSABLE_BUTTON_IMAGE_PATH = "/images/icons/button.png";
    public static final String REUSABLE_BUTTON_PRESSED_IMAGE_PATH = "/images/icons/pressed_button.png";
    public static final String MAIN_MENU_BACKGROUND = "/images/backgrounds/menu_background.png";
    public static final String GAME_BACKGROUND = "/images/backgrounds/game_background.png";

    public static final Font CUSTOM_FONT = loadCustomFont();

    public static Font loadCustomFont() {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT,
                    Constants.class.getResourceAsStream(Constants.FONT_NAME)).deriveFont(15f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            return new Font("SansSerif", Font.BOLD, 24);
        }
    }
}
