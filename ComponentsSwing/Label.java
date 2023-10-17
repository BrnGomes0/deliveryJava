package ComponentsSwing;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    // Creating a constructor
    public Label( int x, int y, int width, int height){
        setBounds(x, y, width, height);
        setFont(new Font("Arial", PREVIOUS, 20));
    }
}
