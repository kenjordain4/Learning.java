package DeliverySystem;

public class DeliveryService {
    private DeliveryMethod Delivery;

    public DeliveryService(DeliveryMethod Delivery) {
        this.Delivery = Delivery;
    }
    public void SendDelivery() {
        Delivery.deliver();
        Delivery.calculatePrice();
        System.out.println("-------------------------------");
    }
}

