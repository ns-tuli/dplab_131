
// Driver class
class Driver {
    private String name;
    private String location;

    public Driver(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void acceptRide() {
        System.out.println(name + " has accepted the ride.");
    }
}