package _16_multithreading;

public class Demo5 {
    public static void main(String[] args) {
        //create threads by extending Thread class
        class Worker extends Thread {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }
        Worker worker = new Worker();
        worker.setName("worker");
        worker.start();

        //rest of the main method
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}
