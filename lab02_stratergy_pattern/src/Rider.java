import java.util.Scanner;

// Rider class
class Rider extends User {

    private PaymentMethod preferredPaymentMethod;

    public Rider(String name, String location) {
        this.name = name;
        this.location = location;
    }


    public void choosePaymentMethod() {
        System.out.println("Choose your preferred payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Digital Wallet");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                preferredPaymentMethod = new CreditCard();
                System.out.println(name + " has selected Credit Card as the payment method.");
                break;
            case 2:
                preferredPaymentMethod = new PayPalPayment();
                System.out.println(name + " has selected PayPal as the payment method.");
                break;
            case 3:
                preferredPaymentMethod = new DigitalWalletPayment();
                System.out.println(name + " has selected Digital Wallet as the payment method.");
                break;
            default:
                System.out.println("Invalid choice, please select again.");
                choosePaymentMethod();
        }
    }

    public PaymentMethod getPreferredPaymentMethod() {
        return this.preferredPaymentMethod;
    }

    public void rateDriverManually() {
        System.out.println("Please rate the driver (1 to 5 stars):");

        Scanner scanner = new Scanner(System.in);
        double rating = scanner.nextDouble();

        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating. Please enter a value between 1 and 5.");
            rateDriverManually();
        } else {
            System.out.println(name + " rated the driver with " + rating + " stars.");
        }
    }
}
