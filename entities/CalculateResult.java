package entities;

import java.util.ArrayList;

public class CalculateResult {
    // Attributes
    ArrayList<Lanche> lanche = Aplicativo.getListLanches();
    private int numberID;
    private int quantity;
    private int priceProduct;
    private double result;
    // Creating a constructor
    public CalculateResult(int numberIDParameter, int quantityParameter){
        this.numberID = numberIDParameter;
        this.quantity = quantityParameter;
    }
    // Creating a method for value result
    public void value(){
        result = quantity * priceProduct;
        System.out.printf("VALUE RESULT: $%.2f", result);
    }
}
