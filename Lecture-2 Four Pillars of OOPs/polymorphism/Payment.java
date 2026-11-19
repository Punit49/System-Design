package polymorphism;

abstract public class Payment {
    protected double amount = 0;

    public Payment(double amount){
        this.amount = amount;
    }

    abstract public void pay();
}
