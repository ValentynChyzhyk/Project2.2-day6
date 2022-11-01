package day6;

public class Order {
   private double TotalPrice;
   private double weight;
   private double volume;
   private double itemCount;
   private double height;
   private double depth;
   private String address;
   private boolean DeliveryRequest;

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getItemCount() {
        return itemCount;
    }

    public void setItemCount(double itemCount) {
        this.itemCount = itemCount;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getAddress(String s) {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDeliveryRequest() {
        return DeliveryRequest;
    }

    public void setDeliveryRequest(boolean deliveryRequest) {
        DeliveryRequest = deliveryRequest;
    }
}
