package _10_java8_features;

public class Demo5 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Runnable {
            void run();
        }

        //01. traditional way
        class Worker implements Runnable {
            public void run() {
                System.out.println("run method using traditional way");
            }
        }
        Runnable r = new Worker();
        r.run();

        //02. anonymous class way
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method using anonymous way");
            }
        };
        r2.run();

        //03. lambda expression way
        Runnable r3 = () -> System.out.println("run method using lambda expression way");
        r3.run();
    }
}
