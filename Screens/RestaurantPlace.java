package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;

public class RestaurantPlace {
    // Creating a constructor
    public RestaurantPlace(boolean visibility){
        Window restaurantPlace = new Window("Restaurant Place");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//javaDelivery//deliveryJava//img//frame_restaurantplace.png"));
        Button btnAddFood = new Button("Add food", 133, 137, 233, 53);
        Button btnShowMenu = new Button("Show Menu", 133, 229, 233, 53);
        Button btnRemoveFood = new Button("Remove Food", 133, 321, 233, 53);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        restaurantPlace.add(btnBack);
        restaurantPlace.add(btnAddFood);
        restaurantPlace.add(btnShowMenu);
        restaurantPlace.add(btnRemoveFood);
        restaurantPlace.add(image);
        restaurantPlace.setVisible(visibility);

        btnAddFood.addActionListener(e -> {
            AddFood addFood = new AddFood(true);
            restaurantPlace.dispose();
        });
        btnRemoveFood.addActionListener(e -> {
            RemoveFood removeFood = new RemoveFood(true);
            restaurantPlace.dispose();
        });
        btnShowMenu.addActionListener(e -> {
            ShowMenu showMenu = new ShowMenu(true);
            restaurantPlace.dispose();
        });
        btnBack.addActionListener(e -> {
            HomeScreen homeScreen = new HomeScreen(true);
            restaurantPlace.dispose();
        });
    }
}
