package _16_multithreading;

public class Demo19 {
    public static void main(String[] args) throws InterruptedException {
        Demo19 demo19 = new Demo19();
        demo19.m1();
    }
    public void m1() throws InterruptedException {
        wait();//IllegalMonitorStateException: current thread is not owner
    }
}
