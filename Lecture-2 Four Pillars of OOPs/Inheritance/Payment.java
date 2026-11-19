package Inheritance;

abstract public class Payment {
    protected double amount = 0;

    public Payment(double amount){
        this.amount = amount;
    }

    public String getReciept(){
        return "Amount - " + this.amount + " Paid";
    } 

    public void getMessage(){
        System.out.println("Payment successfull");
    } 

    abstract void pay();
}
