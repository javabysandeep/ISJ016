package _4_controlStatements._1_conditional;

public class Demo6 {
    public static void main(String[] args) {
        int number1 = 1000;
        int number2 = 200;
        int number3 = 300;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is maximum");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is maximum");
        } else {
            System.out.println(number3 + " is maximum");
        }

    }
}
