package _14_exception_handling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2};
            System.out.println(array[1]);
            System.out.println(10 / 0);
            System.out.println("try block");//won't be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("aioube catch block");
        } catch (ArithmeticException e) {
            System.out.println("arithmetic catch block");
        }

        System.out.println("rest of the main");
    }
}

//output :
//2
//arithmetic catch block
//rest of the main
