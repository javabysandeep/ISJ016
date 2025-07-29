package _10_java8_features;

public class Demo4CreatingSubclassFi {
    public static void main(String[] args) {

        //01. create the subclass of given functional interface using anonymous way

        @FunctionalInterface
        interface NumberProcessor {
            public abstract int process(int number);
        }

        NumberProcessor square = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };

        NumberProcessor cube = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };

        System.out.println("square of 19 is : " + square.process(19));
        System.out.println("cube of 19 is : " + cube.process(19));

    }
}
