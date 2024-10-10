public class Sugar implements DecoratorForCondiment{
    private Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",  Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}