package _16_multithreading;

public class Demo9 {
    public static void main(String[] args) {
        //create the threads using Runnable interface

        Runnable worker = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        };
        //worker.start();//CTE
        Thread thread = new Thread(worker, "worker");
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
