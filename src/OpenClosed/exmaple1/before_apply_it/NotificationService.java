package OpenClosed.exmaple1.before_apply_it;

public class NotificationService {
    public void sendNotification(Notification notification) {
        if (notification.getType().equals("Email")) {
            // Send email notification
            System.out.println("Sending email notification: " + notification.getMessage());
        } else if (notification.getType().equals("SMS")) {
            // Send SMS notification
            System.out.println("Sending SMS notification: " + notification.getMessage());
        }

        // More notification types and sending logic can be added here
    }

}



