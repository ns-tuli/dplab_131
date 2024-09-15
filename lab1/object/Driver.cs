public class Driver : User
{
    public string VehicleType { get; set; }
    public bool Availability { get; set; }

    public void AcceptRide(Trip trip)
    {
        // Logic for driver to accept a ride
        Console.WriteLine("Driver has accepted the ride.");
    }

    public void UpdateLocation(string location)
    {
        this.Location = location;
        // Logic to update driver's location
    }

    public void RateRider(Rider rider, int rating)
    {
        // Logic to rate the rider
        rider.Rating = (rider.Rating + rating) / 2; // Averaging ratings
    }

    public void StartTrip(Trip trip)
    {
        trip.Status = "Started";
        Console.WriteLine("Trip has started.");
    }
}
