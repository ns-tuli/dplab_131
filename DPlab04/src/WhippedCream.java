public class WhippedCream implements DecoratorForCondiment {
    private Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",  Whipped Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.7;
    }
}