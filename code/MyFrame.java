package code;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private int x, y;
    MyFrame(int X, int Y) {
        this.x = X;
        this.y = Y;
        this.setTitle("Car Part Finder");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(x, y);
        this.getContentPane().setBackground(new Color(83, 81, 122));
        this.setResizable(false);
        this.setLayout(null);

        // ImageIcon image = new ImageIcon("marker_blue.png");
        // frame.setIconImage(image.getImage());
    }
}
