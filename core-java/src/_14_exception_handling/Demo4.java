package _14_exception_handling;

public class Demo4 {
    public static void main(String[] args) {
        //try catch
        System.out.println("****"); //yes

        try {
            System.out.println(10 / 0);//problem
            System.out.println("try rest");
        }
        //custom exception handler which will catch the exception object
        catch (ArithmeticException e) {
            System.out.println("invalid denominator");
            //System.exit(0);
        }

        System.out.println("rest of the main"); //no
        System.out.println("rest of the main"); //no
    }
}
