/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Main.java
 * Description: Write a description for this class
 */
package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.delivery.DeliveryRequest;
import edu.bu.met.cs665.driver.Observer;

public interface SubjectShop {
  public void registerObserver(Observer observer);
  
  public void removeObserver(Observer observer);
  
  public void notifyObservers(DeliveryRequest deliveryRequest);
}
