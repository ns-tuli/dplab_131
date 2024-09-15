public class Rider : User
{
    public IPaymentMethod PreferredPaymentMethod { get; set; }

    public void RequestRide(string pickupLocation, string dropOffLocation, string rideType)
    {
        // Logic for requesting a ride
        Console.WriteLine($"Ride requested from {pickupLocation} to {dropOffLocation}.");
    }

    public void RateDriver(Driver driver, int rating)
    {
        // Logic to rate the driver
        driver.Rating = (driver.Rating + rating) / 2; // Averaging ratings
    }

    public void MakePayment(IPaymentMethod paymentMethod, decimal amount)
    {
        paymentMethod.ProcessPayment(amount);
    }
}
