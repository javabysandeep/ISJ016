package _3_operators;

public class Demo3ArithmeticOperators {
    public static void main(String[] args) {
        //LR - BODMAS
        System.out.println(10 + 20 - 10 * 10 / 1 + 10);//-60
        System.out.println(10 + (20 - 10) * 10 / 1 + 10);//120
        //System.out.println(10/0);//ArithmeticException
        //System.out.println(10 % 0);//ArithmeticException
        //System.out.println('A' % 0);//ArithmeticException
        System.out.println(10.0f / 0);//Infinity
        System.out.println(10.0f % 0);//NaN
    }
}
