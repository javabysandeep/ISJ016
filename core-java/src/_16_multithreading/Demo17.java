package _16_multithreading;

public class Demo17 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(10 / 0), "t1");
        Thread t2 = new Thread(() -> System.out.println(10 / 2), "t2");
        t1.start();
        t2.start();
    }
}
