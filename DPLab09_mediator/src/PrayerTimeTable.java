public class PrayerTimeTable implements IWidget {

    private Mediator mediator;

    // Constructor to initialize the mediator
    public PrayerTimeTable(Mediator mediator) {
        this.mediator = mediator;
    }

    // Implementation of the update method
    @Override
    public void update() {
        System.out.println("PrayerTimeTable has been updated");
        mediator.notify(this); // Notify the mediator about the update
    }
}
