package _16_multithreading;

public class Demo3 {
    public static void main(String[] args) {
        //ways to create threads in java
        //01. by extending Thread class
        class Worker extends Thread {
            @Override
            public void run() {
                System.out.println("run method implemented ");
                System.out.println("who is executing the run method:  " + Thread.currentThread().getName());
            }
        }
        Worker worker = new Worker();
        worker.setName("worker");
        worker.start();//


        System.out.println("main method logic : " + Thread.currentThread().getName());
    }
}
