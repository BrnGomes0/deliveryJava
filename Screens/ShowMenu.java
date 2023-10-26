package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Label;
import ComponentsSwing.Window;
import entities.Aplicativo;
import entities.Lanche;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ShowMenu {
    // Creating colors
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    // Creating a constructor
    public ShowMenu(Boolean visibility){
        Window showMenu = new Window("Show Menu");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//javaDelivery//deliveryJava//img//frame_screenshowmenu.png"));
        Button btnShowMenu = new Button("Show Menu", 133, 213, 233, 53);
        Button btnBack = new Button("<", 400, 16, 56, 56);

        // Put event in button
        btnShowMenu.addActionListener(e -> {
            ArrayList<Lanche> lanche = Aplicativo.getListLanches();
            // Creating a Menu in TERMINAL
            System.out.println("\n");
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
            showMenu.dispose();
        });

        showMenu.add(btnBack);
        showMenu.add(btnShowMenu);
        showMenu.add(image);
        showMenu.setVisible(visibility);
    }
}