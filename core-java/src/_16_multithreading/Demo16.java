package _16_multithreading;

public class Demo16 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            m2();
        },"t1");
        t1.start();
        m1();
    }

    private static void m1() {
        System.out.println(Thread.currentThread().getName()+" m1()");
        m2();
    }

    private static void m2() {
        System.out.println(Thread.currentThread().getName()+" m2()");
        m3();
    }

    private static void m3() {
        System.out.println(Thread.currentThread().getName()+" m3()");
    }
}
