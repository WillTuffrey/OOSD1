package code;
import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {
    private int width, height;
    private String title;
    CustomFrame(int Width, int Height, String Title) {
        this.width = Width;
        this.height = Height;
        this.title = Title;
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(width, height);
        this.getContentPane().setBackground(new Color(83, 81, 122));
        this.setResizable(false);
        // this.setLayout(null);

        // ImageIcon image = new ImageIcon("marker_blue.png");
        // frame.setIconImage(image.getImage());
    }
}
