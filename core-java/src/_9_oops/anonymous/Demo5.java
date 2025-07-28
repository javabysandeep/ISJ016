package _9_oops.anonymous;

public class Demo5 {
    public static void main(String[] args) {

        interface MessageService {
            public abstract void sendMessage(String msg);
        }

        MessageService msgService = new MessageService() {
            //anonymous class body
            @Override
            public void sendMessage(String msg) {
                System.out.println("sending Message :: Anonymous MessageService");
            }
        };

        msgService.sendMessage("Hello World");
    }
}
