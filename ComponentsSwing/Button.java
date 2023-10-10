package ComponentsSwing;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    // Creating a Constructor
    public Button(String title, int x, int y, int width, int height){
        super(title);
        setBounds(x, y, width, height);
        setFont(new Font("Arial", Font.PLAIN, 20));
        setBorderPainted(false);

    }
}
