package _16_multithreading;

public class Demo10 {
    public static void main(String[] args) {
        //odd number printing logic
        Runnable runnable = () -> {
            for (int i = 1; i <= 100; i = i + 2) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };
        Thread odd = new Thread(runnable, "odd");
        odd.start();

        //even number printing logic
        Thread even = new Thread(() -> {
            for (int i = 0; i <= 100; i = i + 2) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }, "even");
        even.start();
    }
}
