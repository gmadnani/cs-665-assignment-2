package edu.bu.met.cs665;

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

    public void createRequest(String products, String destination) {
        DeliveryRequest deliveryRequest = new DeliveryRequest(products, destination);
        deliveryRequests.add(deliveryRequest);
        notifyObservers(deliveryRequest);
    }
}

