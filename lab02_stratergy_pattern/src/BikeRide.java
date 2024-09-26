
class BikeRide implements RideType {
    @Override
    public double calculateFare(double distance, double baseFare) {
        return baseFare + (distance * 0.3); // Bike fare logic
    }
}