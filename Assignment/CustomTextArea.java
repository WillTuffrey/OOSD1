package Assignment;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CustomTextArea extends JTextArea {
    private int rows, columns;

    public CustomTextArea(int Rows, int Columns) {
        this.rows = Rows;
        this.columns = Columns;
        this.setRows(rows);
        this.setColumns(columns);

        this.setFont(new Font("Helvetica", Font.PLAIN, 16));
        this.setForeground(Color.WHITE);

        Border border = BorderFactory.createLineBorder(Color.WHITE);
        this.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        this.setBackground(new Color(43, 42, 65));

        this.setEditable(false);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setVisible(true);
    }
}
