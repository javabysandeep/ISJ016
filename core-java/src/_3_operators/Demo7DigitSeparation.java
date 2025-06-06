package _3_operators;

public class Demo7DigitSeparation {
    public static void main(String[] args) {
        //mod, divide
        int number = 123;
        int sum = 0;
        int digit = number % 10;//3
        sum = sum + digit; // sum +=digit;

        number = number / 10; // number /=10;
        digit = number % 10; //2
        sum = sum + digit;

        number = number / 10;
        digit = number % 10;//1
        sum = sum + digit;
        System.out.println("sum of digits of the given number is " + sum);
    }
}
