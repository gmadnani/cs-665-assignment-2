package edu.bu.met.cs665;

public interface SubjectShop {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(DeliveryRequest deliveryRequest);
}
