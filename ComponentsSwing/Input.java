package ComponentsSwing;

import javax.swing.*;
import java.awt.*;

public class Input extends JTextField {
    // Creating a constructor
    public Input(String text, int x, int y, int width, int height){
        setText(text);
        setBounds(x, y, width, height);
        setBorder(null);
        setFont(new Font("Arial", Font.ITALIC, 16));
    }
}
