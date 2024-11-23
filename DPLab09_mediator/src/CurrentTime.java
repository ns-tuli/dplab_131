public class CurrentTime implements IWidget {

    private Mediator mediator;

    // Constructor to initialize the mediator
    public CurrentTime(Mediator mediator) {
        this.mediator = mediator;
    }

    // Implementation of the update method
    @Override
    public void update() {
        System.out.println("current time has been updated");
        mediator.notify(this); // Notify the mediator about the update
    }
}
