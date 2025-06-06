package _3_operators;

public class Demo5AssignmentOperator {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1 * 2;
        int number3 = number2;
        int number4 = (int) Math.pow(2, 2);
        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);
        System.out.println("number3: " + number3);
        System.out.println("number4: " + number4);
        System.out.println(number1 = 1000);
        //System.out.println(100=100);//CTE

    }
}
