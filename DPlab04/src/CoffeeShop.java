public class CoffeeShop {
    public static void main(String[] args) {
        
        // Order a simple Espresso
        
        var beverage = new Milk(new Sugar(new Espresso()));
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
