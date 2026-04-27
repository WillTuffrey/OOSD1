package code;
import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    MyButton() {
        this.setFocusable(false);
        this.setText("Configure Car Parts");
        this.setFont(new Font("MV Boli", Font.PLAIN, 15));
        this.setForeground(Color.WHITE);
        this.setBackground(new Color(43, 42, 65));
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // Sort of like it, doesn't show hover effect
    }    
}
