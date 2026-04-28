package code;
import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    private int x, y, width, height;
    MyButton(int X, int Y, int Width, int Height) {
        this.x = X;
        this.y = Y;
        this.width = Width;
        this.height = Height;
        this.setBounds(x, y, width, height);
        this.setFocusable(false);        
        this.setFont(new Font("MV Boli", Font.PLAIN, 15));
        this.setForeground(Color.WHITE);
        this.setBackground(new Color(43, 42, 65));
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) { MyButton.this.setBackground(new Color(138, 135, 190)); }
            public void mouseExited(java.awt.event.MouseEvent evt) { MyButton.this.setBackground(new Color(43, 42, 65)); }
        });
    }    
}
