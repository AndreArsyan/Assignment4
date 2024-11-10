package edu.bu.met.cs665;

/**
 * Legacy System
 */
public interface CustomerDataViaUsb {
  void printCustomer(int customerId);

  Customer getCustomerViaUsb(int customerId);
}
