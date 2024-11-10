package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAdapter {

    public TestAdapter() {
    }

    @Test
    public void testGetCustomer() {
        NewSystem newSystem = new NewSystem();
        Adapter adapter = new Adapter(newSystem);
        assertEquals(null, adapter.getCustomerViaUsb(1));

    }


}
