// Leaf class: Simple Product
class Product implements ProductComponent {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
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
    public double getPrice() {
        return price;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product: " + getName() + ", Description: " + getDescription() + ", Price: $" + getPrice());
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}

