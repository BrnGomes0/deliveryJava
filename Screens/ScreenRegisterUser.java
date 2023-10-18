package Screens;

import ComponentsSwing.*;
import javax.swing.*;
import entities.*;

import java.util.ArrayList;

public class ScreenRegisterUser {
    private Usuario userUser;
    // Creating a constructor
    public ScreenRegisterUser(Boolean visibility){
        Window screenRegisterUser = new Window("Screen Register User");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//ct67ca//Desktop//javaProject//deliveryJava//img//frame_registeruser.png"));
        Input inputName = new Input(116, 111, 275, 38);
        Input inputCPF = new Input(116, 166, 275, 38);
        Password inputPassword = new Password(116, 222, 275, 38);
        Input inputAxleX = new Input(132, 292, 81, 38);
        Input inputAxleY = new Input(273, 292, 81, 38);
        Button btnRegister = new Button("Register", 170, 362, 159, 41);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        screenRegisterUser.add(btnBack);
        screenRegisterUser.add(btnRegister);
        screenRegisterUser.add(inputAxleX);
        screenRegisterUser.add(inputAxleY);
        screenRegisterUser.add(inputCPF);
        screenRegisterUser.add(inputPassword);
        screenRegisterUser.add(inputName);
        screenRegisterUser.add(image);
        screenRegisterUser.setVisible(visibility);

        // Creating a events in Buttons
        btnBack.addActionListener(e -> {
            screenRegisterUser.dispose();
            HomeScreen homeScreen = new HomeScreen(true);
        });
        btnRegister.addActionListener(e -> {
            if(inputName.getText().isEmpty() || inputCPF.getText().isEmpty() || inputAxleX.getText().isEmpty() || inputAxleY.getText().isEmpty() || String.valueOf(inputPassword.getPassword()).isEmpty()){
                JOptionPane.showMessageDialog(null, "Insert the values in Input", "Alert", JOptionPane.ERROR_MESSAGE);
            }else{
                userUser = new Usuario(
                        inputName.getText(),
                        Integer.parseInt(inputAxleX.getText()),
                        Integer.parseInt(inputAxleY.getText()),
                        Double.parseDouble(inputCPF.getText()),
                        String.valueOf(inputPassword.getPassword())
                );
                ArrayList<Usuario> usuarios = Aplicativo.getListUser();
                usuarios.add(userUser);
                JOptionPane.showMessageDialog(null, "Successfully registered", "Alert", JOptionPane.INFORMATION_MESSAGE);
                HomeScreen homeScreen = new HomeScreen(true);
                screenRegisterUser.dispose();
            }
        });

    }
}