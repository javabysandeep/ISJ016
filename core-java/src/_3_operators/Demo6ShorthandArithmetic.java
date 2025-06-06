package _3_operators;

public class Demo6ShorthandArithmetic {
    public static void main(String[] args) {
        int number1 = 10;
        number1 += 10; //number1 = number1 + 10;
        System.out.println("Number is " + number1);//20

        int number2 = 10;
        number2 -= 5; //number2 = number2 - 5;
        System.out.println("Number is " + number2);//5

        int number3 = 10;
        number3 *= 3; //number3 = number3 * 3;
        System.out.println("Number is " + number3);//30

        int number4 = 10;
        number4 /= 3; //number4 = number4 /3; -->3
        System.out.println("Number is " + number4);//3

        int number5 = 10;
        number5 %= 3; // number5 = number5 % 3; --> 1
        System.out.println("Number is " + number5);//1

    }
}
