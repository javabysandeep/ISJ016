package _16_multithreading;

public class Demo11 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> System.out.println("t1"), "t1");
        Thread t2 = new Thread(()-> System.out.println("t2"));//default name set ---> Thread-0
        t2.setName("t2");// name changed from Thread-0 to t2
        t1.start();
        t2.start();
        Thread t3 = new Thread(()-> System.out.println("custom thread default name "+Thread.currentThread().getName()));
        t3.start();


    }
}
