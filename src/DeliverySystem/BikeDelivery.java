package DeliverySystem;

public class BikeDelivery implements DeliveryMethod {
    private Shipment shipment;
    double priceperKm=1;
    double baseFee=2;
    double distance;
    double totalPrice;
    public BikeDelivery(Shipment shipment,double distance) {
        this.shipment = shipment;
        this.distance = distance;
    }
    @Override
    public void deliver() {
        System.out.println("Sending a Bike Deliver to "+shipment.getClientname()+"\n" +
                "Address: "+shipment.getClientaddress()+"\n" +
                "Shiping: "+shipment.getItem());


    }
    @Override
    public double calculatePrice() {
        totalPrice=distance*priceperKm+baseFee;
        System.out.println("Shipping  cost: "+totalPrice);
        return totalPrice;
    }

}
