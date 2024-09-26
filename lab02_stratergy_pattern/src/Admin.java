
// Admin class
class Admin {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public void manageDriver(Driver driver) {
        System.out.println(name + " is managing driver: " + driver.getName());
    }

    public void manageRider(Rider rider) {
        System.out.println(name + " is managing rider: " + rider.getName());
    }

    public void viewTripHistory(Trip trip) {
        System.out.println(name + " is viewing trip history for trip from " + trip.getPickupLocation() +
                " to " + trip.getDropOffLocation() + ". Distance: " + trip.getDistance() + " km. Fare: " + trip.calculateFare());
    }
}



