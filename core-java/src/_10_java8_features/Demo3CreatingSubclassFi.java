package _10_java8_features;

public class Demo3CreatingSubclassFi {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            public abstract int process(int number);
        }
        //01. create the subclass of given functional interface using traditional way

        class Square implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }

        class Cube implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        }

        NumberProcessor square = new Square();
        NumberProcessor cube = new Cube();

        System.out.println("square of 19 is : " + square.process(19));
        System.out.println("cube of 19 is : " + cube.process(19));

    }
}
