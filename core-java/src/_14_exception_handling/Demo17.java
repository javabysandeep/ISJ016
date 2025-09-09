package _14_exception_handling;

public class Demo17 {
    public static void main(String[] args) {
        //System.out.println(10/0);
        throw new ArithmeticException("/ by zero");
        //System.out.println("Rest of the main");
    }
}
