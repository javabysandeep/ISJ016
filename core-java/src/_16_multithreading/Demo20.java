package _16_multithreading;

public class Demo20 {
    public static void main(String[] args) {
        class Product {
            synchronized public void produce() {
                System.out.println("product is produced by " + Thread.currentThread().getName());
                try {
                    wait();//release the lock and go in waiting state
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

           synchronized public void consume() {
                System.out.println("product is consumed by " + Thread.currentThread().getName());
                notify();
            }
        }

        Product product = new Product();
        Thread producer = new Thread(() -> product.produce(), "producer");
        Thread consumer = new Thread(() -> product.consume(), "consumer");
        producer.start();
        consumer.start();
    }
}
