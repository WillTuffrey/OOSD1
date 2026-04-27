package code;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void CarPartFinder() {
        MyFrame frame = new MyFrame();

        MyLabel introductionHeading = new MyLabel(0, 5, frame);
        introductionHeading.setText("Welcome to Car Part Finder!");
        introductionHeading.setFont(new Font("MV Boli", Font.PLAIN, 30));
        frame.add(introductionHeading);

        MyLabel introductionText = new MyLabel(0, 40, frame);
        introductionText.setText("Some text waffling about the program and how to use it.");
        frame.add(introductionText);

        MyButton button = new MyButton();
        button.setText("Configure New Car Part");
        button.setBounds(225, 100, 250, 50);
        button.addActionListener(e -> ConfigureCarParts());
        frame.add(button);

        MyTextField textField = new MyTextField();        
        textField.setBounds(0, 400, 250, 40);
        frame.add(textField);
    }
    public static void ConfigureCarParts() {
        System.out.println("Button clicked");
    }
    public StockItem CreateStockItem() {
        StockItem stockItem = new StockItem("-1", 0, 0.0);
        return stockItem;
    }
    public static void DisplayErrorMessage(MyFrame frame, String errorMessage) {
        MyLabel errorLabel = new MyLabel(0, frame.getWidth(), frame);
        errorLabel.setText(errorMessage);
        frame.add(errorLabel);
    }
    public static void main(String[] args) {
        CarPartFinder();
    }
}