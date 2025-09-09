package _14_exception_handling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException ae) {
                System.out.println("inner catch");
            }
            System.out.println("outer try");
        } catch (ArithmeticException ae) {
            System.out.println("outer catch");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Rest of the main");
    }
}
//output
    //inner catch
    //outer try
    //finally
    //rest of the main