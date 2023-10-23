package Screens;

import ComponentsSwing.Label;
import ComponentsSwing.Window;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ShowMenu {
    // Creating a constructor
    public ShowMenu(Boolean visibility){
        Window showMenu = new Window("Show Menu");

        String [] columns = {"Id", "Name food", "Price $"};

        Object [][] data = {
                {"1", "BRUNO", "INFINITY"},
                {"1", "BRUNO", "INFINITY"},
                {"1", "BRUNO", "INFINITY"},
                {"1", "BRUNO", "INFINITY"},
        };

        JTable table = new JTable(data, columns);
        JScrollPane jScrollPane = new JScrollPane(table);
        showMenu.getContentPane().add(jScrollPane);
        showMenu.setVisible(visibility);
    }
}
