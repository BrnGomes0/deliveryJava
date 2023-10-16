package Screens;

import ComponentsSwing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

//
public class ScreenLogin {
    private String username = "admBosch";
    private String password = "admBosch";

    public String getUsername(){
        return username;
    }
    public String getPassword (){
        return password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public ScreenLogin(){
        Window screenLogin = new Window("String Login");
        Label titlePage = new Label("Login in System!", 140, 1, 300, 100, 0, 0, 0);
        Label usernameLabel = new Label("Username: ", 40, 130, 120, 50, 0, 0, 0);
        Label passwordLabel = new Label("Password: ", 40, 200, 120, 50, 0, 0, 0);
        Input usernameInput = new Input(180, 130, 120, 30);
        Password passwordInput = new Password(180, 200, 120, 30);
        Button btnLogin = new Button("Login", 160,350 , 100, 30);
        screenLogin.add(passwordLabel);
        screenLogin.add(usernameLabel);
        screenLogin.add(titlePage);
        screenLogin.add(passwordInput);
        screenLogin.add(usernameInput);
        screenLogin.add(btnLogin);

        // Login Logic
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usernameInput.getText().equals("admBosch") && passwordInput.getText().equals("admBosch")){
                    ScreenRegisterRestaurant screenRegisterRestaurant = new ScreenRegisterRestaurant(true);
                }else{

                }
            }
        });
    }

}
