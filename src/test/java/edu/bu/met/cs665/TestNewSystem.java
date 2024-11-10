package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestNewSystem {

    public TestNewSystem() {
    }

    @Test
    public void testGetCustomer() {
    NewSystem newSystem = new NewSystem();
    assertEquals(null, newSystem.getCustomerViaHttps(1));

    }


}
