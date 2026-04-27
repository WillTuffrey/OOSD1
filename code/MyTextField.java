package code;
import javax.swing.*;
import java.awt.*;

public class MyTextField extends JTextField {
    MyTextField() {
        this.setFont(new Font("Helvetica", Font.PLAIN, 18));
        this.setForeground(Color.BLACK);
        this.setPreferredSize(new Dimension(80, 40));
    }
}
