package code;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

        JLabel introduction = new JLabel();
        introduction.setText("Welcome to Car Part Finder!");
        introduction.setBounds(0, 0, 800, 30);
        introduction.setForeground(Color.WHITE);
        introduction.setFont(new Font("MV Boli", Font.PLAIN, 30));
        frame.add(introduction);
        
        MyButton button = new MyButton();
        button.setBounds(200, 100, 250, 50);        
        button.addActionListener(e -> System.out.println("Button clicked"));
        frame.add(button);
    }
}