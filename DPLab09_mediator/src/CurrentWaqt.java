public class CurrentWaqt implements IWidget {

    private Mediator mediator;

    // Constructor to initialize the mediator
    public CurrentWaqt(Mediator mediator) {
        this.mediator = mediator;
    }

    // Implementation of the update method
    @Override
    public void update() {
        System.out.println("PrayerTimeTable has been updated");
        mediator.notify(this); // Notify the mediator about the update
    }
}
