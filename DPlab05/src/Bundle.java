import java.util.ArrayList;
import java.util.List;

// Abstract class: Bundle
abstract class Bundle implements ProductComponent {
    protected String name;
    protected String description;
    protected List<ProductComponent> products = new ArrayList<>();
    protected double discountPercentage;

    public Bundle(String name, String description, double discountPercentage) {
        this.name = name;
        this.description = description;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Bundle: " + getName() + ", Description: " + getDescription());
        for (ProductComponent product : products) {
            product.displayProductInfo();
        }
        System.out.println("Bundle Price (after discount): $" + calculatePrice());
    }
    abstract void  buildBundle();
    // Add and remove methods for the bundle
    public void add(ProductComponent productComponent) {
        products.add(productComponent);
    }

    public void remove(ProductComponent productComponent) {
        products.remove(productComponent);
    }


    public double calculatePrice() {
        double totalPrice = 0;
        for (ProductComponent product : products) {
            totalPrice += product.calculatePrice();
        }
        return totalPrice * (1 - discountPercentage / 100); // Apply discount
    }

}
