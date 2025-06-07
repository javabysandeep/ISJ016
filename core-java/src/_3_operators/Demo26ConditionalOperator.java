package _3_operators;

public class Demo26ConditionalOperator {
    public static void main(String[] args) {

        int number = 10;
        System.out.println(true ? true : false);//true
        System.out.println(false ? false : true);//true

        System.out.println(number % 2 == 0 ? "Even number" : "odd number");

    }
}
