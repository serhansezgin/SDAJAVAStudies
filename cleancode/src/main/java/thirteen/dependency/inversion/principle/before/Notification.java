package thirteen.dependency.inversion.principle.before;

public class Notification {

    public Email email;
    public Sms sms;


    public Notification(Email email, Sms sms) {
        this.email = email;
        this.sms = sms;
    }

    public void send()
    {
        email.sendEmail();
        sms.sendSms();
    }
}
