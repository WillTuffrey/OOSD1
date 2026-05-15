package CarStockSystem;
import javax.swing.*;
import java.awt.*;

public class CustomTextField extends JTextField {
    public CustomTextField() {
        this.setFont(new Font("Helvetica", Font.PLAIN, 18));
        this.setForeground(Color.BLACK);
        this.setPreferredSize(new Dimension(80, 40));
        this.setVisible(true);
    }
}
