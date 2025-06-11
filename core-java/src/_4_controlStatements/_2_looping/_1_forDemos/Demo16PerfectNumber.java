package _4_controlStatements._2_looping._1_forDemos;

public class Demo16PerfectNumber {
    public static void main(String[] args) {
        //find the factors of the given number
        // 6 factors are 1, 2,3
        //28 :: 1,2,4,7,14
        // maximum factor can be n/2
        //Perfect given number = sum of factors
        int number = 6;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum == number ? "perfect" : "not perfect");

    }
}
