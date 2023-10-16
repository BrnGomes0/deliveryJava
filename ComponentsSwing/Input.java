package ComponentsSwing;

import javax.swing.*;
import java.awt.*;

public class Input extends JTextField {
    // Creating a constructor
    public Input(int x, int y, int width, int height){
        setBounds(x, y, width, height);
        setBorder(null);
        setFont(new Font("Arial", Font.PLAIN, 16));
    }
}
