package entities;

public class Lanche {
    // Attributes
    private String name;
    private double price;

    // Creating a GET and SET
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
}