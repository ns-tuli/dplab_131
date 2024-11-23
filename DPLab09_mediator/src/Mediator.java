import java.util.*;

// Define the Mediator class
public class Mediator {

    // Dictionary equivalent in Java: Map
    private Map<IWidget, List<IWidget>> dependency = new HashMap<>();

    private IWidget currentTime;
    private IWidget currentWaqt;
    private IWidget location;
    private IWidget nextWaqt;
    private IWidget prayerTimeSettings;
    private IWidget prayerTimeTable;
    private IWidget timeZone;
    private IWidget waqtTime;

    // Set method to initialize the widgets and register dependencies
    public void set(
            IWidget currentTime,
            IWidget currentWaqt,
            IWidget location,
            IWidget nextWaqt,
            IWidget prayerTimeSettings,
            IWidget prayerTimeTable,
            IWidget timeZone,
            IWidget waqtTime
    ) {
        this.currentTime = currentTime;
        this.currentWaqt = currentWaqt;
        this.location = location;
        this.nextWaqt = nextWaqt;
        this.prayerTimeSettings = prayerTimeSettings;
        this.prayerTimeTable = prayerTimeTable;
        this.timeZone = timeZone;
        this.waqtTime = waqtTime;
        this.register();
    }

    // Register method to set up the dependencies
    public void register() {
        dependency.put(timeZone, Arrays.asList(currentTime, waqtTime));
        dependency.put(location, Arrays.asList(waqtTime));
        dependency.put(prayerTimeSettings, Arrays.asList(prayerTimeTable));
        dependency.put(currentTime, Arrays.asList(currentWaqt));
        dependency.put(waqtTime, Arrays.asList(currentWaqt, nextWaqt));
        dependency.put(prayerTimeTable, Arrays.asList(nextWaqt));
    }

    // Notify method to update dependent widgets
    public void notify(IWidget sender) {
        List<IWidget> widgets = dependency.get(sender);
        if (widgets != null) {
            for (IWidget widget : widgets) {
                widget.update();
            }
        }
    }
}
