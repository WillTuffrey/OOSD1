package code;
import javax.swing.*;

public class CustomLayeredPane extends JLayeredPane {
    private int x, y, width, height;
    CustomLayeredPane(int X, int Y, int Width, int Height) {
        this.x = X;
        this.y = Y;
        this.width = Width;
        this.height = Height;
        this.setBounds(y, x, width, height);
    }
}
