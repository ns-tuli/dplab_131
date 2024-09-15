public class PayPalPayment : IPaymentMethod
{
    public string PayPalEmail { get; set; }

    public PayPalPayment(string email)
    {
        this.PayPalEmail = email;
    }

    public void ProcessPayment(decimal amount)
    {
        // Logic for processing PayPal payment
        Console.WriteLine($"Processing PayPal payment of {amount:C} for {PayPalEmail}.");
        
    }
}
