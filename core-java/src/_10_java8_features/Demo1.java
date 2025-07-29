package _10_java8_features;

public class Demo1 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            public abstract int process(int number);
           // void m1();
            static void m1(){}
            default void m2(){}
        }
    }
}
