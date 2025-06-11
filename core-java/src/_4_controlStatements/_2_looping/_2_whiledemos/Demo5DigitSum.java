package _4_controlStatements._2_looping._2_whiledemos;

public class Demo5DigitSum {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("sum = " + sum);

        //1234%10 ----> 4
        //1234 / 10 ---> 123

        //123%10 ---> 3
        //123 / 10 --> 12

        //12%10 --->2
        // 12 / 10 ---> 1

        //1 %10 ---> 1
        //1 / 10 ---> 0


    }
}
