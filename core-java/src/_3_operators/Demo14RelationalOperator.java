package _3_operators;

public class Demo14RelationalOperator {
    public static void main(String[] args) {
        int number = 2025;
        System.out.println(number % 400 == 0);//false
        System.out.println(number % 4 == 0);//false
        System.out.println(number % 100 != 0);//true
        System.out.println(10 % 3 != 1);//false
    }
}
