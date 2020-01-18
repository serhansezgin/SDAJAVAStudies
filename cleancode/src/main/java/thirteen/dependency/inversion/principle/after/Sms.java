package thirteen.dependency.inversion.principle.after;

public class Sms implements Message {

    public String phoneNumber;
    public String message;

    @Override
    public void sendMessage() {

    }
}
