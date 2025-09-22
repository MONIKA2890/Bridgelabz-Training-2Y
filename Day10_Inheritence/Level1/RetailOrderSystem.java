
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}


class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return super.getOrderStatus() + " | Shipped with Tracking Number: " + trackingNumber;
    }
}


class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return super.getOrderStatus() + " | Delivered on " + deliveryDate;
    }
}

// Main class
public class RetailOrderSystem {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, "2025-09-20", "TRK12345", "2025-09-22");
        System.out.println(order.getOrderStatus());
    }
}

