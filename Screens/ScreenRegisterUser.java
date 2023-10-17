package Screens;

import ComponentsSwing.*;

import javax.swing.*;

public class ScreenRegisterUser {
    // Creating a constructor
    public ScreenRegisterUser(Boolean visibility){
        Window screenRegisterUser = new Window("Screen Login");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//dsadm//Desktop//Java//deliveryJava//img//frame_registeruser.png"));
        Input inputName = new Input(116, 111, 275, 38);
        Input inputCPF = new Input(116, 166, 275, 38);
        Input inputPassWord = new Input(116, 222, 275, 38);
        Input inputAxleX = new Input(132, 292, 81, 38);
        Input inputAxleY = new Input(273, 292, 81, 38);
        Button btnRegister = new Button("Register", 170, 362, 159, 41);
        screenRegisterUser.add(btnRegister);
        screenRegisterUser.add(inputAxleX);
        screenRegisterUser.add(inputAxleY);
        screenRegisterUser.add(inputCPF);
        screenRegisterUser.add(inputPassWord);
        screenRegisterUser.add(inputName);
        screenRegisterUser.add(image);
        screenRegisterUser.setVisible(visibility);
    }
}
