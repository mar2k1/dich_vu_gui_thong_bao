public class EmailManager implements MessengerSender {
    @Override

    public void send(String to, String msg) {
        System.out.println("Gửi email đến:" + to);
        System.out.println("Nội dung" + msg);
    }

}
