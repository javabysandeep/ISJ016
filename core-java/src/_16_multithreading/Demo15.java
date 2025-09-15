package _16_multithreading;

public class Demo15 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "t1");
        t1.start();
        t1.join(5000);//main will wait for t1 infinitely till t1 completed
        //t1.join(5000);//main will wait for t1 till t1 completes or maximum 5 seconds

        //first t1 should complete after that main should complete
        for (int i = 101; i <= 200; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
