package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestOldSystem {

    public TestOldSystem() {
    }

    @Test
    public void testGetCustomer() {
        OldSystem oldSystem = new OldSystem();
        assertEquals(null, oldSystem.getCustomerViaUsb(1));

    }


}
