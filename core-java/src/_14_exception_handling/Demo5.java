package _14_exception_handling;

public class Demo5 {
    public static void main(String[] args) {
        try {
            int[] array = {1,2};
            System.out.println(array[5]);//AIOBE
            System.out.println("try block");//won't be executed
        } catch (ArithmeticException e) {
            System.out.println("catch block");
        }
        System.out.println("rest of the main");
    }
}

//output :
// there is no handler for AIOBE
//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2
