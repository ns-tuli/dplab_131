public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Here is your Espresso ^ ^   ";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
