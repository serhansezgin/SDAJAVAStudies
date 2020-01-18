package thirteen.dependency.inversion.principle.after;

import java.util.List;

public class Notification {

    private List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }

    public void send()
    {
        for(Message message : messages)
        {
            message.sendMessage();
        }
    }
}
