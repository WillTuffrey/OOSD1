package CarStockSystem;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {
    private int width, height;
    private String title;

    public CustomFrame(int Width, int Height, String Title) {
        this.width = Width;
        this.height = Height;
        this.title = Title;
        this.setTitle(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(83, 81, 122));

        this.setVisible(true);
        this.setResizable(false);
    }
}
