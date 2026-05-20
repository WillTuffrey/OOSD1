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

        StockItem[] stock = new StockItem[4];
        //stock = InstantiateStock(stock);
        Tyre tyre = new Tyre("MPSC2", 12, 399, "Michelin", "Pilot Sport Cup 2", 20);
        Windscreen windscreen = new Windscreen("PWS134", 4, 236, "PILKINGTON", 2.07, true);
        BrakeRotor brakeRotor = new BrakeRotor("DBR12", 37, 106.99, "DRIVETEC", 265, false);
        NavSys satNav = new NavSys("NS101",10,99.99);

        stock[0] = tyre;
        stock[1] = windscreen;
        stock[2] = brakeRotor;
        stock[3] = satNav;

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
        exitApplication.setBackground(new Color(131, 21, 21));
        exitApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitApplication.setBackground(new Color(232, 40, 40));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitApplication.setBackground(new Color(131, 21, 21));
            }
        });
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

        CustomPanel stockMenuPanel = new CustomPanel(54, 51, 101);

        CustomPanel stockSideBarPanel = new CustomPanel();
        stockSideBarPanel.setLayout(new BorderLayout());
        stockSideBarPanel.setPreferredSize(new Dimension(200, 0));

        CustomPanel stockCenterPanel = new CustomPanel();
        stockCenterPanel.setLayout(new GridBagLayout());

        stockPanel.add(stockMenuPanel, BorderLayout.NORTH);
        stockPanel.add(stockSideBarPanel, BorderLayout.WEST);
        stockPanel.add(stockCenterPanel, BorderLayout.CENTER);

        CustomPanel leftSideBar = new CustomPanel(61, 59, 87);
        leftSideBar.setLayout(new GridLayout(0, 1));  //(new BoxLayout(leftSideBar, BoxLayout.Y_AXIS));
        stockSideBarPanel.add(leftSideBar, BorderLayout.CENTER);

        CustomButton menuButton = new CustomButton(" Exit to Menu ");
        menuButton.setBackground(new Color(131, 21, 21));
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButton.setBackground(new Color(232, 40, 40));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButton.setBackground(new Color(131, 21, 21));
            }
        });
        stockMenuPanel.add(menuButton);

        stockMenuPanel.add(Box.createHorizontalStrut(frame.getWidth() / 2 - 325));
        menuButton.addActionListener(e -> menuLayout.show(parentMenuPanel, "Menu"));

        CustomLabel stockOverview = new CustomLabel("Stock Overview ");
        stockOverview.setFont(new Font("MV Boli", Font.PLAIN, 40));
        stockMenuPanel.add(stockOverview);

        CustomButton addStock = new CustomButton(" Add Stock ");
        addStock.setBackground(new Color(10, 108, 16));
        addStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addStock.setBackground(new Color(14, 199, 27));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                addStock.setBackground(new Color(10, 108, 16));
            }
        });

        stockMenuPanel.add(Box.createHorizontalStrut(frame.getWidth() / 2 - 325));
        stockMenuPanel.add(addStock);
        addStock.addActionListener(e -> menuLayout.show(parentMenuPanel, "AddStock"));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 10, 10, 10);

        CustomLabel configurePart = new CustomLabel(200, 5, "Select an item of stock to configure", frame);
        stockCenterPanel.add(configurePart, gbc);

        CustomButton stockItem0 = new CustomButton("<html><center>" + stock[0].GetStockName() + "</center></html>");
        stockItem0.addActionListener(e -> stock[0] = SelectStockItem(stock[0], stockCenterPanel));
        leftSideBar.add(stockItem0);

        CustomButton stockItem1 = new CustomButton("<html><center>" + stock[1].GetStockName() + "</center></html>");
        stockItem1.addActionListener(e -> stock[1] = SelectStockItem(stock[1], stockCenterPanel));
        leftSideBar.add(stockItem1);

        CustomButton stockItem2 = new CustomButton("<html><center>" + stock[2].GetStockName() + "</center></html>");
        stockItem2.addActionListener(e -> stock[2] = SelectStockItem(stock[2], stockCenterPanel));
        leftSideBar.add(stockItem2);

        CustomButton stockItem3 = new CustomButton("<html><center>" + stock[3].GetStockName() + "</center></html>");
        stockItem3.addActionListener(e -> stock[3] = SelectStockItem(stock[3], stockCenterPanel));
        leftSideBar.add(stockItem3);



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
    public static StockItem[] InstantiateStock(StockItem[] stock) {
        Tyre tyre = new Tyre("MPSC2", 12, 399, "Michelin", "Pilot Sport Cup 2", 20);
        Windscreen windscreen = new Windscreen("PWS134", 4, 236, "PILKINGTON", 2.07, true);
        BrakeRotor brakeRotor = new BrakeRotor("DBR12", 37, 106.99, "DRIVETEC", 265, false);
        NavSys satNav = new NavSys("NS101",10,99.99);

        stock[0] = tyre;
        stock[1] = windscreen;
        stock[2] = brakeRotor;
        stock[3] = satNav;

        return stock;
    }
    public static StockItem SelectStockItem(StockItem stock, CustomPanel panel) {
        System.out.println(stock.ToString());

        panel.removeAll();

        return stock;
    }
    public static <T extends StockItem> T DisplayStockInformation(T item) {
        switch (item) {
            case BrakeRotor brakeRotor -> { brakeRotor.ToString(); }
            case Tyre tyre -> { tyre.ToString(); }
            case Windscreen windscreen -> { windscreen.ToString(); }
            case null, default -> { item = null; }
        }
        return item;
    }
    public static void DisplayErrorMessage(CustomFrame frame, String errorMessage) {
        CustomLabel errorLabel = new CustomLabel(0, frame.getWidth(), errorMessage, frame);
        frame.add(errorLabel);
    }
    static void main(String[] args) {
        DesignGUI();
    }
}