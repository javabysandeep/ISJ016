package _10_java8_features;

public class Demo7 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Arithmetic {
            int process(int number1, int number2);
        }
        Arithmetic ref = (number1, number2) -> number1 + number2;

        System.out.println("Addition is : " + ref.process(3, 4));//7
    }
}
