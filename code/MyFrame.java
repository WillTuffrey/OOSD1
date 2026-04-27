package code;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("Car Part Finder");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setVisible(true);
        this.setSize(700, 800);
        this.getContentPane().setBackground(new Color(83, 81, 122));
        this.setLayout(null);

        // ImageIcon image = new ImageIcon("marker_blue.png");
        // frame.setIconImage(image.getImage());
        // this.setResizable(false); // Could be useful
    }
}
