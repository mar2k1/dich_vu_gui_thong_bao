public class PushManager implements MessengerSender {
    @Override

    public void sender(String msg, String to) {
        System.out.println("Push thông báo đến:" + to);
        System.out.println("Nội dung" + msg);
    }
}
