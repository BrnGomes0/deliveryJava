package entities;

public class CalculateResult {
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    private static final String ANSI_RED = "\u001B[31m";
    // Attributes
    private double result;
    private int quantity;
    private int idFood;
    // Creating a constructor
    public CalculateResult(double price, int quantity){
        this.quantity = quantity;
        this.result = quantity * price;
        System.out.println("TOTAL: $"+ getResult());
    }
    public CalculateResult(){

    }
    // Method finishOrder
    public void printOrder(String name, int cpf){
        System.out.println(ANSI_BLUE + "**************ORDER*********************" + ANSI_RESET);
        System.out.println("NAME CLIENT: " + ANSI_RED + name + ANSI_RESET);
        System.out.println("CPF CLIENT: " + ANSI_RED + cpf + ANSI_RESET);
        System.out.println("PRICE: $"+ ANSI_YELLOW + this.result + ANSI_RESET);
        System.out.println(ANSI_BLUE + "****************************************" + ANSI_RESET);
    }

    // Get the object
    public void returnObject(CalculateResult calculateResult){
        calculateResult.getResult();
    }

    // Creating GET and SET[

    public double getResult(){
        return result;
    }
    public int getQuantity(){
        return quantity;
    }
}
