package CarStockSystem;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    private int r, g, b;

    public CustomPanel(int R, int G, int B) {
        this.r = R;
        this.g = G;
        this.b = B;
        this.setBackground(new Color(r, g, b));

        this.setVisible(true);
    }

    public CustomPanel() {
        this.setBackground(new Color(83, 81, 122));

        this.setVisible(true);
    }
}
