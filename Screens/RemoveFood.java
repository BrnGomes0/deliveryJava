package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Input;
import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;

public class RemoveFood {
    // Creating a constructor
    public RemoveFood(boolean visibility){
        Window removeFood = new Window("Add To Cart");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//delivery//deliveryJava//img//frame_removefood.png"));
        Input inputId = new Input(112, 157, 275, 38);
        Button btnRemoveFood = new Button("Remove", 170, 255, 159, 41);
        removeFood.add(btnRemoveFood);
        removeFood.add(inputId);
        removeFood.add(image);
        removeFood.setVisible(visibility);
    }
}
