package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Input;
import ComponentsSwing.Label;
import ComponentsSwing.Window;
import entities.Aplicativo;
import entities.Lanche;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class AddFood {
    // Creating a constructor
    public AddFood(boolean visibility){
        Window addFood = new Window("Add To Cart");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//ct67ca//Desktop//javaDelivert//deliveryJava//img//frame_addfood.png"));
        Input name = new Input(112, 157, 275, 38);
        Input price = new Input(112, 221, 275,38);
        Button btnAddFood = new Button("Add Food", 170,321, 159, 41);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        addFood.add(btnBack);
        addFood.add(name);
        addFood.add(price);
        addFood.add(btnAddFood);
        addFood.add(image);
        addFood.setVisible(visibility);

        // Put events in button
        btnBack.addActionListener(e -> {
            RestaurantPlace restaurantPlace = new RestaurantPlace(true);
            addFood.dispose();
        });
        btnAddFood.addActionListener(e -> {
            ArrayList<Lanche> lanche = Aplicativo.getListLanches();
            Lanche lancheOne = new Lanche(name.getText(), Double.parseDouble(price.getText()));
            lanche.add(lancheOne);
            System.out.println("Food added!" + " Name: " + lancheOne.getName() + " Price: " + lancheOne.getPrice());
        });
    }
}
