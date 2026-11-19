// import Inheritance.UpiPayment;
// import Inheritance.Payment;
import encapsulation.Orders;
import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;
import polymorphism.UpiPayment;
import polymorphism.CardPayment;
import polymorphism.Payment;

public class Main {
    public static void main(String[] args) {
        // Calc c1= new Calc();
        // AdvCalc a1 = new AdvCalc();
        // MyTool m1 = new MyTool();

        // ? Encapsulation
        Orders o1 = new Orders();
        o1.addItem("Pasta");
        o1.addItem("Dosa");
        // o1.getItems().add("Punit"); // It should not be done, fix it using Collections.unmodifiableList
        // System.out.println(o1.getItems());

        // ? Inheritance  
        // UpiPayment up = new UpiPayment(101);
        // UpiPayment up2 = new UpiPayment(200);
        // System.out.println(up.getReciept());
        // System.out.println(up2.getReciept());

        // ? method overriding
        // up.getMessage();

        // ? abstract class
        // Payment p = new Payment(1800);
        // up.pay();

        // ? Interface
        // up.refund();

        // up.getDiscount();
        // System.out.println(UpiPayment.Discount);

        // UpiPayment.isFundable = false;

        // ? Polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // a1.sound();
        // a2.sound(); // The reference type is Animal, and the call is sound() every time, but the output depends on the actual object.

        // * Peak Polymorphism
        // Payment[] methods = new Payment[]{new UpiPayment(1000), new CardPayment(2000) };

        // for(Payment p : methods){
        //     p.pay();
        // }

        

    }
}
