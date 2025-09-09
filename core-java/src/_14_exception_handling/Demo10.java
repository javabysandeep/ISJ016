package _14_exception_handling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
//output :
//catch block
// finally block
// rest of the main
