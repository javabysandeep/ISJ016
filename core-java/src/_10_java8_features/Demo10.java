package _10_java8_features;

public class Demo10 {
    public static void main(String[] args) {
        class Worker {
            Worker() {
                System.out.println("Worker constructor");
            }

            void work() {
                System.out.println("Working is working");
            }

            static void workStatic() {
                System.out.println("Working is working:static");
            }
        }

        @FunctionalInterface
        interface Runnable {
            void run();
        }
        //01. traditional way
        class A implements Runnable {
            @Override
            public void run() {
                System.out.println("A is working");
            }
        }
        Runnable a = new A();
        a.run();

        //02. Anonymous way
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous is working");
            }
        };
        anonymous.run();

        //03. lambda expression
        Runnable lambda = () -> System.out.println("Lambda is working");
        lambda.run();

        //04. method reference
//        Runnable methodReference = Worker::workStatic;
        Runnable methodReference = Worker::new;
//        Runnable methodReference = new Worker()::work;
        methodReference.run();
    }
}
