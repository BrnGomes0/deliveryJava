package ComponentsSwing;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    // Creating a constructor
    public Window(String title){
        super(title);
        setSize(500, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Not possible to mix in position of window
        setLocationRelativeTo(null); // The window go quite the screen
        getContentPane().setBackground(Color.gray);
        setLayout(null); // Distribute each component in its proper place
    }
}
