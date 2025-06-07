package _3_operators;

public class Demo16LogicalOperator {
    public static void main(String[] args) {
        //leap year :  year which is divisible by 4 and if it is century year then it must be divisible by 400
        int year = 2024;
        System.out.println(
                (year % 400 == 0)
                        ||
                        (year % 4 == 0
                                &&
                                year % 100 != 0)
        );//true
    }
}
