package entities;

import java.util.ArrayList;

public class Aplicativo {
    // Necessary attributes
    private  static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Restaurante> restaurantes = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    private static ArrayList<Lanche> lanches = new ArrayList<>();

    // Creating a GET and SET
    public static ArrayList<Usuario> getListUser(){
        return usuarios;
    }
    public static ArrayList<Restaurante> getListRest(){
        return restaurantes;
    }
    public static ArrayList<Pedido> getListPedido() {
        return pedidos;
    }
    public static ArrayList<Lanche> getListLanches(){
        return lanches;
    }
    // Necessary Methods
    public void registerRestaurant(){
        System.out.println("Restaurant registred!");
    }
    public void registerUser(){
        System.out.println("User registred!");
    }
}
