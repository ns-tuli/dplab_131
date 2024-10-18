public class Main {
    public static void main(String[] args) {
        // Creating location object
        Location dhanmondi = new Location("dhaka", "Bangladesh");

        // Existing notification method
        IMessage emailNotification = new Email();
        emailNotification.send("tuli", "hello!");

        IMessage smsNotification = new SMS();
        smsNotification.send("lipi", "are you okay?");

        // Using PostalMailAdapter
        IMessage postalMailNotification = new PostalMailAdapter(new PostalMail(), dhanmondi);
        postalMailNotification.send("zim", "this is adapter method ^ ^");
    }
}