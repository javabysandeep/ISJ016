package _16_multithreading;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("main method logic");
        System.out.println("who is executing main method : "
                + Thread.currentThread().getName());
    }
}
