package code;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void CarPartFinder() {
        MyFrame frame = new MyFrame(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyLabel introductionHeading = new MyLabel(0, 5, frame);
        introductionHeading.setText("Welcome to Car Part Finder!");
        introductionHeading.setFont(new Font("MV Boli", Font.PLAIN, 30));
        introductionHeading.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(introductionHeading);

        MyLabel introductionText = new MyLabel(0, 40, frame);
        introductionText.setText("Some text waffling about the program and how to use it.");
        introductionText.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(introductionText);

        MyButton button = new MyButton(225, 100, 250, 50);
        button.setText("Configure New Car Part");
        button.addActionListener(e -> ConfigureCarParts());
        frame.add(button);
    }
    public static void ConfigureCarParts() {
        System.out.println("Configure button clicked");
        MyFrame frame = new MyFrame(500, 400);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        MyLabel heading = new MyLabel(0, 5, frame);
        heading.setText("Configure New Car Part");        
        heading.setFont(new Font("MV Boli", Font.PLAIN, 30));
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(heading);

        MyLabel code = new MyLabel(5, 70, frame);
        code.setText("Code:");
        code.setHorizontalAlignment(SwingConstants.LEFT);
        frame.add(code);
        MyTextField codeTextField = new MyTextField();
        codeTextField.setBounds(frame.getWidth() / 2 - 125, 70, 250, 40);
        frame.add(codeTextField);

        MyLabel quantity = new MyLabel(5, 120, frame);
        quantity.setText("Quantity:");
        quantity.setHorizontalAlignment(SwingConstants.LEFT);
        frame.add(quantity);
        MyTextField quantityTextField = new MyTextField();
        quantityTextField.setBounds(frame.getWidth() / 2 - 125, 120, 250, 40);
        frame.add(quantityTextField);

        MyLabel price = new MyLabel(5, 170, frame);
        price.setText("Price:");
        price.setHorizontalAlignment(SwingConstants.LEFT);
        frame.add(price);
        MyTextField priceTextField = new MyTextField();
        priceTextField.setBounds(frame.getWidth() / 2 - 125, 170, 250, 40);
        frame.add(priceTextField);

        MyLabel testErrorLabel = new MyLabel(0, 220, frame);
        testErrorLabel.setText("This is an error message.");
        testErrorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        testErrorLabel.setForeground(Color.YELLOW);
        frame.add(testErrorLabel);

        StockItem stockItem = new StockItem(null, 0, 0.0);

        MyButton submitButton = new MyButton(frame.getWidth() / 2 - 125, 270, 250, 50);
        submitButton.setText("Create Stock Item");
        submitButton.addActionListener(e -> { 
            System.out.println("CreateStockItem button clicked");
        });
        frame.add(submitButton);        
    }
    public static StockItem CreateStockItem() {        
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