package Screens;

import ComponentsSwing.Input;
import ComponentsSwing.Label;
import ComponentsSwing.Password;
import ComponentsSwing.Window;

public class ScreenLogin {
    // Creating a constructor
    public ScreenLogin(){
        Window screenLogin = new Window("Screen Login");
        Label titlePage = new Label("Login for access", 90, 20, 200, 100, 0, 0, 0);
        Label textUsername = new Label("Username: ", 90, 150, 100, 100, 0, 0, 0);
        Input inputUsername = new Input("username", 90, 270, 100, 20);
        Label textPassword = new Label("Password", 90, 390, 100, 100, 0, 0, 0);
        Password inputPassword = new Password(90, 190, 100, 20);
        screenLogin.add(titlePage);
        screenLogin.add(textUsername);
        screenLogin.add(inputUsername);
        screenLogin.add(textPassword);
        screenLogin.add(inputPassword);

    }

}
