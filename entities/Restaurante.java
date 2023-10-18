package entities;

public class Restaurante {
    // Necessary attributes
    private String name;
    private int x;
    private int y;
    private double cnpj;

    private String password;

    // Creating a constructor
    public Restaurante(String name, int x, int y, double cnpj, String password){
        this.name = name;
        this.x = x;
        this.y = y;
        this.cnpj = cnpj;
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
    public double getCnpj(){
        return cnpj;
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
    public void setCnpj(double cnpj){
        this.cnpj = cnpj;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
