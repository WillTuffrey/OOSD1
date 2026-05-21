package CarStockSystem;

import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {
    private int labelx, labely;
    private String text;

    public CustomLabel(int LabelX, int LabelY, String Text, CustomFrame frame) {
        this.labelx = LabelX;
        this.labely = LabelY;
        this.text = Text;
        this.setBounds(labelx, labely, frame.getWidth(), 30);

        MakeLabel();
    }

    public CustomLabel (String Text) {
        this.text = Text;

        MakeLabel();
    }

    public void MakeLabel() {
        this.setText(text);

        this.setForeground(Color.WHITE);
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));

        this.setVisible(true);
    }
}
