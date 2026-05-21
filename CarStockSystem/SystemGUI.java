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
        InstantiateStock(stock);

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
        leftSideBar.setLayout(new GridLayout(0, 1));
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

        stockMenuPanel.add(Box.createHorizontalStrut(frame.getWidth() / 2 - 265));
        CustomTextArea infoArea = new CustomTextArea(7, 30);
        stockCenterPanel.add(infoArea);

        menuButton.addActionListener(e -> {
            menuLayout.show(parentMenuPanel, "Menu");
            infoArea.setText("Select an item of stock to configure");
        });

        CustomLabel stockOverview = new CustomLabel("Stock Overview ");
        stockOverview.setFont(new Font("MV Boli", Font.PLAIN, 40));
        stockMenuPanel.add(stockOverview);
        stockMenuPanel.add(Box.createHorizontalStrut(frame.getWidth() / 2 - 265));

        CustomLabel displayPart = new CustomLabel(200, 5, "", frame);
        displayPart.setFont(new Font("Helvetica", Font.PLAIN, 20));
        gbc.gridx = 1;
        gbc.gridy = 1;
        stockCenterPanel.add(displayPart, gbc);

        infoArea.setText("Select an item of stock to configure");

        CustomButton stockItem0 = new CustomButton("<html><center>" + stock[0].GetStockName() + "</center></html>");
        stockItem0.addActionListener(e -> {
            stock[0] = ShowStockInformation(stock[0], frame, stockCenterPanel, " ");
        });
        leftSideBar.add(stockItem0);

        CustomButton stockItem1 = new CustomButton("<html><center>" + stock[1].GetStockName() + "</center></html>");
        stockItem1.addActionListener(e -> {
            stock[1] = ShowStockInformation(stock[1], frame, stockCenterPanel, " ");
        });
        leftSideBar.add(stockItem1);

        CustomButton stockItem2 = new CustomButton("<html><center>" + stock[2].GetStockName() + "</center></html>");
        stockItem2.addActionListener(e -> {
            stock[2] = ShowStockInformation(stock[2], frame, stockCenterPanel, " ");
        });
        leftSideBar.add(stockItem2);

        CustomButton stockItem3 = new CustomButton("<html><center>" + stock[3].GetStockName() + "</center></html>");
        stockItem3.addActionListener(e -> {
            stock[3] = ShowStockInformation(stock[3], frame, stockCenterPanel, " ");
        });
        leftSideBar.add(stockItem3);


        parentMenuPanel.add(menuPanel, "Menu");
        parentMenuPanel.add(stockPanel, "ViewStock");
        frame.add(parentMenuPanel);
    }
    public static void InstantiateStock(StockItem[] stock) {
        Tyre tyre = new Tyre("MPSC2", 12, 399, "Michelin", "Pilot Sport Cup 2", 20);
        Windscreen windscreen = new Windscreen("PWS134", 4, 236, "PILKINGTON", 2.07, true);
        BrakeRotor brakeRotor = new BrakeRotor("DBR12", 37, 106.99, "DRIVETEC", 265, false);
        NavSys satNav = new NavSys("NS101",10,99.99);

        stock[0] = tyre;
        stock[1] = windscreen;
        stock[2] = brakeRotor;
        stock[3] = satNav;
    }
    public static StockItem ShowStockInformation(StockItem item, CustomFrame frame, CustomPanel panel, String currentError) {
        GridBagConstraints gbc = new GridBagConstraints();
        final String[] error = {currentError};

        panel.removeAll();
        panel.setLayout(new GridBagLayout());

        final CustomLabel[] errorLabel = {new CustomLabel(currentError)};
        errorLabel[0].setForeground(Color.YELLOW);

        CustomTextArea infoArea = new CustomTextArea(7, 30);
        infoArea.setText(item.ToString());
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.insets = new Insets(97, 0, 10, 0);
        panel.add(infoArea, gbc);

        CustomTextField quantity = new CustomTextField();

        CustomButton sellButton = new CustomButton(" Sell Stock ");
        sellButton.addActionListener(e -> {
            try {
                error[0] = " ";
                if (!item.SellStock(Integer.parseInt(quantity.getText()))) error[0] = item.ReturnError();
                errorLabel[0].setText(error[0]);
            }
            catch (NumberFormatException exception) {
                error[0] = "Number bust be numerical and whole";
                errorLabel[0].setText(error[0]);
                item.SellStock(0);
            }
            quantity.setText("");
            // Uses recursion to update the panel after selling stock
            ShowStockInformation(item, frame, panel, error[0]);
        });

        CustomButton addButton = new CustomButton(" Add Stock ");
        addButton.addActionListener(e -> {
            try {
                error[0] = " ";
                if (!item.AddStock(Integer.parseInt(quantity.getText()))) error[0] = item.ReturnError();
                item.AddStock(Integer.parseInt(quantity.getText()));
            }
            catch (NumberFormatException exception) {
                error[0] = "Number bust be numerical and whole";
                errorLabel[0].setText(error[0]);
                item.AddStock(0);
            }
            quantity.setText("");
            // Uses recursion to update the panel after adding stock
            ShowStockInformation(item, frame, panel, error[0]);
        });

        // Adding the add button, text field and sell button
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0, 50, 0, 5);
        panel.add(sellButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(0, 0, 0, 5);
        panel.add(quantity, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(addButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(20, 0, 0, 0);
        panel.add(errorLabel[0], gbc);

        panel.revalidate();
        panel.repaint();

        return item;
    }
    static void main(String[] args) {
        DesignGUI();
    }
}