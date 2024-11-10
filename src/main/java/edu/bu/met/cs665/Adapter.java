/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: Adapter.java
 * Description: This class is responsible for the methods and attributes of an Adapter.
 */
package edu.bu.met.cs665;

/**
 * This is the Adapter class.
 * This class is responsible for representing an Adapter.
 */
public class Adapter implements CustomerDataViaUsb{
    private final NewSystem instance;

    /**
     * Constructor method
     *
     * @param instance New system object
     */
    public Adapter(final NewSystem instance) {
        this.instance = instance;
    }

    /**
     * Print customer object detail
     *
     * @param customerId Customer ID number
     */
    @Override
    public void printCustomer(int customerId){
        instance.printCustomer(customerId);
    }

    /**
     * Get customer data from HTTPS in the new instance
     *
     * @param customerId Customer ID number
     */
    @Override
    public Customer getCustomerViaUsb(int customerId){
        return instance.getCustomerViaHttps(customerId);
    }

}