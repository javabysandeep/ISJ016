package _4_controlStatements._2_looping._1_forDemos;

public class Demo15Factor {
    public static void main(String[] args) {
        //find the factors of the given number
        // 6 factors are 1, 2,3
        // maximum factor can be n/2
        //factor range will be : 1 to n/2
        int number = 100;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
