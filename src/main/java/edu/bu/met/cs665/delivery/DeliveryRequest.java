/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: DeliveryRequest.java
 * Description: In the DeliveryRequest class the products and destination are initialised.
 */

package edu.bu.met.cs665.delivery;

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
