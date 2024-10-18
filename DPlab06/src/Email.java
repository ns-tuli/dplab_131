public class Email implements IMessage {
    @Override
    public void send(String name, String message) {
        System.out.println(name + " sent an email - " + message);
    }
}