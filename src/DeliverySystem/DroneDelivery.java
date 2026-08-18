package DeliverySystem;

public class DroneDelivery implements DeliveryMethod {
    private Shipment shipment;
    double distance;
    double baseFee=7;
    double priceperKm=3;
    double bonus=30;
    double totalPrice;

    public DroneDelivery(Shipment shipment,double distance) {
        this.shipment = shipment;
        this.distance = distance;
    }

    @Override
    public void deliver() {
        System.out.println("Sending a Drone Deliver to "+shipment.getClientname()+"\n" +
                "Address: "+shipment.getClientaddress()+"\n" +
                "Shiping: "+shipment.getItem());



    }
    @Override
    public double calculatePrice() {
        totalPrice=(distance*priceperKm)+bonus+baseFee;
        System.out.println("Shipping cost: "+totalPrice);
        return totalPrice;
    }
}
