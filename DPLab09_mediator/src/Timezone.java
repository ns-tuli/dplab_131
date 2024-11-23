public class Timezone implements IWidget {

    private Mediator mediator;

    // Constructor to initialize the mediator
    public Timezone(Mediator mediator) {
        this.mediator = mediator;
    }

    // Implementation of the update method
    @Override
    public void update() {
        System.out.println("Timezone has been updated");
        mediator.notify(this); // Notify the mediator about the update
    }
}
