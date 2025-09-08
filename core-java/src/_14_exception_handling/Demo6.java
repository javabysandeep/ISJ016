package _14_exception_handling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            int[] array = {1,2};
            System.out.println(array[5]);//AIOBE
            System.out.println("try block");//won't be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch block");
        }
        System.out.println("rest of the main");
    }
}

//output :
//catch block
//rest of the main
