package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Input;
import ComponentsSwing.Label;
import ComponentsSwing.Window;
import entities.Aplicativo;
import entities.Lanche;

import javax.swing.*;
import java.util.ArrayList;

public class RemoveFood {
    // Creating colors
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    // Creating a constructor
    public RemoveFood(boolean visibility){
        Window removeFood = new Window("Remove Food");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//deliveryJava//deliveryJava//img//frame_removefood.png"));
        Input inputId = new Input(112, 157, 275, 38);
        Button btnRemoveFood = new Button("Remove", 170, 255, 159, 41);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        removeFood.add(btnBack);
        removeFood.add(btnRemoveFood);
        removeFood.add(inputId);
        removeFood.add(image);
        removeFood.setVisible(visibility);

        // Put events in button

        btnRemoveFood.addActionListener(e -> {
            ArrayList<Lanche> lanche = Aplicativo.getListLanches();
            int number = Integer.parseInt(String.valueOf(inputId.getText()));
            lanche.remove(number);
            System.out.println("***********" + "MENU" + "***********");
            for(Lanche c : lanche){
                System.out.println("--------------------");
                System.out.println( ANSI_YELLOW + "Name food: " + ANSI_RESET + c.getName());
                System.out.println(ANSI_YELLOW + "Price($): " + ANSI_RESET + c.getPrice());
            }
            System.out.println("**************************");
            System.out.println("\n");
        });
        btnBack.addActionListener(e -> {
            RestaurantPlace restaurantPlace = new RestaurantPlace(true);
            removeFood.dispose();
        });
    }
}
