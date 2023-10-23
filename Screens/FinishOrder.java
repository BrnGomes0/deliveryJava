package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;

public class FinishOrder {
    // Creating a constructor
    public FinishOrder(boolean visibility){
        Window screenFinishOrder = new Window("Finish Order");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//deliveryJava//deliveryJava//img//frame_finishorder.png"));
        Button btnFinishOrder = new Button("Finish Order", 133, 213, 233, 53);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        screenFinishOrder.add(btnBack);
        screenFinishOrder.add(btnFinishOrder);
        screenFinishOrder.add(image);
        screenFinishOrder.setVisible(true);

        // Put event in buttons
        btnBack.addActionListener(e -> {
            UserPlace userPlace = new UserPlace(true);
            screenFinishOrder.dispose();
        });

    }
}

