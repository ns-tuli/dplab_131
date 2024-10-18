public class SMS implements IMessage {
    @Override
    public void send(String name, String message) {
        System.out.println(name + " sent an SMS - " + message);
    }
}
