public class CoffeeShop {
    public static void main(String[] args) {
        // Order a simple Espresso
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // Order a Latte with double Milk and Sugar
        Beverage beverage2 = new Latte();
        beverage2 = new Milk(beverage2);  // Adding first milk
        beverage2 = new Milk(beverage2);  // Adding second milk (double milk)
        beverage2 = new Sugar(beverage2); // Adding sugar
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // Order a Cappuccino with Milk and Whipped Cream
        Beverage beverage3 = new Cappuccino();
        beverage3 = new Milk(beverage3);         // Adding milk
        beverage3 = new WhippedCream(beverage3); // Adding whipped cream
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        var beverage = new Milk(new Sugar(new Espresso()));
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
