class InAppNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending In-App Notification: " + message);
    }
}
