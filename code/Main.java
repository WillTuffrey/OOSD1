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
        button.addActionListener(e -> ConfigureCarParts(frame));
        frame.add(button);
    }
    public static void ConfigureCarParts(MyFrame frame) {
        System.out.println("Configure button clicked");

        MyLayeredPane configurePane = new MyLayeredPane(0, 0, frame.getWidth(), frame.getHeight());
        configurePane.setBackground(Color.CYAN);
        // frame.add(configurePane);

        MyFrame f = new MyFrame(500, 400);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        MyLabel heading = new MyLabel(0, 5, f);
        heading.setText("Configure New Car Part");        
        heading.setFont(new Font("MV Boli", Font.PLAIN, 30));
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        f.add(heading);
        frame.add(heading);

        MyLabel code = new MyLabel(5, 70, f);
        code.setText("Code:");
        code.setHorizontalAlignment(SwingConstants.LEFT);
        f.add(code);
        MyTextField codeTextField = new MyTextField();
        codeTextField.setBounds(f.getWidth() / 2 - 125, 70, 250, 40);
        f.add(codeTextField);

        MyLabel quantity = new MyLabel(5, 120, f);
        quantity.setText("Quantity:");
        quantity.setHorizontalAlignment(SwingConstants.LEFT);
        f.add(quantity);
        MyTextField quantityTextField = new MyTextField();
        quantityTextField.setBounds(f.getWidth() / 2 - 125, 120, 250, 40);
        f.add(quantityTextField);

        MyLabel price = new MyLabel(5, 170, f);
        price.setText("Price:");
        price.setHorizontalAlignment(SwingConstants.LEFT);
        f.add(price);
        MyTextField priceTextField = new MyTextField();
        priceTextField.setBounds(f.getWidth() / 2 - 125, 170, 250, 40);
        f.add(priceTextField);

        MyLabel testErrorLabel = new MyLabel(0, 220, f);
        testErrorLabel.setText("This is an error message.");
        testErrorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        testErrorLabel.setForeground(Color.YELLOW);
        f.add(testErrorLabel);

        StockItem stockItem = new StockItem(null, 0, 0.0);

        MyButton submitButton = new MyButton(f.getWidth() / 2 - 125, 270, 250, 50);
        submitButton.setText("Create Stock Item");
        submitButton.addActionListener(e -> { 
            System.out.println("CreateStockItem button clicked");
        });
        f.add(submitButton);
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