import enums.OrderStatus;

public final class Orders {
    static int orderCount = 0;
    final int orderId; 
    OrderStatus status = OrderStatus.PLACED; 

    Orders(int orderId){
        this.orderId = orderId;
        orderCount++;
    }

}
