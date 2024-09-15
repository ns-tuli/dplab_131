public abstract class User
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Location { get; set; }
    public int Rating { get; set; }
    public string Email { get; set; }
    public string PhoneNumber { get; set; }

    public User()
    {
        // Initialize default rating
        Rating = 5; // Default rating can be 5 (out of 5)
    }

    // Method to update the user's location
    public void UpdateLocation(string newLocation)
    {
        Location = newLocation;
        Console.WriteLine($"{Name} updated location to {newLocation}.");
    }

    // Method to receive notifications
    public void ReceiveNotification(string message)
    {
        Console.WriteLine($"Notification for {Name}: {message}");
    }

    // Method to update the user's contact information
    public void UpdateContactInfo(string email, string phoneNumber)
    {
        Email = email;
        PhoneNumber = phoneNumber;
        Console.WriteLine($"{Name}'s contact info updated. Email: {Email}, Phone: {PhoneNumber}");
    }
}
