//here  ProductComponent is the general interface for both Products and Bundles (simple and composite class)

interface ProductComponent {

    String getName();
    String getDescription();
    double getPrice();
    void displayProductInfo();
    double calculatePrice();
}
