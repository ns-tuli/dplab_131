public class Latte implements Beverage {

    @Override
    public String getDescription() {
        return "here is your Latte ^ ^     ";
    }

    @Override
    public double cost() {
        return 3.5;
    }
}
