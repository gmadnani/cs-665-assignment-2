package edu.bu.met.cs665;

public class DeliveryRequest {
  private String products;
  private String destination;
  
  public DeliveryRequest(String products, String destination) {
    this.products = products;
    this.destination = destination;
  }
  
  public String getProducts() {
    return products;
  }
  
  public String getDestination() {
    return destination;
  }
  
}
