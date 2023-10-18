package Screens;

import ComponentsSwing.*;
import entities.Usuario;

import javax.swing.*;

public class ScreenRegisterRestaurant {
    // Creating a constructor
    public ScreenRegisterRestaurant(Boolean visibility){
        Window screenRegisterRestaurant = new Window("Screen Register Restaurant");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//javaApp//deliveryJava//img//frame_registerrestaurant.png"));
        Input inputName = new Input(116, 111, 275, 38);
        Input inputCPF = new Input(116, 166, 275, 38);
        Password inputPassword = new Password(116, 222, 275, 38);
        Input inputAxleX = new Input(132, 292, 81, 38);
        Input inputAxleY = new Input(273, 292, 81, 38);
        Button btnRegister = new Button("Register", 170, 362, 159, 41);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        screenRegisterRestaurant.add(btnBack);
        screenRegisterRestaurant.add(btnRegister);
        screenRegisterRestaurant.add(inputAxleX);
        screenRegisterRestaurant.add(inputAxleY);
        screenRegisterRestaurant.add(inputCPF);
        screenRegisterRestaurant.add(inputPassword);
        screenRegisterRestaurant.add(inputName);
        screenRegisterRestaurant.add(image);
        screenRegisterRestaurant.setVisible(visibility);

        // Creating a events in button
        btnBack.addActionListener(e -> {
            screenRegisterRestaurant.dispose();
            HomeScreen homeScreen = new HomeScreen(true);
        });
        btnRegister.addActionListener(e -> {
            Usuario userRestaurant = new Usuario(
                    inputName.getText(),
                    Integer.parseInt(inputAxleX.getText()),
                    Integer.parseInt(inputAxleY.getText()),
                    Double.parseDouble(inputCPF.getText()),
                    String.valueOf(inputPassword.getPassword())
            );
            System.out.println(userRestaurant.getCpf());
            System.out.println(userRestaurant.getName());
            System.out.println(userRestaurant.getY());
            System.out.println(userRestaurant.getX());
            System.out.println(userRestaurant.getPassword());
            Alert alertRegistred = new Alert("Successfully registered!", "Alert");
            HomeScreen homeScreen = new HomeScreen(true);
            screenRegisterRestaurant.dispose();
        });
    }
}
