public class WaqtTimeTable implements IWidget {

    private Mediator mediator;

    // Constructor to initialize the mediator
    public WaqtTimeTable(Mediator mediator) {
        this.mediator = mediator;
    }

    // Implementation of the update method
    @Override
    public void update() {
        System.out.println("waqt time table has been updated");
        mediator.notify(this); // Notify the mediator about the update
    }
}
