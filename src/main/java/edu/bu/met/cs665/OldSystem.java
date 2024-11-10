/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: OldSystem.java
 * Description: This class is responsible for the methods and attributes of an Old System.
 */
package edu.bu.met.cs665;

/**
 * This is the Old System class.
 * This class is responsible for representing an Old System.
 */
public class OldSystem implements CustomerDataViaUsb{
    /**
     * Print customer object detail
     *
     * @param customerId Customer ID number
     */
    @Override
    public void printCustomer(int customerId){
        System.out.println("[Old System] Customer Object " + customerId);
    }

    /**
     * Get customer data from USB
     *
     * @param customerId Customer ID number
     */
    @Override
    public Customer getCustomerViaUsb(int customerId){
        System.out.println("[Old System] Customer fetched VIA USB");
        return null;
    }
}
