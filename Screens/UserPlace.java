package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;

public class UserPlace {
    // Creating a constructor
    public UserPlace(boolean visibility){
        Window userPlace = new Window("UserPlace");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//javaApp//deliveryJava//img//frame_userplace.png"));
        Button btnAddToCart = new Button("Add to Cart", 133, 137, 233, 53);
        Button btnShowMenu = new Button("Show menu", 133, 229, 233, 53);
        Button btnFinishOrder = new Button("Finish Order", 133, 321, 233, 53);
        userPlace.add(btnAddToCart);
        userPlace.add(btnShowMenu);
        userPlace.add(btnFinishOrder);
        userPlace.add(image);
        userPlace.setVisible(visibility);

        // Creating a events in Button
        btnAddToCart.addActionListener(e -> {
            AddToCart addToCart = new AddToCart(true);
            userPlace.dispose();
        });
        btnFinishOrder.addActionListener(e -> {
            FinishOrder finishOrder = new FinishOrder(true);
            userPlace.dispose();
        });

    }
}
