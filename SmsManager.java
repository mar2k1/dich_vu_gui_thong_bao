public class SmsManager implements MessengerSender {
    @Override

    public void sender(String msg, String to) {
        System.out.println("Gửi SMS đến:" + to);
        System.out.println("Nội dung" + msg);
    }
}
