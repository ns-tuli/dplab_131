// Luxury Ride
class LuxuryRide implements RideType {
    @Override
    public double calculateFare(double distance, double baseFare) {
        return baseFare + (distance * 2.0); // Luxury fare logic
    }
}
