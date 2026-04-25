package code;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarPartFinder extends JFrame implements ActionListener {
    private JTextField display;

    public CarPartFinder() {
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 22));
        add(display, BorderLayout.NORTH);

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 22));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));

        JFrame frame = new JFrame();
        frame.setTitle("Car Part Finder");
        frame.setSize(800, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setLayout(null); // using no layout managers

        Label introduction = new Label("Welcome to Car Part Finder!");
        introduction.setBounds(10, 0, 300, 20);
        frame.add(introduction);

        JButton button = new JButton("Configure Car Parts");
        button.setBounds(10, 20, 200, 50); // x axis, y axis, width, height
        frame.add(button);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        new CarPartFinder();
    }
}