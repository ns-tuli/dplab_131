// Client code
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create simple products


        // Create a discounted bundle that contains simple products with 10% discount
        DiscountBundle techBundle = new DiscountBundle("Tech Bundle", "A bundle with electronics", 10); // 10% discount


        // Create another discounted bundle that contains the first bundle and a simple product with 15% discount

        // Display product information and calculate total price (only once)
        techBundle.displayProductInfo();
        System.out.println("Total Price: $" + techBundle.calculatePrice());
    }
}