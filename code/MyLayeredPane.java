package code;
import javax.swing.*;
import java.awt.*;

public class MyLayeredPane extends JLayeredPane {
    private int x, y, width, height;
    MyLayeredPane(int X, int Y, int Width, int Height) {
        x = X;
        y = Y;
        width = Width;
        height = Height;
        this.setBounds(y, x, width, height);
    }
}
