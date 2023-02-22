package edu.bu.met.cs665;

public interface SubjectShop {
  public void registerObserver(Observer observer);
  
  public void removeObserver(Observer observer);
  
  public void notifyObservers(DeliveryRequest deliveryRequest);
}
