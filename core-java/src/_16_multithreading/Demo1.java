package _16_multithreading;

public class Demo1 {
    public static void main(String[] args) {
        //01. traditional way
        class RunnableImpl implements Runnable {
            @Override
            public void run() {
                System.out.println("run - traditional way");
            }
        }
        Runnable t1 = new RunnableImpl();
        t1.run();

        //02. anonymous class way
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run - anonymous class way");
            }
        };
        t2.run();

        //03. Lambda expression
        Runnable t3 = () -> System.out.println("run - lambda expression way");
        t3.run();

    }
}
