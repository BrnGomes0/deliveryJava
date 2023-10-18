package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;

public class FinishOrder {
    // Creating a constructor
    public FinishOrder(boolean visibility){
        Window screenLogin = new Window("Finish Order");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//javaApp//deliveryJava//img//frame_finishorder.png"));
        Button btnFinishOrder = new Button("Finish Order", 133, 213, 233, 53);
        screenLogin.add(btnFinishOrder);
        screenLogin.add(image);
        screenLogin.setVisible(true);
    }
}
