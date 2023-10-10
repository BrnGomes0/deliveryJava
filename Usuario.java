public class Usuario {
    // Necessary attributes
    private String name;
    private String adress;
    private double cpf;

    // Creating a GET and SET
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
    public double getCpf(){
        return cpf;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public void setCpf(double cpf){
        this.cpf = cpf;
    }

}
