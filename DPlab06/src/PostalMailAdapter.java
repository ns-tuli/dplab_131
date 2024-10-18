public class PostalMailAdapter implements IMessage {
    private PostalMail postalMail;
    private Location location;

    public PostalMailAdapter(PostalMail postalMail, Location location) {
        this.postalMail = postalMail;
        this.location = location;
    }

    @Override
    public void send(String name, String message) {
        postalMail.sendPostalMail(name, message, location.getLocation());
    }
}