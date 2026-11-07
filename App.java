
public class App {
    public static void main(String[] args) {
        MessengerSender email = new EmailManager();

        NotificationService s1 = new NotificationService(email);
        s1.notify("yen56@gmail.com", "Gửi thư qua email");

        MessengerSender sms = new SmsManager();

        NotificationService s2 = new NotificationService(sms);

        s2.notify("97486979", "Gửi tin nhắn SMS");

        MessengerSender push = new PushManager();

        NotificationService s3 = new NotificationService(push);

        s3.notify("yen56@gmail.com", "Bạn có thư mới");

    }
}
