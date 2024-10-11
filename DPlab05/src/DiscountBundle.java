// Concrete class: DiscountBundle (inherits from Bundle)
class DiscountBundle extends Bundle {
    public DiscountBundle(String name, String description, double discountPercentage) {
        super(name, description, discountPercentage);
        buildBundle();
    }

    @Override
    void buildBundle() {
        add(new Product("Sunsilk","For hair",200));
        add(new Product("Sunsilk","For hairloss",200));
    }

    @Override
    public double getPrice() {
        return calculatePrice(); // Calls the calculatePrice method to get the discounted price
    }

    @Override
    public double calculatePrice() {
        double totalPrice = 0;
        for (ProductComponent product : products) {
            totalPrice += product.calculatePrice();
        }
        return totalPrice * (1 - discountPercentage / 100); // Apply discount
    }
}

