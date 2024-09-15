public class NotificationService : INotificationService
{
    public void SendNotification(string message, User user)
    {
        // Logic for sending notification via the chosen method (SMS, Email, In-App)
        Console.WriteLine($"Notification sent to {user.Name}: {message}");
    }
}
