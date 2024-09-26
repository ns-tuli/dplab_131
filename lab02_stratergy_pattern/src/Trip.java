class Trip {
    private String pickupLocation;
    private String dropOffLocation;
    private double distance;
    private RideType rideType;
    private PaymentMethod paymentMethod;
    private NotificationService notificationService;
    private double baseFare = 10.0;

    public Trip(String pickupLocation, String dropOffLocation, double distance, RideType rideType,
                PaymentMethod paymentMethod, NotificationService notificationService) {
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.distance = distance;
        this.rideType = rideType;
        this.paymentMethod = paymentMethod;
        this.notificationService = notificationService;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public double getDistance() {
        return distance;
    }

    public double calculateFare() {
        return rideType.calculateFare(distance, baseFare);
    }

    public void startTrip() {
        notificationService.sendNotification("Your trip has started from " + pickupLocation);
    }

    public void completeTrip() {
        double fare = calculateFare();
        paymentMethod.processPayment(fare);
        notificationService.sendNotification("Your trip is complete. Fare: " + fare);
    }
}
