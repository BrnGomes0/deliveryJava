package entities;

import java.util.ArrayList;

public class Aplicativo {
    // Necessary attributes
    private  static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Restaurante> restaurantes = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    // Creating a GET and SET
    public static ArrayList<Usuario> getListUser(){
        return usuarios;
    }
    public static ArrayList<Restaurante> getListRest(){
        return restaurantes;
    }
    public static ArrayList<Pedido> getListPedido() {
        return pedidos;

        // Necessary Methods
    }
}
