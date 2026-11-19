package polymorphism;

public class CardPayment extends Payment {
    public CardPayment(double amount){
        super(amount);
    }

    @Override
    public void pay(){
        System.out.println("Card Payment");
    }
}
