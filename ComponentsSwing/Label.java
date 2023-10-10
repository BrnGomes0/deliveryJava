package ComponentsSwing;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    // Creating a constructor
    public Label(String title, int x, int y, int width, int height, int rgb1, int rgb2, int rgb3){
        super(title);
        setBounds(x, y, width, height);
        setFont(new Font("Arial", PREVIOUS, 20));
        setBackground(new Color(rgb1, rgb2, rgb3));
    }
}
