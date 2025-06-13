package _4_controlStatements._2_looping._1_forDemos;

public class Demo19PerfectNumberInRange {
    public static void main(String[] args) {
        //perfect number : sum of factors = given number

        for (int number = 1; number <= 10000; number++) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println("Perfect number: " + number);
            }
        }

    }
}
