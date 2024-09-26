
class CarpoolRide implements RideType {
    @Override
    public double calculateFare(double distance, double baseFare) {
        return baseFare + (distance * 0.5); // Carpool fare logic
    }
}
