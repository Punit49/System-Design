package Inheritance;

public class UpiPayment extends Payment implements Refundable, Discount {
    private String UpiId;

    public UpiPayment(double amount){
        super(amount);
        // super.getMessage();
        // super.amount = 999;
    }

    public void pay(){
        System.out.println("Paid using UPI");
    }

    @Override
    public void getMessage(){
        System.out.println("UPI Payment successfull");
    } 

    public void refund(){
        System.out.println("Refunded by UPI");
    }

    public void getDiscount(){
        System.out.println("Discount is " + Discount);
    }
}
