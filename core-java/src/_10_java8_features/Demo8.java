package _10_java8_features;

public class Demo8 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Arithmetic {
            int process(int number);
        }
        Arithmetic square = number -> number * number;

        System.out.println("Square is : " + square.process(3));//9
    }
}
