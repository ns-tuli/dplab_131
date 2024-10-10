public interface DecoratorForCondiment extends Beverage {
    String getDescription(); // Description method to be implemented by the concrete decorator
    double cost();           // Cost method to be implemented by the concrete decorator
}

