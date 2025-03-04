import java.util.List;

// Step 4: Implement APIs for each platform
class TwitterAPI {
    public List<String> getNotifications() {
        return List.of("Twitter: New follower", "Twitter: New mention");
    }

    public void markAsRead(String notificationId) {
        System.out.println("Twitter: Marked notification '" + notificationId + "' as read.");
    }

    public void deleteNotification(String notificationId) {
        System.out.println("Twitter: Deleted notification '" + notificationId + "'.");
    }
}