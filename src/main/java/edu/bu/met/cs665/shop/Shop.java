/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Shop.java
 * Description: The Shop class contains the ArrayList observers and deliveryRequests
 * which is to be used for adding, removing and notifying observers and also create
 * the delivery requests.
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.delivery.DeliveryRequest;
import edu.bu.met.cs665.driver.Observer;

import java.util.ArrayList;

public class Shop implements SubjectShop {
  private ArrayList<Observer> observers;
  private ArrayList<DeliveryRequest> deliveryRequests;
  
  public Shop() {
    observers = new ArrayList<>();
    deliveryRequests = new ArrayList<>();
  }
  
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }
  
  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
  
  @Override
  public void notifyObservers(DeliveryRequest deliveryRequest) {
    for (Observer observer : observers) {
      observer.update(deliveryRequest);
    }
  }
  
  /**
   * A method to create a delivery request and notify the observers.
   *
   * @param products    products
   * @param destination destination
   */
  public void createRequest(String products, String destination) {
    DeliveryRequest deliveryRequest = new DeliveryRequest(products, destination);
    deliveryRequests.add(deliveryRequest);
    notifyObservers(deliveryRequest);
  }
}

