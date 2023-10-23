package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Input;
import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;

public class AddToCart {
    // Creating a constructor
    public AddToCart(boolean visibility){
        Window addToCart = new Window("Add To Cart");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//deliveryJava//deliveryJava//img//frame_addtocart.png"));
        Input foodId = new Input(112, 157, 275, 38);
        Input quantity = new Input(112, 221, 275,38);
        Button btnAddToCart = new Button("Add to Cart", 170,321, 159, 41);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        addToCart.add(btnBack);
        addToCart.add(foodId);
        addToCart.add(quantity);
        addToCart.add(btnAddToCart);
        addToCart.add(image);
        addToCart.setVisible(visibility);

        // Put the events in buttons
        btnBack.addActionListener(e -> {
            UserPlace userPlace = new UserPlace(true);
            addToCart.dispose();
        });
    }
}
