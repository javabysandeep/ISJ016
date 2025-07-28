package _9_oops.anonymous;

public class Demo3 {
    public static void main(String[] args) {

        class MessageService{
            void sendMessage(String msg){
                System.out.println("sending Message :: MessageService");
            }
        }
        MessageService msgService = new MessageService(){
            //anonymous class body
            @Override
            void sendMessage(String msg) {
                System.out.println("sending Message :: Anonymous MessageService");
            }
        };

        msgService.sendMessage("Hello World");
    }
}
