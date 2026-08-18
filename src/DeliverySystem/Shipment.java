package DeliverySystem;

public class Shipment {
    private String Clientname;
    private String Clientaddress;
    private String item;
    public Shipment(String Clientname, String Clientaddress, String ClientShip) {
        this.Clientname = Clientname;
        this.Clientaddress = Clientaddress;
        this.item = ClientShip;
    }

    public String getClientname() {
        return Clientname;
    }

    public String getClientaddress() {
        return Clientaddress;
    }

    public String getItem() {
        return item;
    }
}
