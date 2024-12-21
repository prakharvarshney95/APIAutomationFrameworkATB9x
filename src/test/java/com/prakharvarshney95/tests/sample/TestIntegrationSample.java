package com.prakharvarshney95.tests.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    // Create A Booking, Create a Token
    // Verify that Get booking -
    // Update the Booking
    // Delete the Booking

    @Test (groups = "qa", priority = 1)
    @Owner("Prakhar")
    @Description ("TC#INT1 - Step 1. Verify that the Booking can be Created")
    public void testCreateBooking() {
        Assert.assertTrue(true);
    }

    @Test (groups = "qa", priority = 2)
    @Owner("Prakhar")
    @Description ("TC#INT1 - Step 2. Verify the Booking by ID")
    public void testVerifyBookingId() {
        Assert.assertTrue(true);
    }

    @Test (groups = "qa", priority = 3)
    @Owner("Prakhar")
    @Description ("TC#INT1 - Step 3. Verify Updated Booking by ID")
    public void testUpdateBookingById() {
        Assert.assertTrue(true);
    }

    @Test (groups = "qa", priority = 4)
    @Owner("Prakhar")
    @Description ("TC#INT1 - Step 4. Delete the Booking by ID")
    public void testDeleteBookingById() {
        Assert.assertTrue(true);
    }


}
