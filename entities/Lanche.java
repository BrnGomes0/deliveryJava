package entities;

public class Lanche {
    // Attributes
    private String name;
    private double price;

    // Creating a constructor
    public Lanche(String nameParameter, double priceParameter){
        this.name = nameParameter;
        this.price = priceParameter;
    }

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
