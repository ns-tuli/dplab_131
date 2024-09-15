public class CreditCardPayment : IPaymentMethod
{
    public string CardNumber { get; set; }
    public string CardHolder { get; set; }
    public DateTime ExpiryDate { get; set; }
    public string CVV { get; set; }

    public CreditCardPayment(string cardNumber, string cardHolder, DateTime expiryDate, string cvv)
    {
        this.CardNumber = cardNumber;
        this.CardHolder = cardHolder;
        this.ExpiryDate = expiryDate;
        this.CVV = cvv;
    }

    public void ProcessPayment(decimal amount)
    {
        // Logic for processing credit card payment
        if (DateTime.Now > ExpiryDate)
        {
            Console.WriteLine("Credit card has expired.");
        }
        else
        {
            Console.WriteLine($"Processing credit card payment of {amount:C} for {CardHolder}.");
            
        }
    }
}
