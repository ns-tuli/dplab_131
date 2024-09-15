public class Admin : User
{
    public string Role { get; set; }

    public Admin(string name, string role)
    {
        this.Name = name;
        this.Role = role;
    }

    // Method to activate or deactivate a driver
    public void ManageDriver(Driver driver, bool activate)
    {
        if (activate)
        {
            driver.Availability = true;
            Console.WriteLine($"{driver.Name} has been activated and is now available for rides.");
        }
        else
        {
            driver.Availability = false;
            Console.WriteLine($"{driver.Name} has been deactivated and is no longer available for rides.");
        }
    }

    // Method to activate or deactivate a rider
    public void ManageRider(Rider rider, bool activate)
    {
        if (activate)
        {
            Console.WriteLine($"{rider.Name} has been activated and can now request rides.");
        }
        else
        {
            Console.WriteLine($"{rider.Name} has been deactivated and cannot request rides.");
        }
    }

    // View all trips taken by a particular rider or driver
    public void ViewTripHistory(List<Trip> trips, User user)
    {
        Console.WriteLine($"Trip history for {user.Name}:");
        foreach (var trip in trips)
        {
            if (trip.Rider == user || trip.Driver == user)
            {
                Console.WriteLine($"Trip ID: {trip.Id}, Status: {trip.Status}, Fare: {trip.Fare:C}, From: {trip.PickupLocation}, To: {trip.DropOffLocation}");
            }
        }
    }

    // Handle disputes between a driver and rider
    public void HandleDispute(Trip trip, string resolution)
    {
        // Logic to handle disputes (e.g., refund, penalties)
        Console.WriteLine($"Handling dispute for Trip ID: {trip.Id} between {trip.Rider.Name} and {trip.Driver.Name}. Resolution: {resolution}");

        // Example of handling a refund
        if (resolution == "refund")
        {
            Console.WriteLine($"A refund has been issued to {trip.Rider.Name} for Trip ID: {trip.Id}");
        }
    }
}
