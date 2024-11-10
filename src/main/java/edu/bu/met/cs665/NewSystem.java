/**
 * Name: Andre Arsyan Jordie
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: NewSystem.java
 * Description: This class is responsible for the methods and attributes of a New System.
 */
package edu.bu.met.cs665;

/**
 * This is the New System class.
 * This class is responsible for representing a New System.
 */
public class NewSystem implements CustomerDataViaHttps{
    /**
     * Print customer object detail
     *
     * @param customerId Customer ID number
     */
    @Override
    public void printCustomer(int customerId){
        System.out.println("[New System] Customer Object " + customerId);
    }

    /**
     * Get customer data from HTTPS
     *
     * @param customerId Customer ID number
     */
    @Override
    public Customer getCustomerViaHttps(int customerId){
        System.out.println("[New System] Customer fetched via HTTPS");
        return null;
    }
}
