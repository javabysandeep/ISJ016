package _16_multithreading;

public class Demo7 {
    public static void main(String[] args) {
        //create the threads using Runnable interface
        // step 01 : create the Subclass of type Runnable
        class Worker implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }

        // Step 02 : create the subclass object
        Worker worker = new Worker();
        //worker.start();//CTE

        //Step 03 : create the Thread class object by passing runnable type object
        Thread thread = new Thread(worker, "worker");


        //step 04 : call the Start method
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
