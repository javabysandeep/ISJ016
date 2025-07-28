package _9_oops.anonymous;

public class Demo4 {
    public static void main(String[] args) {

        abstract class MessageService {
            abstract void sendMessage(String msg);
        }

        MessageService msgService = new MessageService() {
            //anonymous class body
            @Override
            void sendMessage(String msg) {
                System.out.println("sending Message :: Anonymous MessageService");
            }
        };

        msgService.sendMessage("Hello World");
    }
}
