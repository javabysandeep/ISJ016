package _4_controlStatements._2_looping._1_forDemos;

public class Demo18Factorial {
    public static void main(String[] args) {
        int number = 6;
        //6! = 6 * 5 * 4 * 3 * 2 * 1 ---> 720
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
    }
    //120
}
