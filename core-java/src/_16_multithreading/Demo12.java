package _16_multithreading;

public class Demo12 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("t1"), "t1");
        //t1.setPriority(11);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        //rest of the main
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("main thread priority "+Thread.currentThread().getPriority());
        System.out.println("t1 thread priority "+t1.getPriority());
    }
}
