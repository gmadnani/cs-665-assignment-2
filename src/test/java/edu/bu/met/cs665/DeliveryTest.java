package edu.bu.met.cs665;

import edu.bu.met.cs665.delivery.DeliveryRequest;
import edu.bu.met.cs665.shop.Shop;
import edu.bu.met.cs665.vehicle.Scooter;
import edu.bu.met.cs665.vehicle.Taxi;
import edu.bu.met.cs665.vehicle.Van;
import edu.bu.met.cs665.vehicle.Vehicles;
import org.junit.Assert;
import org.junit.Test;

public class DeliveryTest {
  
  @Test
  public void deliveryRequestProduct() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("new product", "address");
    Assert.assertEquals(deliveryRequest.getProducts(), "new product");
  }
  
  @Test
  public void deliveryRequestAddress() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("new product", "address");
    Assert.assertEquals(deliveryRequest.getDestination(), "address");
  }
  
  @Test
  public void getVanVehicleType() {
    Vehicles vehicles = new Van();
    Assert.assertEquals(vehicles.getType(), "van");
  }
  
  @Test
  public void getTaxiVehicleType() {
    Vehicles vehicles = new Taxi();
    Assert.assertEquals(vehicles.getType(), "taxi");
  }
  
  @Test
  public void getScooterVehicleType() {
    Vehicles vehicles = new Scooter();
    Assert.assertEquals(vehicles.getType(), "scooter");
  }
  
  @Test
  public void createDeliveryRequest() {
    Shop shop = new Shop();
    Assert.assertNotNull(shop.createRequest("new product", "address"));
  }
  
}
