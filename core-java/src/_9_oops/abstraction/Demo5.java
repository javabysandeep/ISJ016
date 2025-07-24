package _9_oops.abstraction;

public class Demo5 {
    public static void main(String[] args) {

        abstract class MessageService {
            public abstract void sendMessage(String message);
        }

        class WhatsAppMessageService extends MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("WhatsApp Message: " + message);
            }
        }

        MessageService msgService = new WhatsAppMessageService();
        msgService.sendMessage("WhatsApp Message");

    }
}
