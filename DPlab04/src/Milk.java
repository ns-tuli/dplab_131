public class Milk implements DecoratorForCondiment {
    private Beverage beverage;  // The beverage being decorated

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",  Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}