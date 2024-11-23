public class Location implements IWidget {

    private Mediator mediator;

    // Constructor to initialize the mediator
    public Location(Mediator mediator) {
        this.mediator = mediator;
    }

    // Implementation of the update method
    @Override
    public void update() {
        System.out.println("Location has been updated");
        mediator.notify(this); // Notify the mediator about the update
    }
}
