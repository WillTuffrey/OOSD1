package CarStockSystem;

import javax.swing.*;

public class CustomLayeredPane extends JLayeredPane {
    private int x, y, width, height;
    public CustomLayeredPane(int X, int Y, int Width, int Height) {
        this.x = X;
        this.y = Y;
        this.width = Width;
        this.height = Height;
        this.setVisible(true);
        this.setBounds(y, x, width, height);
    }
}
