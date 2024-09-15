using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        // Create a rider and set up their preferred payment method (CreditCard)
        Rider rider1 = new Rider()
        {
            Id = 1,
            Name = "John Doe",
            Location = "Downtown",
            PreferredPaymentMethod = new CreditCardPayment("1234-5678-9876-5432", "John Doe", DateTime.Now.AddYears(2), "123")
        };

        // Create a driver
        Driver driver1 = new Driver()
        {
            Id = 1,
            Name = "Jane Smith",
            VehicleType = "Luxury Car",
            Location = "Downtown",
            Availability = true
        };

        // Admin creates an instance to manage users
        Admin admin = new Admin("Admin1", "Manager");

        // Admin manages driver
        admin.ManageDriver(driver1, true); // Activate the driver

        // Rider requests a trip
        Trip trip1 = rider1.RequestRide("Downtown", "Airport", "Luxury Ride", driver1);

        // Driver accepts the trip
        driver1.AcceptRide(trip1);

        // Trip is started by driver
        driver1.StartTrip(trip1);

        // Simulate trip completion
        trip1.CompleteTrip();

        // Process payment after trip completion
        trip1.ProcessPayment();

        // Rider rates the driver
        rider1.RateDriver(driver1, 5);

        // Driver rates the rider
        driver1.RateRider(rider1, 4);

        // Admin views trip history
        List<Trip> tripHistory = new List<Trip> { trip1 };
        admin.ViewTripHistory(tripHistory, rider1);

        // Admin handles dispute
        admin.HandleDispute(trip1, "No dispute");

        // Rider updates contact info
        rider1.UpdateContactInfo("johndoe@email.com", "123-456-7890");

        // Example with PayPal Payment Method
        rider1.PreferredPaymentMethod = new PayPalPayment("johndoe@paypal.com");
        Trip trip2 = rider1.RequestRide("Airport", "Hotel", "Bike Ride", driver1);
        trip2.CompleteTrip();
        trip2.ProcessPayment(); // Pay with PayPal

        // Example with Digital Wallet Payment Method
        rider1.PreferredPaymentMethod = new DigitalWalletPayment("WALLET12345", 500);
        Trip trip3 = rider1.RequestRide("Hotel", "Conference Center", "Carpool", driver1);
        trip3.CompleteTrip();
        trip3.ProcessPayment(); // Pay with Digital Wallet

        Console.WriteLine("Simulation completed.
