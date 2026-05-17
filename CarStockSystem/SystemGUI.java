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
        GridBagConstraints gbc = new GridBagConstraints();


        // Main menu panel
        CustomPanel menuPanel = new CustomPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        CustomLabel introductionHeading = new CustomLabel("Welcome to Car Part Finder!");
        introductionHeading.setFont(new Font("MV Boli", Font.PLAIN, 40));
        introductionHeading.setAlignmentX(Component.CENTER_ALIGNMENT);
        CustomLabel introductionText = new CustomLabel("Click \"View Stock\" to view all available items");
        introductionText.setAlignmentX(Component.CENTER_ALIGNMENT);
        CustomButton viewStockButton = new CustomButton("  View Stock  ");
        viewStockButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        viewStockButton.addActionListener(e -> menuLayout.show(parentMenuPanel, "ViewStock"));
        CustomButton exitApplication = new CustomButton("  Exit Application  ");
        exitApplication.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitApplication.addActionListener(e -> System.exit(0));

        menuPanel.add(Box.createVerticalStrut(20));
        menuPanel.add(introductionHeading);
        menuPanel.add(Box.createVerticalStrut(20));
        menuPanel.add(introductionText);
        menuPanel.add(Box.createVerticalStrut(50));
        menuPanel.add(viewStockButton);
        menuPanel.add(Box.createVerticalStrut(70));
        menuPanel.add(exitApplication);






        // Stock Panel
        CustomPanel stockPanel = new CustomPanel();
        stockPanel.setLayout(new BorderLayout());

        CustomPanel stockMenuPanel = new CustomPanel();
        CustomPanel stockCenterPanel = new CustomPanel();
        stockCenterPanel.setLayout(new GridBagLayout());
        stockPanel.add(stockMenuPanel, BorderLayout.NORTH);
        stockPanel.add(stockCenterPanel, BorderLayout.CENTER);

        CustomButton menuButton = new CustomButton(" Exit to Menu ");
        stockMenuPanel.add(menuButton);
        stockMenuPanel.add(Box.createHorizontalStrut(frame.getWidth() / 2 - 157));
        menuButton.addActionListener(e -> menuLayout.show(parentMenuPanel, "Menu"));
        CustomButton addStock = new CustomButton(" Add Stock ");
        stockMenuPanel.add(Box.createHorizontalStrut(frame.getWidth() / 2 - 157));
        stockMenuPanel.add(addStock);
        addStock.addActionListener(e -> menuLayout.show(parentMenuPanel, "AddStock"));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 10, 10, 10);

        CustomLabel configurePart = new CustomLabel(200, 5, "Configure Part", frame);
        stockCenterPanel.add(configurePart, gbc);





        // Add stock panel
        CustomPanel configPanel = new CustomPanel();
        configPanel.setLayout(new BorderLayout());

        CustomPanel configMenuPanel = new CustomPanel();
        CustomPanel configCenterPanel = new CustomPanel();
        configCenterPanel.setLayout(new GridBagLayout());
        configPanel.add(configMenuPanel, BorderLayout.NORTH);
        configPanel.add(configCenterPanel, BorderLayout.CENTER);

        CustomButton backToConfig = new CustomButton(" Return to Stock ");
        configMenuPanel.add(backToConfig);
        backToConfig.addActionListener(e -> menuLayout.show(parentMenuPanel, "ViewStock"));





        parentMenuPanel.add(menuPanel, "Menu");
        parentMenuPanel.add(stockPanel, "ViewStock");
        parentMenuPanel.add(configPanel, "AddStock");
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