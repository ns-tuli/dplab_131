public class Trip
{
    public int Id { get; set; }
    public string PickupLocation { get; set; }
    public string DropOffLocation { get; set; }
    public string RideType { get; set; }
    public decimal Fare { get; private set; }
    public string Status { get; set; }
    public Rider Rider { get; set; }
    public Driver Driver { get; set; }
    public int Distance { get; set; }

    public void CalculateFare()
    {
        // Simple fare calculation based on distance and ride type
        Fare = Distance * (RideType == "Luxury" ? 2.0m : 1.0m);
        Console.WriteLine($"Fare calculated: {Fare:C}");
    }

    public void AssignDriver(Driver driver)
    {
        this.Driver = driver;
        this.Status = "Driver Assigned";
        Console.WriteLine("Driver has been assigned.");
    }

    public void CompleteTrip()
    {
        this.Status = "Completed";
        Console.WriteLine("Trip has been completed.");
    }
}
