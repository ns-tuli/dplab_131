class DigitalWalletPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Digital Wallet payment of " + amount);
    }
}