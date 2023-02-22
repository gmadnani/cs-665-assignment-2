/**
 * Name: Girish Madnani
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Main.java
 * Description:
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.driver.Driver;
import edu.bu.met.cs665.shop.Shop;
import edu.bu.met.cs665.vehicle.Scooter;
import edu.bu.met.cs665.vehicle.Taxi;
import edu.bu.met.cs665.vehicle.Van;

public class Main {
  
  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    
    Shop shop = new Shop();
    
    Driver driver1 = new Driver("1", new Van());
    shop.registerObserver(driver1);
    Driver driver2 = new Driver("2", new Taxi());
    shop.registerObserver(driver2);
    Driver driver3 = new Driver("3", new Scooter());
    shop.registerObserver(driver3);
    
    shop.createRequest("Books", "ABC");
    
  }
}
