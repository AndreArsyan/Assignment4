/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: Main.java
 * Description: Main class as application entry point
 */
package edu.bu.met.cs665;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run the app.
   */
  public static void main(String[] args) {
    // Get data from old system
    OldSystem oldSystem = new OldSystem();
    oldSystem.getCustomerViaUsb(1);
    oldSystem.printCustomer(1);

    // Create new system as adaptee
    NewSystem newSystem = new NewSystem();

    // Create adapter
    Adapter adapter = new Adapter(newSystem);

    // Get data from new system with the adapter
    // Notice that it still fetch from USB, although it takes the object from HTTPS
    adapter.getCustomerViaUsb(1);
    adapter.printCustomer(1);
  }

}
