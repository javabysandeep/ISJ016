package _14_exception_handling;

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a / b); //Arithmetic

            String str = "null";
            System.out.println(str.length()); //NullPointer

            int[] array = {1};
            System.out.println(array[1]); //ArrayIndexOutBouds
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println("exception handling logic for all issues");
        }
        System.out.println("rest of the main");
    }
}
