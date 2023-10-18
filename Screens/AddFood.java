package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Input;
import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;

public class AddFood {
    // Creating a constructor
    public AddFood(boolean visibility){
        Window addFood = new Window("Add To Cart");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//ct67ca//Desktop//javaProject//deliveryJava//img//frame_addtocart.png"));
        Input name = new Input(112, 157, 275, 38);
        Input price = new Input(112, 221, 275,38);
        Button btnAddFood = new Button("Add to Cart", 170,321, 159, 41);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        addFood.add(btnBack);
        addFood.add(name);
        addFood.add(price);
        addFood.add(btnAddFood);
        addFood.add(image);
        addFood.setVisible(visibility);
    }
}
