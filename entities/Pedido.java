package entities;

import java.util.ArrayList;
import entities.Aplicativo;

public class Pedido {
    // Necessary Attributes
    ArrayList<Usuario> usuarios =  Aplicativo.getListUser();
    ArrayList<Restaurante> restaurantes = Aplicativo.getListRest();

    // Necessary Methods
    public void doOrder(){
        System.out.println("DOING ORDER!");
    }
    public void printOrder(){
        System.out.println("PRINTING ORDER!");
    }
}
