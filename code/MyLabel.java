package code;
import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    private int labelx, labely;
    MyLabel(int LabelX, int LabelY, MyFrame frame) {
        labelx = LabelX;
        labely = LabelY;
        this.setForeground(Color.WHITE);
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.setBounds(labelx, labely, frame.getWidth(), 30);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }    
}
