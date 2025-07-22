package _9_oops.polymorphism;

public class Demo2MethodOverriding {
    public static void main(String[] args) {
        class MessageService {
            public void sendMessage(String message) {
                System.out.println("Sending message using parent class " + message);
            }
        }
        class WhatsAppService extends MessageService {
            //method overriding
            public void sendMessage(String message) {
                System.out.println("Sending message using WhatsApp class : " + message);
            }
        }

        MessageService service = new WhatsAppService();
        service.sendMessage("Good morning");
    }
}
