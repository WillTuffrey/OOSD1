package CarStockSystem;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    private int x, y, width, height;
    private String text;

    public CustomButton(int X, int Y, int Width, int Height, String Text) {
        this.x = X;
        this.y = Y;
        this.width = Width;
        this.height = Height;
        this.text = Text;
        this.setBounds(x, y, width, height);

        MakeButton();
    }

    public CustomButton(String Text) {
        this.text = Text;

        MakeButton();
    }

    private void MakeButton() {
        this.setText(text);

        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.setForeground(Color.WHITE);
        this.setBackground(new Color(43, 42, 65));

        this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustomButton.this.setBackground(new Color(138, 135, 190));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                CustomButton.this.setBackground(new Color(43, 42, 65));
            }
        });

        this.setFocusable(false);
        this.setVisible(true);
    }
}
