import enums.OrderStatus;

public class Main{
    public static void main(String[] args){
        // MenuItem m1 = new MenuItem("Dosa", 120, true);
        // System.out.println(m1);

        // MenuItem2 m2 = new MenuItem2();
        // m2.name = "Dosa";
        // MenuItem2 m3 = m2;
        // m3.name = "Idli";
        // System.out.println(m2.name);

        // MenuItem2 vada = new MenuItem2("Vadapav");
        // MenuItem2 idli = new MenuItem2("Idli", 20.0);
        // MenuItem2 biryani = new MenuItem2("Biryani", 100);
        // System.out.println(vada);
        // System.out.println(idli);
        // System.out.println(biryani);

        // vada.isExpensive = true;

        // NonVegItem n = new NonVegItem(true);

        Orders o1 = new Orders(1);
        // Orders o2 = new Orders();
        // System.out.println(Orders.orderCount);
        // Orders o3 = new Orders();

        System.out.println(o1.status);
        o1.status = OrderStatus.DELIVERED;
        System.out.println(o1.status);
    }
}  
