public class PushManager implements MessengerSender {
    @Override

    public void send(String to, String msg) {
        System.out.println("Push thông báo đến:" + to);
        System.out.println("Nội dung" + msg);
    }
}
