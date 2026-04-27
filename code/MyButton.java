package code;
import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    MyButton() {
        this.setFocusable(false);        
        this.setFont(new Font("MV Boli", Font.PLAIN, 15));
        this.setForeground(Color.WHITE);
        this.setBackground(new Color(43, 42, 65));
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE)); // Sort of like it, doesn't show hover effect
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) { MyButton.this.setBackground(new Color(138, 135, 190)); }
            public void mouseExited(java.awt.event.MouseEvent evt) { MyButton.this.setBackground(new Color(43, 42, 65)); }
        });
    }    
}
