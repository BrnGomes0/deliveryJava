package Screens;

import ComponentsSwing.Button;
import ComponentsSwing.Label;
import ComponentsSwing.Window;
import entities.Aplicativo;
import entities.CalculateResult;
import entities.Lanche;
import entities.Usuario;

import javax.swing.*;
import java.util.ArrayList;

public class FinishOrder {
    // Creating a constructor
    public FinishOrder(boolean visibility){
        Window screenFinishOrder = new Window("Finish Order");
        Label image = new Label(0,0,500, 480);
        image.setIcon(new ImageIcon("C://Users//ct67ca//Desktop//javaDelivert//deliveryJava//img//frame_finishorder.png"));
        Button btnFinishOrder = new Button("Finish Order", 133, 213, 233, 53);
        Button btnBack = new Button("<", 400, 16, 56, 56);
        screenFinishOrder.add(btnBack);
        screenFinishOrder.add(btnFinishOrder);
        screenFinishOrder.add(image);
        screenFinishOrder.setVisible(true);

        // Put event in buttons
        btnBack.addActionListener(e -> {
            UserPlace userPlace = new UserPlace(true);
            screenFinishOrder.dispose();
        });
        btnFinishOrder.addActionListener(e -> {
            ArrayList<Usuario> users = Aplicativo.getListUser();
            ArrayList<Lanche> lanches = Aplicativo.getListLanches();
            CalculateResult calculateResult = new CalculateResult();
            calculateResult.printOrder(users.get(0).getName(), lanches.get(0).getName(), users.get(0).getCpf());
        });

    }
}

