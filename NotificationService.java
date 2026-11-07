public class NotificationService {
    private MessengerSender;

    private NotificationService(MessengerSender sender) {
        this.sender = sender;
    }

    public void notify(String to, String msg) {
        sender.send(to, msg);
    }
}
