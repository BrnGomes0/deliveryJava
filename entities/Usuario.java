package entities;

public class Usuario {
    // Necessary attributes
    private String name;
    private int x;
    private int y;
    private double cpf;

    private String password;

    // Creating a constructor
    public Usuario(String name, int x, int y, double cpf, String password){
        this.name = name;
        this.x = x;
        this.y = y;
        this.cpf = cpf;
        this.password = password;
    }

    // Creating a GET and SET
    public String getName(){
        return name;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getCpf(){
        return cpf;
    }
    public String getPassword(){
        return password;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setCpf(double cpf){
        this.cpf = cpf;
    }
    public void setPassword(String password){
        this.password = password;
    }
}