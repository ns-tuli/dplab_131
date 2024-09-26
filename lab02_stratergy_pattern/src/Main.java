import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a rider by taking user input for name and location
        System.out.print("Enter rider's name: ");
        String riderName = scanner.nextLine();
        System.out.print("Enter rider's location: ");
        String riderLocation = scanner.nextLine();
        Rider rider = new Rider(riderName, riderLocation);

        // Take preferred ride type from the user
        System.out.println("Choose your preferred ride type:");
        System.out.println("1. Bike Ride");
        System.out.println("2. Carpool Ride");
        System.out.println("3. Luxury Ride");
        int rideChoice = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        RideType rideType;
        if (rideChoice == 1) {
            rideType = new BikeRide();
        } else if (rideChoice == 2) {
            rideType = new CarpoolRide();
        } else {
            rideType = new LuxuryRide();
        }

        // Choose preferred payment method
        rider.choosePaymentMethod();

        // Choose notification method
        System.out.println("Choose your preferred notification method:");
        System.out.println("1. SMS");
        System.out.println("2. Email");
        System.out.println("3. In-App");
        int notificationChoice = scanner.nextInt();
        NotificationService notificationService;
        if (notificationChoice == 1) {
            notificationService = new SMSNotification();
        } else if (notificationChoice == 2) {
            notificationService = new EmailNotification();
        } else {
            notificationService = new InAppNotification();
        }

        // Create a driver by taking user input for name and location
        System.out.print("Enter driver's name: ");
        scanner.nextLine(); // consume newline
        String driverName = scanner.nextLine();
        System.out.print("Enter driver's location: ");
        String driverLocation = scanner.nextLine();
        Driver driver = new Driver(driverName, driverLocation);

        // Check if the locations match to start the trip
        if (rider.getLocation().equalsIgnoreCase(driver.getLocation())) {
            System.out.println("Locations match! A trip can be started.");

            // Take input for trip distance
            System.out.print("Enter the trip distance (in kilometers): ");
            double distance = scanner.nextDouble();

            // Create a trip with user inputs and matching locations
            Trip trip = new Trip(riderLocation, "Destination", distance, rideType, rider.getPreferredPaymentMethod(), notificationService);

            // Driver accepts the ride
            System.out.println("\n--- Driver Accepts Ride ---");
            driver.acceptRide();

            // Driver starts the trip
            System.out.println("\n--- Driver Starts Trip ---");
            trip.startTrip();

            // Trip completes and rider rates the driver
            trip.completeTrip();

            // Rider manually rates the driver
            System.out.println("\n--- Rider Rates Driver ---");
            rider.rateDriverManually();

            // Trip completed message
            System.out.println("\n--- Trip Completed ---");

            // Admin actions including viewing the trip history
            System.out.println("\n--- Admin Actions ---");
            Admin admin = new Admin("Admin1");

            // Admin manages driver
            admin.manageDriver(driver);

            // Admin manages rider
            admin.manageRider(rider);

            // Admin views the trip history with actual distance
            System.out.println("\n--- Admin Views Trip History ---");
            admin.viewTripHistory(trip);
        } else {
            System.out.println("Locations do not match. The trip cannot be started.");
        }

        scanner.close();
    }
}

