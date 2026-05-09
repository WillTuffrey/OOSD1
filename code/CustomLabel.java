package code;
import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {
    private int labelx, labely;
    private String text;
    CustomLabel(int LabelX, int LabelY, String Text, CustomFrame frame) {
        this.labelx = LabelX;
        this.labely = LabelY;
        this.text = Text;
        this.setText(text);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.setBounds(labelx, labely, frame.getWidth(), 30);
    }
}
