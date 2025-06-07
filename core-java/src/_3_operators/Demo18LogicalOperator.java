package _3_operators;

public class Demo18LogicalOperator {
    public static void main(String[] args) {
        System.out.println(10 % 3 == 0 && 10 / 0 == 0);//false
        System.out.println(10 % 2 == 0 || 10 / 0 == 0);//true

        System.out.println(10 % 3 == 0 & 10 / 0 == 0);//AE
        System.out.println(10 % 2 == 0 | 10 / 0 == 0);//AE
    }
}
