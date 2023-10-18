package Screens;

import ComponentsSwing.Alert;
import ComponentsSwing.Button;
import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;
import java.awt.*;

public class HomeScreen{
    // Creating a constructor
        public HomeScreen(Boolean visibility){
            Window homeScreen = new Window("Home Screen");
            Label image = new Label(0,0,500, 480);
            image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//javaApp//deliveryJava//img//frame_homeScreen.png"));
            Button btnRegisterUser = new Button("Register User", 133, 142, 233, 53);
            Button btnRegisterRestaurant = new Button("Register Restaurant", 133, 224, 233, 53);
            Button btnLogin = new Button("Login", 133, 306, 233, 53);
            homeScreen.add(btnLogin);
            homeScreen.add(btnRegisterUser);
            homeScreen.add(btnRegisterRestaurant);
            homeScreen.add(image);
            homeScreen.setVisible(visibility);

            btnRegisterUser.addActionListener(e -> {
                homeScreen.dispose();
                ScreenRegisterUser screenRegisterUser = new ScreenRegisterUser(true);
            });
            btnRegisterRestaurant.addActionListener(e -> {
                homeScreen.dispose();
                ScreenRegisterRestaurant screenRegisterRestaurant = new ScreenRegisterRestaurant(true);
            });
            btnLogin.addActionListener(e -> {
                homeScreen.dispose();
                ScreenLogin screenLogin = new ScreenLogin(true);
            });
        }
}
