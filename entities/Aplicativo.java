package entities;

import java.util.ArrayList;

public class Aplicativo {
    // Necessary attributes
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Restaurante> restaurantes = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    // Creating a GET and SET
    public ArrayList<Usuario> getListUser(){
        return usuarios;
    }
    public ArrayList<Restaurante> getListRest(){
        return restaurantes;
    }
    public ArrayList<Pedido> getListPedido(){
        return pedidos;
    }

    // Necessary Methods
    public void cadastrarRestaurante(){

    }

    public void cadastrarUsuario(){

    }

}
