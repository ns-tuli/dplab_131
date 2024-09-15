public class DigitalWalletPayment : IPaymentMethod
{
    public string WalletID { get; set; }
    public decimal WalletBalance { get; set; }

    public DigitalWalletPayment(string walletId, decimal walletBalance)
    {
        this.WalletID = walletId;
        this.WalletBalance = walletBalance;
    }

    public void ProcessPayment(decimal amount)
    {
        // Logic for processing digital wallet payment
        if (WalletBalance >= amount)
        {
            WalletBalance -= amount;
            Console.WriteLine($"Processing Digital Wallet payment of {amount:C}. New wallet balance: {WalletBalance:C}");
        }
        else
        {
            Console.WriteLine("Insufficient funds in the digital wallet.");
        }
    }
}
