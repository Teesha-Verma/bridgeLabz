package bridgeLabz.inheritance;
class Order {
    int orderId; String orderDate;
    Order(int id,String d){ orderId=id; orderDate=d; }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int id,String d,String tn){ super(id,d); trackingNumber=tn; }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int id,String d,String tn,String dd){
        super(id,d,tn); deliveryDate=dd;
    }
    String getOrderStatus(){
        return "Delivered on "+deliveryDate;
    }
}

public class OrderDemo {
    public static void main(String[] args){
        DeliveredOrder o = new DeliveredOrder(101,"2025-09-22","TRK123","2025-09-25");
        System.out.println(o.getOrderStatus());
    }
}
