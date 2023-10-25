package entities;

public class CalculateResult {
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    // Attributes
    private double result;
    private int quantity;
    // Creating a constructor
    public CalculateResult(double price, int quantity){
        this.quantity = quantity;
        this.result = price * quantity;
    }
    public CalculateResult(){

    }
    // Method finishOrder
    public void printOrder(String name, String foodChoosed , double cpf){
        System.out.println(ANSI_BLUE + "**************ORDER********************* + ANSI_RESET");
        System.out.println("NAME CLIENT: " + ANSI_BLUE + name + ANSI_RESET);
        System.out.println("CPF CLIENT: " + ANSI_BLUE + cpf + ANSI_RESET);
        System.out.println("FOOD: " + ANSI_BLUE + foodChoosed + ANSI_RESET);
        System.out.println("QUANTITY: " + ANSI_BLUE + this.quantity + ANSI_RESET);
        System.out.println("PRICE:                  $"+ ANSI_YELLOW + this.result + ANSI_RESET);
        System.out.println(ANSI_BLUE + "*****************************************" + ANSI_RESET);

    }
    // Creating GET and SET[
    public double getResult(){
        return result;
    }
    public int getQuantity(){
        return quantity;
    }
}
