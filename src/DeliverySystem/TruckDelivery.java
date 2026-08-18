package DeliverySystem;

public class TruckDelivery implements DeliveryMethod {
    private Shipment shipment;
    double distance;
    double baseFee =5;
    double priceperKm=5;
    double totalPrice;

    public TruckDelivery(Shipment shipment, double distance) {
        this.shipment = shipment;
        this.distance = distance;
    }


    @Override
    public void deliver() {
        System.out.println("Sending a Truck Deliver to "+shipment.getClientname()+"\n" +
                "Address: "+shipment.getClientaddress()+"\n" +
                "Shiping: "+shipment.getItem());

    }
    @Override
    public double calculatePrice() {
        totalPrice = baseFee + distance*priceperKm;

        System.out.println("Shipping cost: "+totalPrice);
        return totalPrice;

    }
}
