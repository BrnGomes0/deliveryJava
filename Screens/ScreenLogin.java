package Screens;

import ComponentsSwing.*;
import entities.Usuario;
import entities.Aplicativo;

import javax.swing.*;
import java.util.ArrayList;

public class ScreenLogin {
    // Creating a constructor
    public ScreenLogin(Boolean visibility){
        Window screenLogin = new Window("Screen Login");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//ct67ca//Desktop//javaProject//deliveryJava//img//frame_screenlogin.png"));
        Input inputName = new Input(116, 157, 275, 38);
        Password inputPassword = new Password(116, 224, 275, 38);
        Button btnLogin = new Button("Login", 174, 325, 159, 41);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        screenLogin.add(btnBack);
        screenLogin.add(btnLogin);
        screenLogin.add(inputName);
        screenLogin.add(inputPassword);
        screenLogin.add(image);
        screenLogin.setVisible(visibility);

        // Creating a event in button
        btnBack.addActionListener(e -> {
            screenLogin.dispose();
            HomeScreen homeScreen = new HomeScreen(true);
        });
        btnLogin.addActionListener(e -> {
            ArrayList<Usuario> usuarios = Aplicativo.getListUser();
            if(inputName.getText().isEmpty() || String.valueOf(inputPassword.getPassword()).isEmpty()){
                JOptionPane.showMessageDialog(null, "Insert the values in Input", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            else if (usuarios.get(0).getName().equals(inputName.getText()) && usuarios.get(0).getPassword().equals(String.valueOf(inputPassword.getPassword()))){
                JOptionPane.showMessageDialog(null, "Successful login", "Alert", JOptionPane.INFORMATION_MESSAGE);
                UserPlace userPlace = new UserPlace(true);
                screenLogin.dispose();
            }
        });
    }
}