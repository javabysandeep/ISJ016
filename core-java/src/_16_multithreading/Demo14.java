package _16_multithreading;

public class Demo14 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(5000);
            System.out.println(i);
        }
    }
}
