/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Observer.java
 * Description: It is an interface for the update method for the Drivers.
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.delivery.DeliveryRequest;

public interface Observer {
  public void update(DeliveryRequest deliveryRequest);
}
