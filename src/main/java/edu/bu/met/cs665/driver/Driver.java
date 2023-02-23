/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Driver.java
 * Description: The Driver class initialises the Driver name and vehicle type. It also has
 * the update method for what is to be outputted.
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.delivery.DeliveryRequest;
import edu.bu.met.cs665.vehicle.Vehicles;

public class Driver implements Observer {
  private String name;
  private Vehicles vehicle;
  
  public Driver(String name, Vehicles vehicle) {
    this.name = name;
    this.vehicle = vehicle;
  }
  
  /**
   * An update method to notify what,where and who is going to deliver the products.
   *
   * @param deliveryRequest delivery request
   */
  public void update(DeliveryRequest deliveryRequest) {
    System.out.println("Driver " + name + " has received a notification to deliver "
        + deliveryRequest.getProducts() + " to " + deliveryRequest.getDestination()
        + " using a " + vehicle.getType());
  }
}
