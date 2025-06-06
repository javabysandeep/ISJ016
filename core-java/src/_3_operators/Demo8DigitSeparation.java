package _3_operators;

public class Demo8DigitSeparation {
    public static void main(String[] args) {
        int number = 123456789;
        int sum = 0;

        while (number != 0) {
            //mod, divide
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("sum of digits of the given number is " + sum);
    }
}
