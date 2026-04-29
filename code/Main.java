package code;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void CarPartFinder() {
        CustomFrame frame = new CustomFrame(700, 600, "Car Parts Finder");

        CardLayout menuLayout = new CardLayout();
        JPanel parentMenuPanel = new JPanel(menuLayout);

        CustomPanel menuPanel = new CustomPanel();
        CustomLabel introductionHeading = new CustomLabel(0, 5, "Welcome to Car Part Finder!", frame);
        introductionHeading.setFont(new Font("MV Boli", Font.PLAIN, 30));
        introductionHeading.setHorizontalAlignment(SwingConstants.CENTER);
        menuPanel.add(introductionHeading);

        CustomLabel introductionText = new CustomLabel(0, 40, "Some text waffling about the program and how to use it.", frame);
        introductionText.setHorizontalAlignment(SwingConstants.CENTER);
        menuPanel.add(introductionText);

        CustomButton button = new CustomButton(225, 100, 250, 50, "Configure New Car Part");
        button.addActionListener(e -> menuLayout.show(parentMenuPanel, "GameScreen"));
        menuPanel.add(button);





        CustomPanel gamePanel = new CustomPanel();
        CustomButton backButton = new CustomButton(200, 5, 350, 40, "Exit to Menu");
        gamePanel.add(new CustomLabel(200, 5, "GAME SCREEN", frame));
        gamePanel.add(backButton);

        parentMenuPanel.add(menuPanel, "MenuScreen");
        parentMenuPanel.add(gamePanel, "GameScreen");

        CustomButton startButton = new CustomButton(200, 5, 350, 40, "Start");
        startButton.addActionListener(e -> menuLayout.show(parentMenuPanel, "GameScreen"));
        backButton.addActionListener(e -> menuLayout.show(parentMenuPanel, "MenuScreen"));

        frame.add(parentMenuPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        CarPartFinder();
    }
}