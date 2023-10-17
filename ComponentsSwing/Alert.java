package ComponentsSwing;

import javax.swing.*;

public class Alert extends JOptionPane {
    // Creating a constructor
    public Alert(String message, String title){
        showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
