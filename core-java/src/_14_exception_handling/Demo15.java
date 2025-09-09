package _14_exception_handling;

public class Demo15 {
    public static void main(String[] args) {
        try {
            System.out.println("Division is " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("invalid denominator : exception handled in main method");
        }
        System.out.println("rest of the main");
    }

    private static int divide(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }
}
