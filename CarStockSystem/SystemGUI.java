package CarStockSystem;

import javax.swing.*;
import java.awt.*;

public class SystemGUI {
    public static void TestStockItem() {
        StockItem stock = new StockItem("W101", 10, 99.99);

        System.out.println("Task 1. Creating a stock with 10 units Unknown item, price 99.99 each, and item code W101 Printing stock item information\n");
        System.out.println(stock.ToString());

        System.out.println("\n\nTask 2. Increasing 10 more units Printing stock item information\n");
        if (!stock.AddStock(10)) System.out.println("Error:");
        System.out.println(stock.ToString());

        System.out.println("\n\nTask 3. Sold 2 units Printing stock item information\n");
        if (!stock.SellStock(2)) System.out.println("Error:");
        System.out.println(stock.ToString());

        System.out.println("\n\nTask 4. Set new price 100.99 per unit Printing stock item information\n");
        stock.SetPrice(100.99);
        System.out.println(stock.ToString());
    }
    public static void DesignGUI() {
        CustomFrame frame = new CustomFrame(900, 600, "Car Parts Finder");

        CardLayout menuLayout = new CardLayout();
        JPanel parentMenuPanel = new JPanel(menuLayout);

        CustomPanel menuPanel = new CustomPanel();

        CustomLabel introductionHeading = new CustomLabel(0, 5, "Welcome to Car Part Finder!", frame);
        introductionHeading.setFont(new Font("MV Boli", Font.PLAIN, 40));
        introductionHeading.setAlignmentX(Component.CENTER_ALIGNMENT);
        CustomLabel introductionText = new CustomLabel(0, 40, "Click \"View Stock\" to view all available items", frame);
        introductionText.setAlignmentX(Component.CENTER_ALIGNMENT);
        CustomButton viewStockButton = new CustomButton(225, 100, 250, 50, "  View Stock   ");
        viewStockButton.setFont(new Font("MV Boli", Font.PLAIN, 20));
        viewStockButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        viewStockButton.addActionListener(e -> menuLayout.show(parentMenuPanel, "ConfigScreen"));

        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.add(Box.createVerticalStrut(20));
        menuPanel.add(introductionHeading);
        menuPanel.add(Box.createVerticalStrut(20));
        menuPanel.add(introductionText);
        menuPanel.add(Box.createVerticalStrut(50));
        menuPanel.add(viewStockButton);




        CustomPanel configPanel = new CustomPanel();
        configPanel.setLayout(new GridBagLayout());        //GridLayout(5, 10)
        GridBagConstraints gbc = new GridBagConstraints();

        CustomButton menuButton = new CustomButton(200, 5, 350, 40, "Exit to Menu");


        configPanel.add(menuButton);








        configPanel.add(new CustomLabel(200, 5, "Configure Part", frame));
        configPanel.add(new CustomLabel(5, 50, "Enter part details:", frame));

        parentMenuPanel.add(menuPanel, "MenuScreen");
        parentMenuPanel.add(configPanel, "ConfigScreen");

        CustomButton configButton = new CustomButton(200, 5, 350, 40, "Start");
        configButton.addActionListener(e -> menuLayout.show(parentMenuPanel, "ConfigScreen"));
        menuButton.addActionListener(e -> menuLayout.show(parentMenuPanel, "MenuScreen"));

        frame.add(parentMenuPanel);
    }
    public static void ConfigureCarParts(CustomFrame frame) {
        System.out.println("Configure button clicked");
    }
    public static StockItem CreateStockItem() {
        StockItem stockItem = new StockItem("-1", 0, 0.0);
        return stockItem;
    }
    public static void DisplayErrorMessage(CustomFrame frame, String errorMessage) {
        CustomLabel errorLabel = new CustomLabel(0, frame.getWidth(), errorMessage, frame);
        frame.add(errorLabel);
    }
    public static void main(String[] args) {
        //TestStockItem();
        DesignGUI();
    }
}