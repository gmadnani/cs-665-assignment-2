package edu.bu.met.cs665;

public class Driver implements Observer {
    private String name;
    private Vehicles vehicle;

    public Driver(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void update(DeliveryRequest deliveryRequest) {
        System.out.println("Driver " + name + " is delivering your products " + deliveryRequest.getProducts() +
                " to " + deliveryRequest.getDestination() + " using a " + vehicle.getType());
    }
}
