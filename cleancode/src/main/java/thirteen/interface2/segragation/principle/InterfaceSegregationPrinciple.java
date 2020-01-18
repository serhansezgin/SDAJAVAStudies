package thirteen.interface2.segragation.principle;

public class InterfaceSegregationPrinciple {

    /**
     *
     * Why we use Interface ?
     *
     * ISP stands no client should be forced to depend on methods it does not use.
     * ISP splits interfaces that are very large into smaller and more specific ones
     * so that clients will only have to know about the methods that are of interest to them.
     */

    /**
     * Problem :
     *
     * We need to send email
     * We need to send SMS
     *
     */
}

interface Message{

    String createSubject();
    String createMessageText();
    boolean send();
}

class EmailMessage implements Message{
    @Override
    public String createSubject() {
        return null;
    }

    @Override
    public String createMessageText() {
        return null;
    }

    @Override
    public boolean send() {
        return false;
    }
}

class SMSMessage implements Message{

    @Override
    public String createSubject() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String createMessageText() {
        return null;
    }

    @Override
    public boolean send() {
        return false;
    }
}

/**
 * Problem again :
 *
 * I want to add Bcc or CC property !
 *
 */


/**
 *
 * How to solve it ?
 *
 **/
interface IMessage{

    String createMessageBody();
    boolean send();
}

interface IEmailMessage extends IMessage{

    String createSubject();
    String createBcc();

}

interface ISMS extends IMessage{

}