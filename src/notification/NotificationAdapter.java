package notification;

public class NotificationAdapter {
    private NotificationService service;

    public NotificationAdapter(NotificationService service) {
        this.service = service;
    }

    public void notifyUser(String message) {
        service.sendNotification(message);
    }
}
